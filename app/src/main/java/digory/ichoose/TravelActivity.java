package digory.ichoose;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.full_screen_buttons.AeroplaneActivity;
import digory.ichoose.full_screen_buttons.BicycleActivity;

public class TravelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        ImageButton aeroplaneButton = (ImageButton) findViewById(R.id.aeroplaneBtn);
        aeroplaneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), AeroplaneActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton bicycleButton = (ImageButton) findViewById(R.id.bicycleBtn);
        bicycleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), BicycleActivity.class);
                startActivity(startIntent);
            }
        });
    }
}
