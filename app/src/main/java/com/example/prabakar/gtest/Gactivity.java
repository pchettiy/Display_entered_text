package com.example.prabakar.gtest;

import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class Gactivity extends ActionBarActivity {
    EditText edit;
    Button button;
    TextView vo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gactivity);

        edit=(EditText)findViewById(R.id.edit_message);
        button=(Button)findViewById(R.id.button_send);




    }

public void send(View v)
{
    setContentView(R.layout.activity_actv2);
    vo=(TextView)findViewById(R.id.textn);
    vo.setText(edit.getText().toString());
    setContentView(R.layout.activity_gactivity);
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gactivity, menu);
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
