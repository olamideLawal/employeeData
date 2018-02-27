package uk.ac.mmu.employeedata;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.InputStream;
import java.net.HttpURLConnection;


public class MainActivity extends AppCompatActivity {

    //for making http call
    HttpURLConnection urlConnection;

    InputStream in = null;
    String strURL = "http://10.0.2.2:8005";
    String response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
}
