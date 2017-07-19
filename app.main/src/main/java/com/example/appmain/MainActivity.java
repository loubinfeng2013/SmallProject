package com.example.appmain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import net.wequick.small.Small;

public class MainActivity extends AppCompatActivity {

    private String uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleMenu(View view){
        switch (view.getId()){
            case R.id.cctv:
                uri = "cctv";
                break;

            case R.id.door:
                uri = "door";
                break;

            case R.id.alarmbox:
                //uri = "alarmbox";
                uri = "alarmbox/other";
                break;
        }
        Small.setUp(this, new Small.OnCompleteListener() {
            @Override
            public void onComplete() {
                Small.openUri(uri+"?id=1&title=sdk",MainActivity.this);
            }
        });
    }
}
