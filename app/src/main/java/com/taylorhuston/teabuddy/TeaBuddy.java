package com.taylorhuston.teabuddy;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class TeaBuddy extends Activity {

    private static String TAG = "Tea Buddy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tea_buddy);

        //Declare buttons
        Button mGrnButton = (Button) findViewById(R.id.Green);
        Button mBlkButton = (Button) findViewById(R.id.Black);
        Button mHrbButton = (Button) findViewById(R.id.Herbal);
        Button mWhtButton = (Button) findViewById(R.id.White);






    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tea_buddy, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
