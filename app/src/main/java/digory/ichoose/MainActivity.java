package digory.ichoose;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton foodAndDrinkButton = (ImageButton) findViewById(R.id.foodAndDrinkBtn);
        foodAndDrinkButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), FoodAndDrinkActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton toiletButton = (ImageButton) findViewById(R.id.toiletBtn);
        toiletButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), digory.ichoose.full_screen_buttons.ToiletActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton activitiesButton = (ImageButton) findViewById(R.id.activitiesBtn);
        activitiesButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent startIntent = new Intent(getApplicationContext(), ActivitiesActivity.class);
                startActivity(startIntent);
            }
        });
    }
}
