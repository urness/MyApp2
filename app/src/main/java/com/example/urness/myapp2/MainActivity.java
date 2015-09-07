package com.example.urness.myapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = (Button) findViewById(R.id.button_two);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code goes here
                Toast.makeText(getApplicationContext(), "What is up?!", Toast.LENGTH_SHORT).show();
                sendToSecondScreen();
            }
        });
    }

    private void sendToSecondScreen()
    {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }



    public void sendMessage(View view) {
        int x = 10;
        double y = 123.34;
        Log.v(TAG, "here I was");
        //System.out.println("pressed");
        sendToSecondScreen();
        y = 12.33;
        Log.v(TAG, "here I am");
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is prese nt.
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
