package com.example.sagar.evhack;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by SAGAR on 15-04-2018.
 */

public class APIClient
{
    private static APIClient INSTANCE;
    private BookAPI movieDbAPI;
    private APIClient()
    {
        Retrofit retrofit= new Retrofit.Builder().baseUrl("https://enigmatic-oasis-30968.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        movieDbAPI = retrofit.create(BookAPI.class);
    }
    public static APIClient getInstance() {
        if(INSTANCE == null){
            INSTANCE = new APIClient();
        }
        return INSTANCE;
    }

    public BookAPI getMovieDbAPI() {
        return movieDbAPI;
    }
}
