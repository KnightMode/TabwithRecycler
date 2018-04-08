package com.example.shreeghanesh.myapplication.Di;

import com.example.shreeghanesh.myapplication.Model.FlowerResponse;
import com.example.shreeghanesh.myapplication.Service.FlowerService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class ApiModule {

    @Provides
    @CustomScope
    FlowerService getFlowerService(Retrofit retrofit) {
        return retrofit.create(FlowerService.class);
    }
}
