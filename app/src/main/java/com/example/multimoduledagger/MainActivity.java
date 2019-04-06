package com.example.multimoduledagger;

import android.app.Activity;
import android.os.Bundle;

import com.example.bar_public.BarComponent;
import com.example.bar_public.BarProvider;
import com.example.bar_public.BarCoordinator;
import com.example.baz_public.BazComponent;
import com.example.baz_public.BazProvider;
import com.example.foo_public.FooComponent;
import com.example.foo_public.FooProvider;
import com.example.foo_public.FooCoordinator;
import com.example.multimoduledaggerwithscopes.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BazComponent bazComponent = BazProvider.getComponent();
        BarComponent barComponent = BarProvider.getComponent(bazComponent);
        FooComponent fooComponent = FooProvider.getComponent(barComponent, bazComponent);

        FooCoordinator fooCoordinator = fooComponent.resolveFooCoordinator();
        fooCoordinator.foo();

        BarCoordinator barCoordinator = barComponent.resolveBarCoordinator();
        barCoordinator.bar();
    }
}
