package digory.ichoose;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.full_screen_buttons.ChocolateActivity;
import digory.ichoose.full_screen_buttons.SandwichActivity;

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

        ImageButton sandwichButton = (ImageButton) findViewById(R.id.sandwichBtn);
        sandwichButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), SandwichActivity.class);
                startActivity(startIntent);
            }
        });
    }
}
