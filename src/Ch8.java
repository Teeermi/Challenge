public class Ch8 {
    public static void main(String[] args) {
        System.out.println(hasTeen(22,23,34));
    }
    public static boolean hasTeen(int jeden, int dwa, int trzy) {
        if (jeden >= 13 && jeden <=19) {
            return true;
        } else if (dwa >= 13 && dwa <=19) {
            return true;
        } else if (trzy >= 13 && trzy <=19) {
            return true;
        } else {
            return false;
        }
    }

public static boolean isTeen(int iJeden) {
        if (iJeden < 13 || iJeden > 19) {
            return false;
        } else {
            return true;
        }
}

}
