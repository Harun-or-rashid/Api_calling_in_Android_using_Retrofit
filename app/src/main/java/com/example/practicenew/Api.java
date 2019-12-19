package com.example.practicenew;
//created a Api interface java class
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
/*Define Base URL Of The API*/
    String BASE_URL="https://simplifiedcoding.net/demos/";
    /*Define the root name or name the api*/
    @GET("marvel")
    /*Created a method for getting data from JAVA class which name is Movie*/
    Call<List<Movie>> getMovies() ;
}
