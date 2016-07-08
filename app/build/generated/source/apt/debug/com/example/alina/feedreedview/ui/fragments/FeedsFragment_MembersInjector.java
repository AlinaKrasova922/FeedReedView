package com.example.alina.feedreedview.ui.fragments;

import android.support.v4.app.Fragment;
import com.example.alina.feedreedview.service.ApiClient;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class FeedsFragment_MembersInjector implements MembersInjector<FeedsFragment> {
  private final MembersInjector<Fragment> supertypeInjector;
  private final Provider<ApiClient> apiClientProvider;

  public FeedsFragment_MembersInjector(MembersInjector<Fragment> supertypeInjector, Provider<ApiClient> apiClientProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert apiClientProvider != null;
    this.apiClientProvider = apiClientProvider;
  }

  @Override
  public void injectMembers(FeedsFragment instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.apiClient = apiClientProvider.get();
  }

  public static MembersInjector<FeedsFragment> create(MembersInjector<Fragment> supertypeInjector, Provider<ApiClient> apiClientProvider) {  
      return new FeedsFragment_MembersInjector(supertypeInjector, apiClientProvider);
  }
}

