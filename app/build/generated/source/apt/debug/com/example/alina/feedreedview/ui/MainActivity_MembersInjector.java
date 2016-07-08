package com.example.alina.feedreedview.ui;

import android.support.v7.app.AppCompatActivity;
import com.example.alina.feedreedview.service.ApiClient;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final MembersInjector<AppCompatActivity> supertypeInjector;
  private final Provider<ApiClient> apiClientProvider;

  public MainActivity_MembersInjector(MembersInjector<AppCompatActivity> supertypeInjector, Provider<ApiClient> apiClientProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert apiClientProvider != null;
    this.apiClientProvider = apiClientProvider;
  }

  @Override
  public void injectMembers(MainActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.apiClient = apiClientProvider.get();
  }

  public static MembersInjector<MainActivity> create(MembersInjector<AppCompatActivity> supertypeInjector, Provider<ApiClient> apiClientProvider) {  
      return new MainActivity_MembersInjector(supertypeInjector, apiClientProvider);
  }
}

