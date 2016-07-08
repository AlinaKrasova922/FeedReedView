package com.example.alina.feedreedview;

import com.example.alina.feedreedview.App.AppComponent;
import com.example.alina.feedreedview.service.ApiClient;
import com.example.alina.feedreedview.ui.MainActivity;
import com.example.alina.feedreedview.ui.fragments.FeedsFragment;
import com.example.alina.feedreedview.ui.fragments.FeedsFragment_MembersInjector;
import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerApp_AppComponent implements AppComponent {
  private Provider<ApiClient> provideApiClientProvider;
  private MembersInjector<FeedsFragment> feedsFragmentMembersInjector;

  private DaggerApp_AppComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.provideApiClientProvider = ScopedProvider.create(AppModule_ProvideApiClientFactory.create(builder.appModule));
    this.feedsFragmentMembersInjector = FeedsFragment_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideApiClientProvider);
  }

  @Override
  public void inject(App app) {  
    MembersInjectors.noOp().injectMembers(app);
  }

  @Override
  public void inject(MainActivity mainActivity) {  
    MembersInjectors.noOp().injectMembers(mainActivity);
  }

  @Override
  public void inject(FeedsFragment feedsFragment) {  
    feedsFragmentMembersInjector.injectMembers(feedsFragment);
  }

  public static final class Builder {
    private AppModule appModule;
  
    private Builder() {  
    }
  
    public AppComponent build() {  
      if (appModule == null) {
        throw new IllegalStateException("appModule must be set");
      }
      return new DaggerApp_AppComponent(this);
    }
  
    public Builder appModule(AppModule appModule) {  
      if (appModule == null) {
        throw new NullPointerException("appModule");
      }
      this.appModule = appModule;
      return this;
    }
  }
}

