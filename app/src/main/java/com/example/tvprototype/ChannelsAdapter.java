package com.example.tvprototype;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChannelsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private ArrayList<String> channels;

    ChannelsAdapter(Context context,ArrayList<String> channelList) {
        mContext = context;
        this.channels = channelList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecyclerViewHolder(View.inflate(mContext, R.layout.channel_item, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        final RecyclerViewHolder viewHolder = (RecyclerViewHolder) holder;
        viewHolder.channelName.setText(channels.get(position));
    }

    @Override
    public int getItemCount() {
        return channels.size();
    }

    private class RecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView channelName;

        RecyclerViewHolder(View itemView) {
            super(itemView);
            channelName = (TextView) itemView.findViewById(R.id.tvChannelName);
        }
    }

}
