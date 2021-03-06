package digory.ichoose.full_screen_buttons;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.R;

public class BreakfastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);

        ImageButton breakfastButtonLarge = (ImageButton) findViewById(R.id.breakfastBtnLarge);
        final MediaPlayer playBreakfast = MediaPlayer.create(this, R.raw.breakfast);
        breakfastButtonLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playBreakfast.start();
            }
        });
    }
}
