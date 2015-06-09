package com.siscoe.obra.ui;


import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;

import com.siscoe.R;
import com.siscoe.common.view.SlidingTabLayout;
import com.siscoe.obra.TabPagerAdapter;

import static com.siscoe.R.*;

/**
 * Created by manuonda on 07/06/15.
 */
public class ObraTabActivity extends FragmentActivity
{

    private ViewPager viewPager;
    private TabPagerAdapter mAdapter;
    ActionBar actionBar;
    SlidingTabLayout tabs;
    // Tab titles
    CharSequence Titles[]={"Detalle","Listado","Images"};
    int Numboftabs =3;


    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.obra_frg_principal);

        //initialization
        viewPager=(ViewPager)findViewById(R.id.pager);
        //actionBar = getActionBar();

        mAdapter=new TabPagerAdapter(getSupportFragmentManager(),Titles,Numboftabs);
        System.out.println("mAdapter : "+mAdapter);
        System.out.println("viewPager : "+viewPager);
        viewPager.setAdapter(mAdapter);

        //actionBar.setHomeButtonEnabled(true);
        //actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Adding Tabs


        // Assiging the Sliding Tab Layout View
        tabs = (SlidingTabLayout) findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true); // To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width

        // Setting Custom Color for the Scroll bar indicator of the Tab View
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(color.abc_search_url_text_pressed);
            }
        });

        // Setting the ViewPager For the SlidingTabsLayout
        tabs.setViewPager(viewPager);


    }



}
