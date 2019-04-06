package com.example.baz_internal;

import com.example.baz_public.BazComponent;

import dagger.Component;

@Component()
public interface BazComponentImpl extends BazComponent {
    BazCoordinatorImpl resolveBazCoordinator();
}
