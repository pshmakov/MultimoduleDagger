package com.example.foo_public;

import com.example.bar_public.BarComponent;
import com.example.baz_public.BazComponent;

public class FooProvider {

    public static FooComponent getComponent(BarComponent barComponent, BazComponent bazComponent) {
        // With jar exclusion trick this would just return null.

        // But do we even need this (reflection or jar exclusion)?
        // The top-level build target needs to depend on all the "internal" modules anyway, so
        // why not use FooFactoryImpl directly?

        try {
            return (FooComponent) Class.forName("com.example.foo_internal.FooProviderImpl")
                    .getMethod("getComponent", BarComponent.class, BazComponent.class)
                    .invoke(null, barComponent, bazComponent);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
