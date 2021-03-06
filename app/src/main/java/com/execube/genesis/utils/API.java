package com.execube.genesis.utils;

/**
 * Created by Prateek Phoenix on 4/24/2016.
 */
public class API {



    //Make sure you disable Instant Run on Android Studio before building the project
    //This project uses SugarORM for Data Persistence and the library is currently incompatible with Instant Run

    public static final String BASE_URL = "http://api.themoviedb.org/3/movie";
    public static final String TOP_RATED = "/top_rated";
    public static final String POPULAR = "/popular";
    public static final String API_KEY = "?api_key=a98debe57ccd9b42fe6b99b9014c80e3";
    public static final String SORT_POPULARITY = "&sort_by=popularity.desc";
    public static final String SORT_R_RATED = "&certification_country=US&certification=R&sort_by=vote_average.desc&vote_count.gte=250";
    public static final String IMAGE_URL = "http://image.tmdb.org/t/p/";
    public static final String IMAGE_SIZE_500 = "w500/"; //Because nobody likes blurry images

    //STAGE 2 ENDPOINTS

    public static final String MOVIES_BASE_URL="http://api.themoviedb.org/3/movie/"; //APPEND MOVIE ID AND API KEY
    public static final String YOUTUBE_THUMBNAIL_URL="http://img.youtube.com/vi/"; // APPEND MOVIE KEY AND QUALITY
    public static final String YOUTUBE_TRAILER_URL="https://www.youtube.com/watch?v=";
    public static final String THUMBNAIL_QUALITY="/hqdefault.jpg";


   }
