package co.evecon.weatherforecast;

import java.io.Serializable;

public class WeatherData implements Serializable {
    private String town;
    private Boolean showTemperature;
    private boolean showHumidity;
    private boolean showWindSpeed;

    public WeatherData() {
        this.showTemperature = false;
        this.showHumidity = false;
        this.showWindSpeed = false;
    }

    public void setTown(String town){
        this.town = town;
    }

    public void setShowHumidity(boolean showHumidity){
        this.showHumidity = showHumidity;
    }

    public void setShowTemperature(boolean showTemperature){
        this.showTemperature = showTemperature;
    }

    public void setShowWindSpeed(boolean showWindSpeed){
        this.showWindSpeed = showWindSpeed;
    }

    public String getTown(){
        return town;
    }

    public boolean getShowTemperature(){
        return showTemperature;
    }

    public boolean getShowHumidity(){
        return showHumidity;
    }

    public boolean getShowWindSpeed(){
        return showWindSpeed;
    }
}