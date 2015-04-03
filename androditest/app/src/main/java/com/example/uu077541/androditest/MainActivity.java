package com.example.uu077541.androditest;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //テキストビュー
        final TextView textview = (TextView)findViewById(R.id.textview);

        Calendar date = Calendar.getInstance();

        DatePickerDialog datePickerDialog = new DatePickerDialog(
           this,
                new DatePickerDialog.OnDateSetListener(){

                    @Override
                    public void onDateSet(
                            DatePicker view, int year, int monthOfYear, int dayOfMonth
                    ) {
                        textview.setText(year+","+(monthOfYear+1)+","+dayOfMonth);
                    }
                },
                date.get(Calendar.YEAR),
                date.get(Calendar.MONTH) ,date.get(Calendar.DATE) );

        datePickerDialog.setTitle("タイトル");
        datePickerDialog.show();
    }

}

