package digory.ichoose;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import digory.ichoose.full_screen_buttons.AeroplaneActivity;
import digory.ichoose.full_screen_buttons.BicycleActivity;
import digory.ichoose.full_screen_buttons.BusActivity;
import digory.ichoose.full_screen_buttons.CarActivity;
import digory.ichoose.full_screen_buttons.TrainActivity;
import digory.ichoose.full_screen_buttons.TramActivity;
import digory.ichoose.full_screen_buttons.WalkActivity;

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

        ImageButton busButton = (ImageButton) findViewById(R.id.busBtn);
        busButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), BusActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton carButton = (ImageButton) findViewById(R.id.carBtn);
        carButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), CarActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton trainButton = (ImageButton) findViewById(R.id.trainBtn);
        trainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TrainActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton tramButton = (ImageButton) findViewById(R.id.tramBtn);
        tramButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TramActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton walkButton = (ImageButton) findViewById(R.id.walkBtn);
        walkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), WalkActivity.class);
                startActivity(startIntent);
            }
        });
    }
}
