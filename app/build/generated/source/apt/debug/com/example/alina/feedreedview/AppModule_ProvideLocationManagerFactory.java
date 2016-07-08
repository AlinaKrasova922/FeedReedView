package com.example.alina.feedreedview;

import android.location.LocationManager;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AppModule_ProvideLocationManagerFactory implements Factory<LocationManager> {
  private final AppModule module;

  public AppModule_ProvideLocationManagerFactory(AppModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public LocationManager get() {  
    LocationManager provided = module.provideLocationManager();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<LocationManager> create(AppModule module) {  
    return new AppModule_ProvideLocationManagerFactory(module);
  }
}

