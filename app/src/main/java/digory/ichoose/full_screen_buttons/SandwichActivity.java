package digory.ichoose.full_screen_buttons;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.R;

public class SandwichActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwich);

        ImageButton sandwichButtonLarge = (ImageButton) findViewById(R.id.sandwichBtnLarge);
        final MediaPlayer playSandwich = MediaPlayer.create(this, R.raw.sandwich);
        sandwichButtonLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSandwich.start();
            }
        });
    }
}
