package digory.ichoose;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.full_screen_buttons.AppleActivity;
import digory.ichoose.full_screen_buttons.BananaActivity;
import digory.ichoose.full_screen_buttons.BiscuitActivity;
import digory.ichoose.full_screen_buttons.CerealActivity;
import digory.ichoose.full_screen_buttons.ChocolateActivity;
import digory.ichoose.full_screen_buttons.SandwichActivity;
import digory.ichoose.full_screen_buttons.ToastActivity;

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

        ImageButton appleButton = (ImageButton) findViewById(R.id.appleBtn);
        appleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), AppleActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton bananaButton = (ImageButton) findViewById(R.id.bananaBtn);
        bananaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), BananaActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton biscuitButton = (ImageButton) findViewById(R.id.biscuitBtn);
        biscuitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), BiscuitActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton cerealButton = (ImageButton) findViewById(R.id.cerealBtn);
        cerealButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), CerealActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton toastButton = (ImageButton) findViewById(R.id.toastBtn);
        toastButton.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), ToastActivity.class);
                startActivity(startIntent);
            }
        });
    }

}
