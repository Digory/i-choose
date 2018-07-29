package digory.ichoose;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FoodAndDrinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_and_drink);

        ImageButton breakfastBtn = (ImageButton) findViewById(R.id.breakfastBtn);
        final MediaPlayer playBreakfast = MediaPlayer.create(this, R.raw.breakfast);
        breakfastBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                playBreakfast.start();
            }
        });

        ImageButton lunchBtn = (ImageButton) findViewById(R.id.lunchBtn);
        final MediaPlayer playLunch = MediaPlayer.create(this, R.raw.lunch);
        lunchBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                playLunch.start();
            }
        });

        ImageButton dinnerBtn = (ImageButton) findViewById(R.id.dinnerBtn);
        final MediaPlayer playDinner = MediaPlayer.create(this, R.raw.dinner);
        dinnerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playDinner.start();
            }
        });

        ImageButton drinkBtn = (ImageButton) findViewById(R.id.drinkBtn);
        final MediaPlayer playDrink = MediaPlayer.create(this, R.raw.drink);
        dinnerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playDrink.start();
            }
        });

        ImageButton snackBtn = (ImageButton) findViewById(R.id.snackBtn);
        snackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), SnackActivity.class);
                startActivity(startIntent);
            }
        });
    }
}
