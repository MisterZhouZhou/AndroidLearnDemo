package com.example.zw.androidlearndemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


   public void onClick(View v){
       switch (v.getId()){
           case R.id.btn_switchdemo:
               startSwitchDemo();
               break;
           case R.id.btn_spacedemo:
               startSpaceDemo();
               break;
           case R.id.btn_popupmenudemo:
               startPopMenuDemo();
               break;
           case R.id.btn_gridlayoutdemo:
               startGridLayoutDemo();
               break;
           case R.id.btn_textureviewdemo:
               startTextureDemo();
               break;
       }
    }

    private void startSwitchDemo(){
        overlay(SwitchDemoActivity.class);
    }

    private void startSpaceDemo(){
        overlay(SpaceDemoActivity.class);
    }

    private void startPopMenuDemo(){
        overlay(PopupMenuDemoActivity.class);
    }

    private void startGridLayoutDemo(){
        overlay(GridLayoutDemoActivity.class);
    }

    private void startTextureDemo(){
        overlay(TextureViewDemoActivity.class);
    }


    private void overlay(Class<? extends Activity> clazz){
        Intent intent = new Intent(this,clazz);
        startActivity(intent);
    }


}
