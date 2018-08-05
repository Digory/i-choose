package digory.ichoose.full_screen_buttons;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.R;

public class BiscuitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biscuit);

        ImageButton biscuitButtonLarge = (ImageButton) findViewById(R.id.biscuitBtnLarge);
        final MediaPlayer playBiscuit = MediaPlayer.create(this, R.raw.biscuit);
        biscuitButtonLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playBiscuit.start();
            }
        });
    }
}
