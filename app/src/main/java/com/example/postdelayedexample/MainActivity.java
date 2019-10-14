package com.example.postdelayedexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    int i=0;
    private static final String TAG = "MainActivity";
    android.os.Handler Customhandler = new android.os.Handler();
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView=findViewById(R.id.tv_status);
        Customhandler.postDelayed(UpdatetimerThread,0);
        i=i+1;


      /*  Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm a");
        String currentDateTimeString = sdf.format(d);
        textView.setText(currentDateTimeString);*/

   /*     SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd:HH:mm");
        String currentDateandTime = sdf.format(new Date());

        Date date = null;
        try {
            date = sdf.parse(currentDateandTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, 1);

        System.out.println("Time here "+calendar.getTime());*/

    }

    private Runnable UpdatetimerThread =new Runnable() {
        @Override
        public void run() {
            i++;
            Log.d(TAG, "run: =======================================================its working"+i);

            textView.setText("i will be back after 1sec  forever"+ Integer.toString(i));
            Customhandler.postDelayed(this,System.currentTimeMillis()+(60*1000));
        }
    };




}
