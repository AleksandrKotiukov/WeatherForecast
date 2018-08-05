package co.evecon.weatherforecast;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.HashMap;

public class FirstActivity extends AppCompatActivity {
    private WeatherData weatherData;
    private TextView town;
    private LinearLayout temperatureLayout;
    private LinearLayout humidityLayout;
    private LinearLayout windSpeedLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        weatherData = new WeatherData();
        weatherData = (WeatherData) getIntent().getSerializableExtra("Data");
        town = (TextView) findViewById(R.id.Town);
        town.setText(weatherData.getTown());

        temperatureLayout = (LinearLayout) findViewById(R.id.temperatureLayout);
        humidityLayout = (LinearLayout) findViewById(R.id.humidityLayout);
        windSpeedLayout = (LinearLayout) findViewById(R.id.windSpeedLayout);

        if (!weatherData.getShowTemperature()) {
            temperatureLayout.setVisibility(View.INVISIBLE);
        }
        if (!weatherData.getShowHumidity()) {
            humidityLayout.setVisibility(View.INVISIBLE);
        }
        if (!weatherData.getShowWindSpeed()) {
            windSpeedLayout.setVisibility(View.INVISIBLE);
        }
    }

    public void onClickEmail(View view) {
        switch (view.getId()) {
            case R.id.buttonEmail:
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:alex.kotyukov@yandex.ru"));
                startActivity(emailIntent);
                break;
            default:
                break;
        }
    }
}
