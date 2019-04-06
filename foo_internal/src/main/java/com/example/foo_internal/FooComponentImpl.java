package com.example.foo_internal;

import com.example.bar_public.BarComponent;
import com.example.baz_public.BazComponent;
import com.example.foo_public.FooComponent;

import dagger.Component;

@Component(dependencies = {BarComponent.class, BazComponent.class})
public interface FooComponentImpl extends FooComponent {
    FooCoordinatorImpl resolveFooCoordinator();
}
