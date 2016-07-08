package com.example.alina.feedreedview;

import android.app.Application;
import android.content.Context;

import com.example.alina.feedreedview.ui.MainActivity;
import com.example.alina.feedreedview.ui.fragments.FeedsFragment;

import javax.inject.Singleton;

import dagger.Component;

public class App extends Application {

    public AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApp_AppComponent.builder().appModule(new AppModule(this)).build();
        component().inject(this);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    public AppComponent component() {
        return component;
    }

    @Singleton
    @Component(modules = AppModule.class)
    public interface AppComponent {
        void inject(App app);

        void inject(MainActivity mainActivity);

        void inject(FeedsFragment feedsFragment);
    }
}
