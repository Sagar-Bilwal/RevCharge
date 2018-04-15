package com.example.sagar.evhack;

import com.example.sagar.evhack.model.Costumer;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by SAGAR on 15-04-2018.
 */

public interface BookAPI
{
    @GET("/show")
    Call<List<Costumer>> getBookings();
}
