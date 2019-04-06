package com.example.bar_internal;

import com.example.bar_public.BarComponent;
import com.example.bar_public.BarProvider;
import com.example.baz_public.BazComponent;

public class BarProviderImpl extends BarProvider {

    public static BarComponent getComponent(BazComponent bazComponent) {
        return new BarComponentImpl(bazComponent);
    }
}
