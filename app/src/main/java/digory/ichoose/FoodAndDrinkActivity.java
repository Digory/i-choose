package digory.ichoose;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import digory.ichoose.full_screen_buttons.BreakfastActivity;
import digory.ichoose.full_screen_buttons.DinnerActivity;
import digory.ichoose.full_screen_buttons.DrinkActivity;
import digory.ichoose.full_screen_buttons.LunchActivity;

public class FoodAndDrinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_and_drink);

        ImageButton breakfastBtn = (ImageButton) findViewById(R.id.breakfastBtn);
        breakfastBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), BreakfastActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton lunchBtn = (ImageButton) findViewById(R.id.lunchBtn);
        lunchBtn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), LunchActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton dinnerBtn = (ImageButton) findViewById(R.id.dinnerBtn);
        dinnerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), DinnerActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton drinkBtn = (ImageButton) findViewById(R.id.drinkBtn);
        drinkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), DrinkActivity.class);
                startActivity(startIntent);
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
