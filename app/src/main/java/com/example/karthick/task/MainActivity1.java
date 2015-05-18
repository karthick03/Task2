package com.example.karthick.task;

/**
 * Created by karthick on 18/05/15.
 */

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity1 extends ActionBarActivity {
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        // BAckground color of action bar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0xff00796B));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(false);
        getSupportActionBar().setTitle("Second Page");
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        final TextView text=(TextView) findViewById(R.id.textView);
        // Button Operation For Increment...
        Button inc=(Button) findViewById(R.id.button);
        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                // limit to increment
                if(counter<=32000) {
                    text.setText("Value is: "+counter);
                }
                else
                    counter--;
            }
        });
        // Button operation for Decrement...
        Button dec=(Button) findViewById(R.id.button2);
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter--;
                // limit check to decrement
                if(counter>=-32000) {
                    text.setText("Value is: "+counter);
                }
                else
                    counter++;
            }
        });
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
                Toast.makeText(MainActivity1.this,"Settings",Toast.LENGTH_LONG).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    // Exiting Second page when Back button is pressed...
    @Override
    public void onBackPressed() {
        MainActivity1.this.finish();
        overridePendingTransition(R.anim.slide2, R.anim.slide);
    }
}
