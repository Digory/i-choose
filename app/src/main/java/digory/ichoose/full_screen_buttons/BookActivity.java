package digory.ichoose.full_screen_buttons;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.R;

public class BookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        ImageButton bookButtonLarge = (ImageButton) findViewById(R.id.bookBtnLarge);
        final MediaPlayer playBook = MediaPlayer.create(this, R.raw.book);
        bookButtonLarge.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                playBook.start();
            }
        });
    }
}
