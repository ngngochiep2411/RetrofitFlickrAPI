package com.example.retrofitflickrapi.Interface;

import com.example.retrofitflickrapi.Model.Comment.Comment;
import com.example.retrofitflickrapi.Model.Favorite.Example;
import com.example.retrofitflickrapi.Model.Galleries.Galleries;
import com.example.retrofitflickrapi.Model.PhotoGalleries.PhotoGalleries;
import com.example.retrofitflickrapi.Model.PhotoGalleries.Photos2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {
    @GET("services/rest/")
    Call<Example> getListFavo(@Query("extras") String extras,
                              @Query("nojsoncallback") String nojsoncallback,
                              @Query("user_id") String user_id,
                              @Query("format") String format,
                              @Query("api_key") String api_key,
                              @Query("method") String method,
                              @Query("page") int page,
                              @Query("per_page") int per_page);

    @GET("services/rest/")
    Call<Galleries> getListgalleries(@Query("method") String method,
                              @Query("api_key") String api_key,
                              @Query("user_id") String user_id,
                              @Query("per_page") int per_page,
                              @Query("page") int page,
                              @Query("format") String format,
                              @Query("nojsoncallback") int nojsoncallback
                              );

    @GET("services/rest")
    Call<PhotoGalleries> getPhotoGalleries(@Query("method") String method,
                                           @Query("api_key") String api_key,
                                           @Query("gallery_id") String gallery_id,
                                           @Query("extras") String extras,
                                           @Query("per_page") int per_page,
                                           @Query("page") int page,
                                           @Query("format") String format,
                                           @Query("nojsoncallback") int nojsoncallback);


    //https://www.flickr.com/services/rest/?method=flickr.photos.comments.getList
    // &api_key=3633bfecbf708e160211dc18d56060c3&photo_id=51192760857&format=json&nojsoncallback=1
    @GET("services/rest")
    Call<Comment> getListComment(@Query("method") String method,
                                 @Query("api_key") String api_key,
                                 @Query("photo_id") String photo_id,
                                 @Query("format") String format,
                                 @Query("nojsoncallback") int nojsoncallback
                                           );
}
