public class Konwerter {
    private static final double przelicznik = 1.800;

    static double convertToCelsius(double input){
        input = (input-32)/przelicznik;
        return input;
    }
    static double convertToFahrenheit(double input){
        input = input*przelicznik+32;
        return input;
    }

}
