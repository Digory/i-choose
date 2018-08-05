package digory.ichoose.full_screen_buttons;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.R;

public class CrispsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crisps);

        ImageButton crispsButtonLarge = (ImageButton) findViewById(R.id.crispsBtnLarge);
        final MediaPlayer playCrisps = MediaPlayer.create(this, R.raw.crisps);
        crispsButtonLarge.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                playCrisps.start();
            }
        });
    }
}
