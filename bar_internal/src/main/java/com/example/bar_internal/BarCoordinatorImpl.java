package com.example.bar_internal;

import android.util.Log;

import com.example.bar_public.BarCoordinator;
import com.example.baz_public.BazCoordinator;


public class BarCoordinatorImpl implements BarCoordinator {

    private final BazCoordinator mBazCoordinator;

    public BarCoordinatorImpl(BarDependency barDependency, BazCoordinator bazCoordinator) {
        Log.d("daggertest", "BarCoordinatorImpl() called with: barDependency = [" + barDependency + "], bazCoordinator = [" + bazCoordinator + "]");
        mBazCoordinator = bazCoordinator;
    }

    @Override
    public void bar() {
        Log.d("daggertest", "bar: " + this);
        mBazCoordinator.baz();
    }
}
