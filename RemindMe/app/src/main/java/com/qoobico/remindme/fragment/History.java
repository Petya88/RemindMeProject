package com.qoobico.remindme.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qoobico.remindme.R;


public class History extends AbstractTabFragment {
    private static final int LAYOUT = R.layout.fragment_example;

    public static History getInstance(Context context) {
        Bundle args = new Bundle();
        History fragment = new History();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_view_navigation_history));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}

