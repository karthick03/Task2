package com.example.karthick.task;

/**
 * Created by karthick on 18/05/15.
 */
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity2 extends ActionBarActivity {
    String[] continent = {"Asia","Africa","North America","South America","Europe","Australia","Antartica"};
    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // BAckground color of action bar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0xff1A237E));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(false);
        getSupportActionBar().setTitle("Third Page");
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        // Obtaining ID from activity_main2.xml
        mainListView = (ListView) findViewById( R.id.mainListView );
        ArrayList<String> contList = new ArrayList<String>();
        //Adding list items to an ArrayList
        contList.addAll( Arrays.asList(continent) );
        listAdapter = new ArrayAdapter<String>(this, R.layout.list, contList);
        //Set the ArrayAdapter as the ListView's adapter.
        mainListView.setAdapter( listAdapter );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                overridePendingTransition(R.anim.slide2, R.anim.slide);
                return true;
            case R.id.action_settings:
                Toast.makeText(MainActivity2.this,"Settings",Toast.LENGTH_LONG).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    // When Back Button Is Pressed...
    @Override
    public void onBackPressed() {
        MainActivity2.this.finish();
        overridePendingTransition(R.anim.slide2, R.anim.slide);
    }
}
