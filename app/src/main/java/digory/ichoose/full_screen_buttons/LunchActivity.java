package digory.ichoose.full_screen_buttons;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.R;

public class LunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);

        ImageButton lunchButtonLarge = (ImageButton) findViewById(R.id.lunchBtnLarge);
        final MediaPlayer playLunch = MediaPlayer.create(this, R.raw.lunch);
        lunchButtonLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playLunch.start();
            }
        });

    }
}
