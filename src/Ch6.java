public class Ch6 {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.1757));
        System.out.println(-3.1756 * 1000);
        System.out.println(-3.1757 * 1000);
    }

public static boolean areEqualByThreeDecimalPlaces(double paper, double pencil) {
     double nowy = (long) (paper * 1000);
     double nowy2 = (long) (pencil * 1000);
     if (nowy == nowy2) {
         return true;
     } else {
         return false;
     }

    }




}
