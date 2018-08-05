package digory.ichoose.full_screen_buttons;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.R;

public class VideoGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_game);

        ImageButton videoGameButtonLarge = (ImageButton) findViewById(R.id.videogameBtnLarge);
        final MediaPlayer playVideoGame = MediaPlayer.create(this, R.raw.video_game);
        videoGameButtonLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playVideoGame.start();
            }
        });
    }
}
