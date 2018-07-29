package digory.ichoose.full_screen_buttons;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.R;

public class ChocolateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chocolate);

        ImageButton chocolateButton = (ImageButton) findViewById(R.id.chocolateBtn);
        final MediaPlayer playChocolate = MediaPlayer.create(this, R.raw.chocolate);
        chocolateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playChocolate.start();
            }
        });
    }
}
