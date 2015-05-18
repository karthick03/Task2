package com.example.karthick.task;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Display logo in Action Bar
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        //Color of Action Bar
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0xff01579B));
        getSupportActionBar().setTitle("Home Page");
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        //First button click operation
        Button but1=(Button)findViewById(R.id.button);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go-To Second Page...
                Intent intent = new Intent(MainActivity.this, MainActivity1.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide3, R.anim.slide4);
            }
        });
        //Second button click operation
        Button but2=(Button)findViewById(R.id.button2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Go-To Third Page...
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide3, R.anim.slide4);
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
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
