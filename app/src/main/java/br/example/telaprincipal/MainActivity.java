package br.example.telaprincipal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }

    protected void onResume(Bundle saveInstanceState) {
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);


    }

}
