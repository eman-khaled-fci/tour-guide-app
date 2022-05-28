package com.example.tourguide;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FixedTabsPagerAdapter extends FragmentPagerAdapter {
    private static final String[] tabTitles = MainActivity.context.getResources().getStringArray(R.array.tabs);

    public FixedTabsPagerAdapter(Context mcontext, FragmentManager fm) {
        super(fm);
        MainActivity.context = mcontext;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Sightseeing();
            case 1:
                return new Hotels();
            case 2:
                return new Food();
            case 3:
                return new Restaurants();

            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}

