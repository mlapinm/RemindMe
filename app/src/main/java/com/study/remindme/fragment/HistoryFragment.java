package com.study.remindme.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.study.remindme.R;
import com.study.remindme.adapter.RemindListAdapter;
import com.study.remindme.dto.RemindDTO;

import java.util.ArrayList;
import java.util.List;

public class HistoryFragment extends AbstractTabFragment {
    public static final int LAYOUT = R.layout.fragment_history;



    public static HistoryFragment getInstance(Context context) {

        Bundle args = new Bundle();
        HistoryFragment fragment = new HistoryFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_history));

        return fragment;
    }

    public void setContext(Context context) {
        this.context = context;
    }


    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container,false);
        RecyclerView rv =(RecyclerView) view.findViewById(R.id.recycleView);
        rv.setLayoutManager(new LinearLayoutManager(context));
        rv.setAdapter(new RemindListAdapter(createMockRemindListData()));
        return view;
    }

    private List<RemindDTO> createMockRemindListData() {
        List<RemindDTO> data = new ArrayList<RemindDTO>();
        data.add(new RemindDTO("Item 1"));
        data.add(new RemindDTO("Item 2"));
        data.add(new RemindDTO("Item 3"));
        data.add(new RemindDTO("Item 4"));
        return  data;
    }
}
