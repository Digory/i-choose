package digory.ichoose.full_screen_buttons;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.R;

public class GardenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garden);

        ImageButton gardenButtonLarge = (ImageButton) findViewById(R.id.gardenBtnLarge);
        final MediaPlayer playGarden = MediaPlayer.create(this, R.raw.garden);
        gardenButtonLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playGarden.start();
            }
        });
    }
}
