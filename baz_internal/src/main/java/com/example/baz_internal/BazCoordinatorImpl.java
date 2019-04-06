package com.example.baz_internal;

import android.util.Log;

import com.example.baz_public.BazCoordinator;

import javax.inject.Inject;


public class BazCoordinatorImpl implements BazCoordinator {

    @Inject
    public BazCoordinatorImpl(BazDependency bazDependency) {
        Log.d("daggertest", "BazCoordinatorImpl() called with: bazDependency = [" + bazDependency + "]");
    }

    @Override
    public void baz() {
        Log.d("daggertest", "baz: " + this);
    }
}
