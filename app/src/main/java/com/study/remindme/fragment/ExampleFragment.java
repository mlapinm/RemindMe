package com.study.remindme.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.study.remindme.R;

public class ExampleFragment extends Fragment {
    public static final int LAYOUT = R.layout.fragment_layout;

    private View view;

    public static ExampleFragment getInstance() {
        Bundle args = new Bundle();
        ExampleFragment fragment = new ExampleFragment();
        fragment.setArguments(args);

        return fragment;
    }


    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        //view = inflater.inflate(LAYOUT, container);
        //view = inflater.from(getContext()).inflate(LAYOUT, container);
        view = inflater.inflate(LAYOUT, container,false);
        return view;
    }
}
