package org.mysysdev.dicee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    final String TAG = MainActivity.class.getSimpleName();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton = (Button) findViewById(R.id.btn_roll);
        ImageView leftImage = (ImageView) findViewById(R.id.left_dice);
        ImageView rightImage = (ImageView) findViewById(R.id.right_dice);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Z App is smoothly running");
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6) + 100;
                Log.d(TAG, "The random number is " + number);
            }
        });
    }


}
