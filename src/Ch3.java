public class Ch3 {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes;
        int remKiloBytes = 0;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        megaBytes = (kiloBytes / 1024);
        remKiloBytes = (kiloBytes % 1024);
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remKiloBytes + " KB");

    }
}
