package co.evecon.weatherforecast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        String customerTown = getIntent().getExtras().getString("Town");
        TextView town = (TextView) findViewById(R.id.Town);
            town.setText(customerTown);
    }
}
