package digory.ichoose.full_screen_buttons;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.R;

public class ToiletActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toilet);

        ImageButton toiletButtonLarge = (ImageButton) findViewById(R.id.toiletBtnLarge);
        final MediaPlayer playToilet = MediaPlayer.create(this, R.raw.toilet);
        toiletButtonLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playToilet.start();
            }
        });
    }
}
