package Task4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<WeatherData> weatherDataList = new ArrayList<>();
        WeatherData data1 = new WeatherData("Copenhagen", 15, 30);
        WeatherData data2 = new WeatherData("Aarhus", 12, 25);
        WeatherData data3 = new WeatherData("Odense", 17, 38);

        addWeatherData(weatherDataList, data1);
        addWeatherData(weatherDataList, data2);
        addWeatherData(weatherDataList, data3);

        displayWeatherData(weatherDataList);

        findCitiesWithHighHumidity(weatherDataList, 38);
    }

    public static void addWeatherData(ArrayList<WeatherData> weatherDataList, WeatherData data) {
        weatherDataList.add(data);
    }

    public static void displayWeatherData(ArrayList<WeatherData> weatherDataList) {
        for (WeatherData weatherdata : weatherDataList) { //forklaret: for hver ojekt af WeatherData : i vores arrayliste weatherDataList
            System.out.println(weatherdata); //gør det her
        }
    }

    public static void findCitiesWithHighHumidity(ArrayList<WeatherData> weatherDataList, int threshold) {
        for (WeatherData weatherdata : weatherDataList) { //som forklaret på linje 27
            if (weatherdata.getHumidity() >= threshold) { //HVIS de her betingelser er opfylds
                System.out.println(weatherdata);           //SÅ gør det her
            }
        }
    }
}
