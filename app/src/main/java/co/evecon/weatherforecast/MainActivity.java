package co.evecon.weatherforecast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                Intent intent = new Intent(this, FirstActivity.class);
                EditText town = (EditText) this.findViewById(R.id.editTown);
                intent.putExtra("Town", town.getText().toString());
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}
