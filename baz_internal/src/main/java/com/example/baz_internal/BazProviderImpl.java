package com.example.baz_internal;

import com.example.baz_public.BazComponent;

public class BazProviderImpl {

    public static BazComponent getComponent() {
        return DaggerBazComponentImpl.create();
    }
}
