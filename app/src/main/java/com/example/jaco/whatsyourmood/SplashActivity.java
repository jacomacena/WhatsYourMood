package com.example.jaco.whatsyourmood;

import java.util.Timer;
import java.util.TimerTask;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //cria um timer para executar o splash
        new Timer().schedule(new TimerTask() {

            @Override
            public void run() {
                //inicia a tela do splash e troca de activity para a main
                finish();

                Intent intent = new Intent();
                intent.setClass(SplashActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }, 3000); //quantidade de segundos que a tela vai ficar no splash
    }

}