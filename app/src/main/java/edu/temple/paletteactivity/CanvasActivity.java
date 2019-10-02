package edu.temple.paletteactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        String data = getIntent().getExtras().getString("color");
        View window = this.getWindow().getDecorView();
        window.setBackgroundColor(Color.parseColor(data));
    }
}
