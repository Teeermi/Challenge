public class Ch5 {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-100));
    }


    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;


            if (year % 4 == 0) {
                if (year % 100 != 0) {
                    return true;
                } else {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
    }