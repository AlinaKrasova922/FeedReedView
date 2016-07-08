package com.example.alina.feedreedview.ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alina.feedreedview.R;
import com.example.alina.feedreedview.service.beans.NASAFeed;
import com.example.alina.feedreedview.utils.Utils;
import com.squareup.picasso.Picasso;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class InfoFragment extends Fragment {

    @InjectView(R.id.InfoTitle)
    TextView infoTitle;

    @InjectView(R.id.InfoDescription)
    TextView infoDescription;

    @InjectView(R.id.InfoPubDate)
    TextView infoPubDate;

    @InjectView(R.id.InfoImage)
    ImageView infoImage;

    @InjectView(R.id.InfoLink)
    Button infoLink;

    @InjectView(R.id.InfoGuide)
    Button infoGuide;


    View view;
    NASAFeed.FeedInfo selectedFeed;
    int feedIndex;
    Context mContext;

    public static InfoFragment newInstance(String param1) {
        InfoFragment fragment = new InfoFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_info, container, false);
        ButterKnife.inject(this, view);
        mContext = getActivity();
        updateContent();
        return view;
    }

    public void updateContent() {
        if (Utils.lstFeed == null)
            return;
        feedIndex = Utils.selectedFeedIndex;
        selectedFeed = Utils.lstFeed.get(feedIndex);
        infoTitle.setText(selectedFeed.title);
        Picasso.with(mContext).load(selectedFeed.enclosure.link).into(infoImage);
        infoDescription.setText(selectedFeed.description);
        infoPubDate.setText(selectedFeed.pubDate);
        infoLink.setText(selectedFeed.link);
        infoGuide.setText(selectedFeed.guid);
    }

    @OnClick(R.id.InfoLink)
    void onLink() {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(selectedFeed.link));
        startActivity(browserIntent);
    }

    @OnClick(R.id.InfoGuide)
    void onGuide() {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(selectedFeed.guid));
        startActivity(browserIntent);
    }

}
