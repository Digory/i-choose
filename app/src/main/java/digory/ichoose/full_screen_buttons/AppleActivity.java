package digory.ichoose.full_screen_buttons;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.R;

public class AppleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);

        ImageButton appleButtonLarge = (ImageButton) findViewById(R.id.appleBtnLarge);
        final MediaPlayer playApple = MediaPlayer.create(this, R.raw.apple);
        appleButtonLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playApple.start();
            }
        });
    }
}
