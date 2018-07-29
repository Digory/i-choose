package digory.ichoose;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.full_screen_buttons.ChocolateActivity;

public class SnackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);

        ImageButton chocolateButton = (ImageButton) findViewById(R.id.chocolateBtn);
        chocolateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), ChocolateActivity.class);
                startActivity(startIntent);
            }
        });
    }
}
