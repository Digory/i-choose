package digory.ichoose.full_screen_buttons;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.R;

public class CookingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooking);

        ImageButton cookingButtonLarge = (ImageButton) findViewById(R.id.cookingBtnLarge);
        final MediaPlayer playCooking = MediaPlayer.create(this, R.raw.cooking);
        cookingButtonLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playCooking.start();
            }
        });
    }
}
