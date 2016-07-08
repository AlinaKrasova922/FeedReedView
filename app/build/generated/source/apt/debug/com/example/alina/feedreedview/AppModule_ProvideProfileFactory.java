package com.example.alina.feedreedview;

import com.example.alina.feedreedview.data.Profile;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AppModule_ProvideProfileFactory implements Factory<Profile> {
  private final AppModule module;

  public AppModule_ProvideProfileFactory(AppModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Profile get() {  
    Profile provided = module.provideProfile();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Profile> create(AppModule module) {  
    return new AppModule_ProvideProfileFactory(module);
  }
}

