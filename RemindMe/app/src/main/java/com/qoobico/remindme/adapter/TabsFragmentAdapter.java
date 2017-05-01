package com.qoobico.remindme.adapter;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.qoobico.remindme.R;
import com.qoobico.remindme.fragment.AbstractTabFragment;
import com.qoobico.remindme.fragment.Birthdays;
import com.qoobico.remindme.fragment.History;
import com.qoobico.remindme.fragment.Ideas;
import com.qoobico.remindme.fragment.Todo;

import java.util.HashMap;
import java.util.Map;

public class TabsFragmentAdapter extends FragmentPagerAdapter{

    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabMap(context);
    }

    @Override
    public Fragment getItem(int position) {

        return tabs.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return tabs.get(position).getTitle();
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, History.getInstance(context));
        tabs.put(1, Ideas.getInstance(context));
        tabs.put(2, Todo.getInstance(context));
        tabs.put(3, Birthdays.getInstance(context));
    }
}
