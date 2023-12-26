import java.lang.Math;
public class Ch2 {
    public static void main(String[] args) {
        System.out.println(toMilesperHour(1.5));
    }

    public static long toMilesperHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
            long milesPerHour = toMilesperHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}




