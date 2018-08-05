package digory.ichoose.full_screen_buttons;

import android.media.MediaPlayer;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.R;

public class OrangeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orange);

        ImageButton orangeButtonLarge = (ImageButton) findViewById(R.id.orangeBtnLarge);
        final MediaPlayer playOrange = MediaPlayer.create(this, R.raw.orange);
        orangeButtonLarge.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                playOrange.start();
            }
        });
    }
}
