package digory.ichoose.full_screen_buttons;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.R;

public class PuzzleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle);

        ImageButton puzzleButtonLarge = (ImageButton) findViewById(R.id.puzzleBtnLarge);
        final MediaPlayer playPuzzle = MediaPlayer.create(this, R.raw.puzzle);
        puzzleButtonLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playPuzzle.start();
            }
        });
    }
}