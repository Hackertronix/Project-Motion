package com.execube.genesis.network;

import com.execube.genesis.model.TMDBResponse;
import com.execube.genesis.utils.AppConstants;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by hackertronix on 05/08/17.
 */

public interface API {

    @GET(AppConstants.POPULAR)
    Call<TMDBResponse> fetchPopularMovies(@Query("api_key") String API_KEY, @Query("sort_by") String SORT_BY, @Query("page") int page);

    @GET(AppConstants.TOP_RATED)
    Call<TMDBResponse> fetchTopRatedMovies(@Query("api_key") String API_KEY, @Query("sort_by") String SORT_BY, @Query("page") int page);


    public static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(AppConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
