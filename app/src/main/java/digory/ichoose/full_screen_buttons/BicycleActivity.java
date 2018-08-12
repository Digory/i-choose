package digory.ichoose.full_screen_buttons;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.R;

public class BicycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicycle);

        ImageButton bicycleButtonLarge = (ImageButton) findViewById(R.id.bicycleBtnLarge);
        final MediaPlayer playBicycle = MediaPlayer.create(this, R.raw.bicycle);
        bicycleButtonLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playBicycle.start();
            }
        });
    }
}
