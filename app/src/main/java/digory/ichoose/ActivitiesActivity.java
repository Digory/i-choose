package digory.ichoose;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import digory.ichoose.full_screen_buttons.BookActivity;
import digory.ichoose.full_screen_buttons.ComputerActivity;

public class ActivitiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);

        ImageButton bookButton = (ImageButton) findViewById(R.id.bookBtn);
        bookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), BookActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton computerButton = (ImageButton) findViewById(R.id.computerBtn);
        computerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), ComputerActivity.class);
                startActivity(startIntent);
            }
        });
    }
}
