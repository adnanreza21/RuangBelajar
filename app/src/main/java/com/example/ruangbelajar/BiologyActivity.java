package com.example.ruangbelajar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BiologyActivity extends AppCompatActivity {
    private static ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biology);
        click();
    }

    public void click() {
        img = (ImageView) findViewById(R.id.materi);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".BiologyBookActivity");
                startActivity(intent);
            }
        });
    }
}
