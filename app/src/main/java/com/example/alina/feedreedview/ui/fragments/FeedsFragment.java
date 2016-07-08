package com.example.alina.feedreedview.ui.fragments;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.alina.feedreedview.App;
import com.example.alina.feedreedview.Constants;
import com.example.alina.feedreedview.R;
import com.example.alina.feedreedview.adapter.FeedListAdapter;
import com.example.alina.feedreedview.service.ApiClient;
import com.example.alina.feedreedview.service.beans.NASAFeed;
import com.example.alina.feedreedview.ui.InfoActivity;
import com.example.alina.feedreedview.utils.Utils;

import java.util.List;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class FeedsFragment extends Fragment implements Callback<NASAFeed>, FeedListAdapter.OnSelectedListener {

    @Inject
    ApiClient apiClient;
    View view;
    @InjectView(R.id.FeedList)
    ListView mListFeed;

    List<NASAFeed.FeedInfo> lstFeed;
    Context mContext;
    ProgressDialog pDialog;

    public static FeedsFragment newInstance(String param1) {
        FeedsFragment fragment = new FeedsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_feeds, container, false);
        ButterKnife.inject(this, view);
        ((App) getActivity().getApplication()).component().inject(this);

        mContext = getActivity();
        apiClient.getAllFeeds(Constants.FEED_URL, this);
        pDialog = new ProgressDialog(mContext);
        pDialog.setMessage("Looding...");
        pDialog.show();
        return view;
    }

    @Override
    public void success(NASAFeed feed, Response response) {
        pDialog.dismiss();
        lstFeed = feed.items;
        Utils.selectedFeedIndex = 0;
        Utils.lstFeed = lstFeed;
        FeedListAdapter groupListAdapter = new FeedListAdapter(mContext, lstFeed);
        mListFeed.setAdapter(groupListAdapter);
        groupListAdapter.setOnEventListener(this);
    }

    @Override
    public void failure(RetrofitError error) {
        // means there is no internet because we dont have status codes in backend
    }

    @Override
    public void onSelectEvent(int position, Boolean state) {

        Utils.selectedFeedIndex = position;
        Utils.lstFeed = lstFeed;
        InfoFragment infoFragment = (InfoFragment) getFragmentManager().findFragmentById(R.id.fragment_infocontainer);
        if (infoFragment == null) {
            Intent intent = new Intent(mContext, InfoActivity.class);
            startActivity(intent);
        } else {
            infoFragment.updateContent();
        }

    }

}
