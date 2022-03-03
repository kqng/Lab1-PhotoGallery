package com.example.photogallery.api

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
        "&api_key=752f01a509c8d30c7981e0cadeca367c" + "&format=json" + "&nojsoncallback=1" + "&extras=url_s"
    )
    fun fetchPhotos(): Call<FlickrResponse>
}