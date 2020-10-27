package com.example.tvprototype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.tvprototype.utils.SpaceItemDecoration;

import java.util.ArrayList;

import app.com.tvrecyclerview.TvRecyclerView;

public class MainActivity extends AppCompatActivity {
    private TvRecyclerView mRecyclerViewChannels;
    private TvRecyclerView mRecyclerViewChannelProgram;
    private ArrayList<String> channelNames;
    private ArrayList<String> channelProgram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addChannels();
        addChannelProgram();
        mRecyclerViewChannels = findViewById(R.id.rvChannels);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1);
        gridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerViewChannels.setLayoutManager(gridLayoutManager);

        final int itemSpace = getResources().
                getDimensionPixelSize(R.dimen.recyclerView_item_space);
        mRecyclerViewChannels.addItemDecoration(new SpaceItemDecoration(itemSpace));

        ChannelsAdapter mAdapter = new ChannelsAdapter(this,channelNames);
        mRecyclerViewChannels.setAdapter(mAdapter);

        mRecyclerViewChannels.setOnItemStateListener(new TvRecyclerView.OnItemStateListener() {
            @Override
            public void onItemViewClick(View view, int position) {
                Log.d("PROBA","Kliknuo sam na " + Integer.toString(position));
            }

            @Override
            public void onItemViewFocusChanged(boolean gainFocus, View view, int position) {
                    if (gainFocus) {
                        view.setBackgroundColor(Color.parseColor("#03A9F4"));
                    } else {
                        view.setBackgroundColor(Color.parseColor("#F19918"));
                    }
            }
        });

        //---------------------------------------------------------------------------------------------------------------
        mRecyclerViewChannelProgram = findViewById(R.id.rvChannelProgram);
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(this,1);
        gridLayoutManager2.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerViewChannelProgram.setLayoutManager(gridLayoutManager2);

        int itemSpace2 = getResources().
                getDimensionPixelSize(R.dimen.recyclerView_item_space);
        mRecyclerViewChannelProgram.addItemDecoration(new SpaceItemDecoration(itemSpace2));

        ChannelsAdapter mAdapter2 = new ChannelsAdapter(this,channelProgram);
        mRecyclerViewChannelProgram.setAdapter(mAdapter2);

        mRecyclerViewChannelProgram.setOnItemStateListener(new TvRecyclerView.OnItemStateListener() {
            @Override
            public void onItemViewClick(View view, int position) {

            }

            @Override
            public void onItemViewFocusChanged(boolean gainFocus, View view, int position) {
                if(gainFocus){
                    view.setBackgroundColor(Color.parseColor("#64F118"));
                }else{
                    view.setBackgroundColor(Color.parseColor("#DA0E0E"));
                }
            }
        });


    }


    void addChannels(){
        channelNames = new ArrayList<String>();
        channelNames.add("ERmin");
        channelNames.add("Hara");
        channelNames.add("Fahro");
        channelNames.add("Beljo");
        channelNames.add("Yico");
        channelNames.add("ERmin");
        channelNames.add("Hara");
        channelNames.add("Fahro");
        channelNames.add("Beljo");
        channelNames.add("Yico");
        channelNames.add("ERmin");
        channelNames.add("Hara");
        channelNames.add("Fahro");
        channelNames.add("Beljo");
        channelNames.add("Yico");
        channelNames.add("ERmin");
        channelNames.add("Hara");
        channelNames.add("Fahro");
        channelNames.add("Beljo");
        channelNames.add("Yico");
        channelNames.add("ERmin");
        channelNames.add("Hara");
        channelNames.add("Fahro");
        channelNames.add("Beljo");
        channelNames.add("Yico");
    }

    void addChannelProgram(){
        channelProgram = new ArrayList<String>();
        channelProgram.add("Dnevnik");
        channelProgram.add("Pik");
        channelProgram.add("Bolnica");
        channelProgram.add("Ruza");
        channelProgram.add("Zmaj u gnjes");
        channelProgram.add("Dnevnik");
        channelProgram.add("Pik");
        channelProgram.add("Bolnica");
        channelProgram.add("Ruza");
        channelProgram.add("Zmaj u gnjes");
        channelProgram.add("Dnevnik");
        channelProgram.add("Pik");
        channelProgram.add("Bolnica");
        channelProgram.add("Ruza");
        channelProgram.add("Zmaj u gnjes");
        channelProgram.add("Dnevnik");
        channelProgram.add("Pik");
        channelProgram.add("Bolnica");
        channelProgram.add("Ruza");
        channelProgram.add("Zmaj u gnjes");
        channelProgram.add("Dnevnik");
        channelProgram.add("Pik");
        channelProgram.add("Bolnica");
        channelProgram.add("Ruza");
        channelProgram.add("Zmaj u gnjes");
        channelProgram.add("Dnevnik");
        channelProgram.add("Pik");
        channelProgram.add("Bolnica");
        channelProgram.add("Ruza");
        channelProgram.add("Zmaj u gnjes");

    }
}