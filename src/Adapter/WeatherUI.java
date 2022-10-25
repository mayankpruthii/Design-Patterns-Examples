package Adapter;

public class WeatherUI {
    public void showTemperature(int zipcode) {
        WeatherAdapter adapter = new WeatherAdapter();
        System.out.println(adapter.findWeather(zipcode) + "degree celsius");
    }
}
