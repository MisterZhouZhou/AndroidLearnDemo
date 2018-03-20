package com.example.zw.androidlearndemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

/**
 * Created by zw on 2018/3/20.
 */

public class SwitchDemoActivity extends AppCompatActivity {
    private Switch mTest1Switch;
    private Switch mTest2Switch;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swichdemo);
        initView();
        initListener();
    }

    private void initView() {
        this.mTest1Switch = (Switch) findViewById(R.id.switch_test1);
        this.mTest2Switch = (Switch) findViewById(R.id.switch_test2);
    }

    private void initListener() {
        this.mTest1Switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String btnText = ((Switch)buttonView).getTextOff().toString();
                if(isChecked){
                    btnText = ((Switch)buttonView).getTextOn().toString();
                }
                toast(btnText + isChecked);
            }
        });
        this.mTest2Switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String btnText = ((Switch)buttonView).getTextOff().toString();
                if (isChecked) {
                    btnText = ((Switch)buttonView).getTextOn().toString();
                }
                toast(btnText + isChecked);
            }
        });
    }


    private void toast(String str) {
        Toast.makeText(this, str, Toast.LENGTH_LONG).show();
    }

}
