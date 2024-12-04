package ObserverDesignPattern;

public class Main {
	public static void main(String[] args) {
        weatherStation weatherstation = new weatherStation();

        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TvDisplay();

        weatherstation.addObserver(phoneDisplay);
        weatherstation.addObserver(tvDisplay);

        // Simulating weather change
        weatherstation.setWeather("Sunny");

        // Output:
        // Phone Display: Weather updated - Sunny
        // TV Display: Weather updated - Sunny
    }
}
