package com.example.bar_public;

import com.example.baz_public.BazComponent;

public class BarProvider {

    public static BarComponent getComponent(BazComponent bazComponent) {
        try {
            return (BarComponent) Class.forName("com.example.bar_internal.BarProviderImpl")
                    .getMethod("getComponent", BazComponent.class)
                    .invoke(null, bazComponent);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
