package com.siscoe.obra.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.siscoe.R;

/**
 * Created by manuonda on 07/06/15.
 */
public class ObraImageActivity extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.obra_frg_image,container,false);
        return view;

    }
}
