package com.example.bar_internal;


import com.example.bar_public.BarComponent;
import com.example.bar_public.BarCoordinator;
import com.example.baz_public.BazComponent;

// Bar doesn't use Dagger, so this is a "manual" implementation of the component
public class BarComponentImpl implements BarComponent {

    private final BazComponent mBazComponent;

    public BarComponentImpl(BazComponent bazComponent) {
        mBazComponent = bazComponent;
    }

    @Override
    public BarCoordinator resolveBarCoordinator() {
        return new BarCoordinatorImpl(new BarDependency(),
                mBazComponent.resolveBazCoordinator());
    }
}
