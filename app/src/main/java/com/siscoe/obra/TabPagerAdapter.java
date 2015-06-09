package com.siscoe.obra;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.siscoe.obra.ui.ObraDetalleActivity;
import com.siscoe.obra.ui.ObraImageActivity;
import com.siscoe.obra.ui.ObraListadoActivity;

/**
 * Created by manuonda on 09/06/15.
 */
public class TabPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    public TabPagerAdapter(FragmentManager fm,CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);
        this.Titles=mTitles;
        this.NumbOfTabs=mNumbOfTabsumb;

    }

    @Override
    public Fragment getItem(int position) {

        System.out.println("position : "+position);
        switch (position)
        {

            case 0: return new ObraDetalleActivity();
            case 1: return new ObraImageActivity();
            case 2: return new ObraListadoActivity();


        }

        return null;
    }
// This method return the titles for the Tabs in the Tab Strip

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip

    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}
