package Adapter;

public class WeatherAdapter {
    
    public int findWeather(int zipcode) {
        // this function is just a mapping from integer zipcode to
        // string city. And then it calls the find temperature method
        // using the string city
        String city = null;
        if(zipcode == 110001) {
            city = "Delhi";
        }
        // ... and so on
        WeatherFinder finder = new WeatherFinderImpl();
        int temperature = finder.find(city);
        return temperature;
    }
}
