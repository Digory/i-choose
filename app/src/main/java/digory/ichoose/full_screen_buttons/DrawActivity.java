package digory.ichoose.full_screen_buttons;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.R;

public class DrawActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);

        ImageButton drawButtonLarge = (ImageButton) findViewById(R.id.drawBtnLarge);
        final MediaPlayer playDraw = MediaPlayer.create(this, R.raw.draw);
        drawButtonLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playDraw.start();
            }
        });
    }
}
