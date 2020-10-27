package com.TritonHalley.shop.view.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.TritonHalley.shop.R;


public class MainpageFragment extends Fragment {



    public MainpageFragment() {
        // Required empty public constructor
    }


    public static MainpageFragment newInstance() {
        MainpageFragment fragment = new MainpageFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mainpage, container, false);
    }
}