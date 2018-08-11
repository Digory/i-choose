package digory.ichoose.full_screen_buttons;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.R;

public class AeroplaneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aeroplane);

        ImageButton aeroplaneButtonLarge = (ImageButton) findViewById(R.id.aeroplaneBtnLarge);
        final MediaPlayer playAeroplane = MediaPlayer.create(this, R.raw.aeroplane);
        aeroplaneButtonLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playAeroplane.start();
            }
        });
    }
}
