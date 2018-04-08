package com.example.shreeghanesh.myapplication.Di;

import com.example.shreeghanesh.myapplication.MainActivity;

import dagger.Component;

@CustomScope
@Component(modules = ApiModule.class, dependencies = NetworkComponent.class)
public interface ApiComponent {
    void inject(MainActivity mainActivity);
}
