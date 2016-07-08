package com.example.alina.feedreedview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alina.feedreedview.R;
import com.example.alina.feedreedview.service.beans.NASAFeed;
import com.squareup.picasso.Picasso;

import java.util.List;

public class FeedListAdapter extends BaseAdapter {
    // Declare Variables
    Context context;
    LayoutInflater inflater;
    NASAFeed.FeedInfo selectedFeed;
    private List<NASAFeed.FeedInfo> lstFeedData = null;
    private OnSelectedListener eventListener = null;

    public FeedListAdapter(Context context, List<NASAFeed.FeedInfo> lstFeeds) {
        this.context = context;
        this.lstFeedData = lstFeeds;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return lstFeedData.size();
    }

    @Override
    public Object getItem(int position) {
        return lstFeedData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.feedlistcell, null);
            holder.txt_name = (TextView) view.findViewById(R.id.GroupName);
            holder.txt_unRead = (TextView) view.findViewById(R.id.unReadNum);
            holder.img_Group = (ImageView) view.findViewById(R.id.GroupImage);
            holder.img_unRead = (ImageView) view.findViewById(R.id.unReadeImage);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        selectedFeed = lstFeedData.get(position);
        holder.txt_name.setText(selectedFeed.title);
        Picasso.with(context).load(selectedFeed.enclosure.link).into(holder.img_Group);
        holder.img_unRead.setVisibility(View.VISIBLE);
        holder.txt_unRead.setVisibility(View.VISIBLE);
        holder.txt_unRead.setText(String.format("%d", 3));
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if (eventListener != null) {
                    eventListener.onSelectEvent(position, true);
                }
            }
        });
        return view;
    }

    public void setOnEventListener(OnSelectedListener listener) {
        eventListener = listener;
    }

    public interface OnSelectedListener {
        void onSelectEvent(int position, Boolean state);
    }

    public class ViewHolder {
        TextView txt_name;
        TextView txt_unRead;
        ImageView img_unRead;
        ImageView img_Group;
    }
}
