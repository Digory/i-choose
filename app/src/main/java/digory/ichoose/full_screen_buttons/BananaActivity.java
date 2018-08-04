package digory.ichoose.full_screen_buttons;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.R;

public class BananaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banana);

        ImageButton bananaButtonLarge = (ImageButton) findViewById(R.id.bananaBtnLarge);
        final MediaPlayer playBanana = MediaPlayer.create(this, R.raw.banana);
        bananaButtonLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playBanana.start();
            }
        });
    }
}
