package com.example.shreeghanesh.myapplication.application;

import android.app.Application;

import com.example.shreeghanesh.myapplication.Di.ApiComponent;
import com.example.shreeghanesh.myapplication.Di.DaggerApiComponent;
import com.example.shreeghanesh.myapplication.Di.DaggerNetworkComponent;
import com.example.shreeghanesh.myapplication.Di.NetworkComponent;
import com.example.shreeghanesh.myapplication.Di.NetworkModule;

public class FlowerApplication extends Application {
    private ApiComponent component;

    @Override
    public void onCreate() {
        resolveDependency();
        super.onCreate();
    }

    private void resolveDependency() {
        component = DaggerApiComponent.builder().networkComponent(getNetworkComponent()).build();
    }

    private NetworkComponent getNetworkComponent() {
        NetworkComponent networkComponent = DaggerNetworkComponent.builder().networkModule(new NetworkModule("some URL")).build();
        return networkComponent;
    }

    public ApiComponent getComponent() {
        return component;
    }
}
