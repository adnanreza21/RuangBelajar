package com.example.ruangbelajar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ChemistryActivity extends AppCompatActivity {
    private static ImageView img;
    private static ImageView img2;
    private static ImageView img3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry);

    click();
}
    public void click ()
    {
        img = (ImageView) findViewById(R.id.materi);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".ChemistryBookActivity");
                startActivity(intent);
            }
        });
        img2 = (ImageView) findViewById(R.id.video);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".ChemistryVideoActivity");
                startActivity(intent);
            }
        });
        img3 = (ImageView) findViewById(R.id.kuis);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".ChemistryTestActivity");
                startActivity(intent);
            }
        });

    }

}
