package com.TritonHalley.shop.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.TritonHalley.shop.R;
import com.TritonHalley.shop.databinding.MainPageActivityBinding;
import com.google.android.material.tabs.TabLayout;

public class mainPageActivity extends AppCompatActivity {

    private MainPageActivityBinding mBinding ;
    private TabLayout mTabLayout;
    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, mainPageActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.main_page_activity);
        setTabs();
    }
    private void setTabs(){
        mTabLayout = new TabLayout(this);
        mTabLayout.addTab(mTabLayout.newTab().setText("خانه"));
        mTabLayout.addTab(mTabLayout.newTab().setText("دسته بندی ها"));
        mTabLayout.addTab(mTabLayout.newTab().setText("سبد خرید"));
        mTabLayout.addTab(mTabLayout.newTab().setText("دیجی کالای من"));

    }
}
