class InvalidTemperatureException extends Exception { InvalidTemperatureException(String m){super(m);} }
class TempConverter {
    void convert(double val, char unit) throws InvalidTemperatureException {
        if ((unit == 'C' && val < -273.15) || (unit == 'F' && val < -459.67))
            throw new InvalidTemperatureException("Temperature below absolute zero is not possible!");
        if (unit == 'C') System.out.println("Fahrenheit: " + (val * 9 / 5 + 32));
        else System.out.println("Celsius: " + ((val - 32) * 5 / 9));
    }
    public static void main(String[] args) {
        TempConverter t = new TempConverter();
        try {
            t.convert(-300, 'C');
        } catch (InvalidTemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
