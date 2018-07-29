package digory.ichoose;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton foodAndDrinkButton = (ImageButton) findViewById(R.id.foodAndDrinkImageButton);
        foodAndDrinkButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), FoodAndDrinkActivity.class);
                startActivity(startIntent);
            }
        });
    }
}
