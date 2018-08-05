package digory.ichoose;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.full_screen_buttons.BookActivity;
import digory.ichoose.full_screen_buttons.ComputerActivity;
import digory.ichoose.full_screen_buttons.CookActivity;
import digory.ichoose.full_screen_buttons.DrawActivity;
import digory.ichoose.full_screen_buttons.GardenActivity;
import digory.ichoose.full_screen_buttons.ParkActivity;
import digory.ichoose.full_screen_buttons.PuzzleActivity;
import digory.ichoose.full_screen_buttons.TvActivity;
import digory.ichoose.full_screen_buttons.VideoGameActivity;

public class ActivitiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);

        ImageButton bookButton = (ImageButton) findViewById(R.id.bookBtn);
        bookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), BookActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton computerButton = (ImageButton) findViewById(R.id.computerBtn);
        computerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), ComputerActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton cookButton = (ImageButton) findViewById(R.id.cookBtn);
        cookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), CookActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton drawButton = (ImageButton) findViewById(R.id.drawBtn);
        drawButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), DrawActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton gardenButton = (ImageButton) findViewById(R.id.gardenBtn);
        gardenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), GardenActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton parkButton = (ImageButton) findViewById(R.id.parkBtn);
        parkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), ParkActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton puzzleButton = (ImageButton) findViewById(R.id.puzzleBtn);
        puzzleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), PuzzleActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton tvButton = (ImageButton) findViewById(R.id.tvBtn);
        tvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TvActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton videoGameButton = (ImageButton) findViewById(R.id.videogameBtn);
        videoGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), VideoGameActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton travelButton = (ImageButton) findViewById(R.id.travelBtn);
        travelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), TravelActivity.class);
                startActivity(startIntent);
            }
        });
    }
}
