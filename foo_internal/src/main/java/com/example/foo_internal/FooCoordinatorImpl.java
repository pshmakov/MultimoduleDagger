package com.example.foo_internal;

import android.util.Log;

import com.example.bar_public.BarCoordinator;
import com.example.baz_public.BazCoordinator;
import com.example.foo_public.FooCoordinator;

import javax.inject.Inject;


public class FooCoordinatorImpl implements FooCoordinator {

    private final BazCoordinator mBazCoordinator;

    @Inject
    public FooCoordinatorImpl(FooDependency fooDependency,
                              BarCoordinator barCoordinator,
                              BazCoordinator bazCoordinator) {
        Log.d("daggertest", "FooCoordinatorImpl() called with: fooDependency = [" + fooDependency + "], barCoordinator = [" + barCoordinator + "], bazCoordinator = [" + bazCoordinator + "]");
        mBazCoordinator = bazCoordinator;
    }

    @Override
    public void foo() {
        Log.d("daggertest", "foo: " + this);
        mBazCoordinator.baz();
    }
}
