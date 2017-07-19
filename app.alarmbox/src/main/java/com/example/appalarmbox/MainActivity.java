package com.example.appalarmbox;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.liblogic.Logic;
import com.example.logic2.Logic2;

import net.wequick.small.Small;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView)findViewById(R.id.tv)).setText(new Logic2().getLogicNethod());
        Uri uri = Small.getUri(this);
        Log.i("info",uri.toString());
        String id = uri.getQueryParameter("id");
        String title = uri.getQueryParameter("title");
        Log.i("info","id="+id+",title="+title);
    }
}
