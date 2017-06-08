package com.gdcp.wuziqiview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
private WuziqiView wuziqiView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wuziqiView= (WuziqiView) findViewById(R.id.wuziqiView);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.start){
            wuziqiView.start();
            return true;
        }
        if (id==R.id.undo){
            wuziqiView.undo();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
