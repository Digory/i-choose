package digory.ichoose;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
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
    }
}
