package com.study.remindme.fragment;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.study.remindme.R;

public class HistoryFragment extends AbstractTabFragment {
    public static final int LAYOUT = R.layout.fragment_layout;



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
        //view = inflater.inflate(LAYOUT, container);
        //view = inflater.from(getContext()).inflate(LAYOUT, container);
        view = inflater.inflate(LAYOUT, container,false);
        return view;
    }
}
