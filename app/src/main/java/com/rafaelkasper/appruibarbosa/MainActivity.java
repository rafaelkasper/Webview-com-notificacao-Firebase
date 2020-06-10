package com.rafaelkasper.appruibarbosa;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Intent intent;
    TextView aviso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        iniciarAplicativo();


        aviso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Obrigado por utilizar nosso App!", Toast.LENGTH_LONG).show();
            }
        });
    }
    private void iniciarAplicativo() {
        int TIME_SPLASH;
        TIME_SPLASH = 3 * 1000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                intent = new Intent(MainActivity.this, PrincipalActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        },TIME_SPLASH);
        aviso = findViewById(R.id.aviso);
        aviso.setText("Versão : " + BuildConfig.VERSION_NAME);
    }

}