// Generated code from Butter Knife. Do not modify!
package com.example.alina.feedreedview.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MainActivity$$ViewInjector<T extends com.example.alina.feedreedview.ui.MainActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492944, "field 'mListGroup'");
    target.mListGroup = finder.castView(view, 2131492944, "field 'mListGroup'");
  }

  @Override public void reset(T target) {
    target.mListGroup = null;
  }
}
