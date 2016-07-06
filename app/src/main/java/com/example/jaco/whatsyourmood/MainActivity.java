package com.example.jaco.whatsyourmood;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Setando as variaveis
    MediaPlayer agua,brincar,calor,comer,dormir,feliz,frio,lavar,triste,banheiro,vertv,game;
    ImageView imageView1;
    int tophone;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //carrega as musicas
        agua = MediaPlayer.create(this, R.raw.agua);
        brincar = MediaPlayer.create(this, R.raw.brincar);
        calor = MediaPlayer.create(this, R.raw.calor);
        comer = MediaPlayer.create(this, R.raw.comer);
        dormir = MediaPlayer.create(this, R.raw.dormir);
        feliz = MediaPlayer.create(this, R.raw.feliz);
        frio = MediaPlayer.create(this, R.raw.frio);
        lavar = MediaPlayer.create(this, R.raw.lavar);
        triste = MediaPlayer.create(this, R.raw.triste);
        banheiro = MediaPlayer.create(this, R.raw.usar_banheiro);
        vertv = MediaPlayer.create(this, R.raw.vertv);
        game = MediaPlayer.create(this, R.raw.video_game);

        //carregando a imagem principal
        imageView1=(ImageView)findViewById(R.id.imageView1);

        //contador do scrollview
        tophone=R.mipmap.ic_launcher;

        // Recuperando imagem do XML Main
        ImageView image2=(ImageView) findViewById(R.id.imageView2);
        ImageView image3=(ImageView) findViewById(R.id.imageView3);
        ImageView image4=(ImageView) findViewById(R.id.imageView4);
        ImageView image5=(ImageView) findViewById(R.id.imageView5);
        ImageView image6=(ImageView) findViewById(R.id.imageView6);
        ImageView image7=(ImageView) findViewById(R.id.imageView7);
        ImageView image8=(ImageView) findViewById(R.id.imageView8);
        ImageView image9=(ImageView) findViewById(R.id.imageView9);
        ImageView image10=(ImageView) findViewById(R.id.imageView10);
        ImageView image11=(ImageView) findViewById(R.id.imageView11);
        ImageView image12=(ImageView) findViewById(R.id.imageView12);
        ImageView image13=(ImageView) findViewById(R.id.imageView13);

        //setando imagens ao clicar
        assert image2 != null;
        image2.setOnClickListener(this);
        assert image3 != null;
        image3.setOnClickListener(this);
        assert image4 != null;
        image4.setOnClickListener(this);
        assert image5 != null;
        image5.setOnClickListener(this);
        assert image6 != null;
        image6.setOnClickListener(this);
        assert image7 != null;
        image7.setOnClickListener(this);
        assert image8 != null;
        image8.setOnClickListener(this);
        assert image9 != null;
        image9.setOnClickListener(this);
        assert image10 != null;
        image10.setOnClickListener(this);
        assert image11 != null;
        image11.setOnClickListener(this);
        assert image12 != null;
        image12.setOnClickListener(this);
        assert image13 != null;
        image13.setOnClickListener(this);

    }

    //Ação que faz executar a musica e jogar a imagem para a imagem principal
    public void onClick(View v)

    {
        switch(v.getId())
        {
            case R.id.imageView2:
                // toca o audio
                agua.start();
                //aumenta a imagem para a tela principal
                imageView1.setImageResource(R.drawable.agua);
                tophone=R.drawable.banheiro;
                break;

            case R.id.imageView3:
                banheiro.start();
                imageView1.setImageResource(R.drawable.banheiro);
                tophone=R.drawable.brincar;
                break;

            case R.id.imageView4:
                brincar.start();
                imageView1.setImageResource(R.drawable.brincar);
                tophone=R.drawable.calor;
                break;

            case R.id.imageView5:
                calor.start();
                imageView1.setImageResource(R.drawable.calor);
                tophone=R.drawable.comida;
                break;

            case R.id.imageView6:
                comer.start();
                imageView1.setImageResource(R.drawable.comida);
                tophone=R.drawable.dormir;
                break;

            case R.id.imageView7:
                dormir.start();
                imageView1.setImageResource(R.drawable.dormir);
                tophone=R.drawable.feliz;
                break;

            case R.id.imageView8:
                feliz.start();
                imageView1.setImageResource(R.drawable.feliz);
                tophone=R.drawable.frio;
                break;

            case R.id.imageView9:
                frio.start();
                imageView1.setImageResource(R.drawable.frio);
                tophone=R.drawable.lavarasmaos;
                break;

            case R.id.imageView10:
                lavar.start();
                imageView1.setImageResource(R.drawable.lavarasmaos);
                tophone=R.drawable.triste;
                break;

            case R.id.imageView11:
                triste.start();
                imageView1.setImageResource(R.drawable.triste);
                tophone=R.drawable.vertv;
                break;

            case R.id.imageView12:
                vertv.start();
                imageView1.setImageResource(R.drawable.vertv);
                tophone=R.drawable.videogame;
                break;

            case R.id.imageView13:
                game.start();
                imageView1.setImageResource(R.drawable.videogame);
                tophone=R.mipmap.ic_launcher;
                break;
        }

    }

}
