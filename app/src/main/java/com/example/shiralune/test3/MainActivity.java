package com.example.shiralune.test3;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
    Button b1;
    Button b2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        View.OnClickListener myhandler1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // it was the 1st button
                b1.setClickable(true);
                b2.setClickable(false);
            }
        };
        View.OnClickListener myhandler2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setClickable(false);
                b2.setClickable(true);
                // it was the 2nd button
            }
        };
        b1.setOnClickListener(myhandler1);
        b2.setOnClickListener(myhandler2);

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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
