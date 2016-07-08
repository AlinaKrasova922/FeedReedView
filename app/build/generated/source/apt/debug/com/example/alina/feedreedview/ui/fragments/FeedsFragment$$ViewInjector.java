// Generated code from Butter Knife. Do not modify!
package com.example.alina.feedreedview.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class FeedsFragment$$ViewInjector<T extends com.example.alina.feedreedview.ui.fragments.FeedsFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492984, "field 'mListFeed'");
    target.mListFeed = finder.castView(view, 2131492984, "field 'mListFeed'");
  }

  @Override public void reset(T target) {
    target.mListFeed = null;
  }
}
