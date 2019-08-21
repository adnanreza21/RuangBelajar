package com.example.ruangbelajar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {
    private static ImageView img;
    private static ImageView img2;
    private static ImageView img3;
    private static ImageView img4;
    private static ImageView img5;
    private static ImageView img6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click();
    }
        public void click ()
        {
            img = (ImageView) findViewById(R.id.math);
            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(".MathActivity");
                    startActivity(intent);
                }
            });

            img2 = (ImageView) findViewById(R.id.molekul);
            img2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(".ChemistryActivity");
                    startActivity(intent);
                }
            });

            img3 = (ImageView) findViewById(R.id.biologi);
            img3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(".BiologyActivity");
                    startActivity(intent);
                }
            });

            img4 = (ImageView) findViewById(R.id.fisika);
            img4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(".PhysicsActivity");
                    startActivity(intent);
                }
            });

            img5 = (ImageView) findViewById(R.id.art);
            img5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(".ArtActivity");
                    startActivity(intent);
                }
            });

            img6 = (ImageView) findViewById(R.id.musik);
            img6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(".MusicActivity");
                    startActivity(intent);
                }
            });

              }

}
