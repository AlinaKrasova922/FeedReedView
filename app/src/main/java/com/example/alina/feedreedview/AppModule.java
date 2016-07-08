package com.example.alina.feedreedview;

import android.content.Context;

import com.example.alina.feedreedview.annotations.ForApplication;
import com.example.alina.feedreedview.service.ApiClient;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;

@Module
public class AppModule {
    private final App app;

    public AppModule(App app) {
        this.app = app;
    }

    @Provides
    @Singleton
    @ForApplication
    Context provideApplicationContext() {
        return app;
    }

    @Provides
    @Singleton
    ApiClient provideApiClient() {
        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint(Constants.API_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
        return adapter.create(ApiClient.class);
    }
}
