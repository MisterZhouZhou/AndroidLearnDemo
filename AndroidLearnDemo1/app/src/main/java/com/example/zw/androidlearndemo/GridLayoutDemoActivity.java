package com.example.zw.androidlearndemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.example.zw.androidlearndemo.Adapter.GridLayoutDemoPagerAdapter;

/**
 * Created by zw on 2018/3/20.
 */

public class GridLayoutDemoActivity extends AppCompatActivity {
    private static final int CONTENT_VP_ITEMARR_SIZE = 3;

    private ViewPager mContentVP;
    private View[] mContentVPItemArr;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridlayoutdemo);
        initView();
        initData();
    }

    private void initView() {
        this.mContentVP = (ViewPager) findViewById(R.id.vp_content);
        this.mContentVPItemArr = new View[CONTENT_VP_ITEMARR_SIZE];
        for (int i = 0; i < CONTENT_VP_ITEMARR_SIZE; i++) {
            mContentVPItemArr[i] = LayoutInflater.from(GridLayoutDemoActivity.this).inflate(R.layout.vp_item_gridlayoutdemo1 + i, null);
        }
    }

    private void initData() {
        this.mContentVP.setAdapter(new GridLayoutDemoPagerAdapter(mContentVPItemArr));
    }
}
