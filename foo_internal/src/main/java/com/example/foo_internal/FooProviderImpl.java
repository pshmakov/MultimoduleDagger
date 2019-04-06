package com.example.foo_internal;

import com.example.bar_public.BarComponent;
import com.example.baz_public.BazComponent;
import com.example.foo_public.FooComponent;

public class FooProviderImpl {
    public static FooComponent getComponent(BarComponent barComponent, BazComponent bazComponent) {
        return DaggerFooComponentImpl.builder()
                .barComponent(barComponent)
                .bazComponent(bazComponent)
                .build();
    }
}
