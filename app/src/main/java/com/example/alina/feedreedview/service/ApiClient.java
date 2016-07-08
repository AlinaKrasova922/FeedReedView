package com.example.alina.feedreedview.service;

import com.example.alina.feedreedview.service.beans.NASAFeed;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

public interface ApiClient {
    @GET("/api.json")
    void getAllFeeds(
            @Query("rss_url") String rss_url,
            Callback<NASAFeed> callback
    );
}
