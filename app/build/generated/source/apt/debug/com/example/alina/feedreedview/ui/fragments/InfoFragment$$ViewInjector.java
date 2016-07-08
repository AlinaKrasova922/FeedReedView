// Generated code from Butter Knife. Do not modify!
package com.example.alina.feedreedview.ui.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class InfoFragment$$ViewInjector<T extends com.example.alina.feedreedview.ui.fragments.InfoFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492985, "field 'infoTitle'");
    target.infoTitle = finder.castView(view, 2131492985, "field 'infoTitle'");
    view = finder.findRequiredView(source, 2131492988, "field 'infoDescription'");
    target.infoDescription = finder.castView(view, 2131492988, "field 'infoDescription'");
    view = finder.findRequiredView(source, 2131492987, "field 'infoPubDate'");
    target.infoPubDate = finder.castView(view, 2131492987, "field 'infoPubDate'");
    view = finder.findRequiredView(source, 2131492986, "field 'infoImage'");
    target.infoImage = finder.castView(view, 2131492986, "field 'infoImage'");
    view = finder.findRequiredView(source, 2131492989, "field 'infoLink' and method 'onLink'");
    target.infoLink = finder.castView(view, 2131492989, "field 'infoLink'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onLink();
        }
      });
    view = finder.findRequiredView(source, 2131492990, "field 'infoGuide' and method 'onGuide'");
    target.infoGuide = finder.castView(view, 2131492990, "field 'infoGuide'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onGuide();
        }
      });
  }

  @Override public void reset(T target) {
    target.infoTitle = null;
    target.infoDescription = null;
    target.infoPubDate = null;
    target.infoImage = null;
    target.infoLink = null;
    target.infoGuide = null;
  }
}
