package com.example.alina.feedreedview;

import com.example.alina.feedreedview.service.ApiClient;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AppModule_ProvideApiClientFactory implements Factory<ApiClient> {
  private final AppModule module;

  public AppModule_ProvideApiClientFactory(AppModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public ApiClient get() {  
    ApiClient provided = module.provideApiClient();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<ApiClient> create(AppModule module) {  
    return new AppModule_ProvideApiClientFactory(module);
  }
}

