package com.example.datepickerapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.datepickerapp.DatePickerFragment;
import com.example.datepickerapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowDate(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),"datePicker");
    }

    public void  processDataPickerResult(int year, int month, int day) {
        String month_s = Integer.toString(month+1);
        String year_s = Integer.toString(year);
        String day_s = Integer.toString(day);

        String dateMessage = (month_s + "/"+ day_s + "/" +year_s);

        Toast.makeText(this, "Date: "+dateMessage, Toast.LENGTH_SHORT).show();
    }

}