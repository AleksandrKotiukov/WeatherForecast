package co.evecon.weatherforecast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private WeatherData weatherData;
    private CheckBox temperatureBox;
    private CheckBox humidityBox;
    private CheckBox windSpeedBox;
    private EditText town;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weatherData = new WeatherData();
        temperatureBox = (CheckBox) findViewById(R.id.temperatureBox);
        humidityBox = (CheckBox) findViewById(R.id.humidityBox);
        windSpeedBox = (CheckBox) findViewById(R.id.windSpeedBox);
        town = (EditText) this.findViewById(R.id.editTown);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                weatherData.setShowTemperature(false);
                weatherData.setShowHumidity(false);
                weatherData.setShowWindSpeed(false);
                weatherData.setTown(town.getText().toString());
                if (temperatureBox.isChecked()){weatherData.setShowTemperature(true);}
                if (humidityBox.isChecked()){weatherData.setShowHumidity(true);}
                if (windSpeedBox.isChecked()){weatherData.setShowWindSpeed(true);}

                Intent intent = new Intent(this, FirstActivity.class);
                intent.putExtra("Data", weatherData);
                startActivity(intent);
                break;
            default:
                break;
        }
    }



}
