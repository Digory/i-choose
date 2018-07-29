package digory.ichoose.full_screen_buttons;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.R;

public class DinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);

        ImageButton dinnerButtonLarge = (ImageButton) findViewById(R.id.dinnerBtnLarge);
        final MediaPlayer playDinner = MediaPlayer.create(this, R.raw.dinner);
        dinnerButtonLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playDinner.start();
            }
        });    }
}
