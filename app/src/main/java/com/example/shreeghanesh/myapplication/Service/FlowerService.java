package com.example.shreeghanesh.myapplication.Service;

import com.example.shreeghanesh.myapplication.Model.FlowerResponse;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface FlowerService {

    @GET("/feeds/flowers.json")
    Observable<List<FlowerResponse>> getFlowers();
}
