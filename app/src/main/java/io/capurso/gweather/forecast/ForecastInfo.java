package io.capurso.gweather.forecast;


public class ForecastInfo {
    public String day, weatherDesc, lowHigh, currTemp;
    public int iconId;

    public ForecastInfo(String day, String weatherDesc, String lowHigh, String currTemp, int iconId){
        this.day = day;
        this.weatherDesc = weatherDesc;
        this.lowHigh = lowHigh;
        this.currTemp = currTemp;
        this.iconId = iconId;
    }
}