package com.androidbolivia.studyjam_proyectofincurso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    private Button btnEmpezar;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEmpezar=(Button)findViewById(R.id.btn_1);
    }


    void empezar(View v)
    {
        Intent a=new Intent(this, anctivity_Segundo.class);
        startActivity(a);
    }

}
