package com.example.nataliyamiller.facts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import java.util.Random;

public class FactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);

        //Declare our View variables and assign the Views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextsView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // The button was clicked, so update the fact label with a new fact
                String fact = "";
                // Randomly select a fact
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(3);
                if (randomNumber == 0) {
                    fact = "Ants stretch when they wake up in the morning.";
                } else if (randomNumber == 1) {
                    fact = "Ostriches can run faster than horses. ";
                } else if (randomNumber == 2) {
                    fact = "Olympic gold medals are actually made mostly of silver.";
                } else {
                    fact = "Sorry, there was an error";
                }
                // Update the label with our dynamic fact
                factLabel.setText(fact);
            }
        };

    showFactButton.setOnClickListener(listener);

}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
