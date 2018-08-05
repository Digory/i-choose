package digory.ichoose.full_screen_buttons;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.R;

public class ToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        ImageButton toastButtonLarge = (ImageButton) findViewById(R.id.toastBtnLarge);
        final MediaPlayer playToast = MediaPlayer.create(this, R.raw.toast);
        toastButtonLarge.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                playToast.start();
            }
        });
    }
}
