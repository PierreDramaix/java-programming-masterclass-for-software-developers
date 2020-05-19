public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kiloBytes){

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int remainderOfKiloBytes = kiloBytes % 1024;
            int megaByteFromKiloBytes = kiloBytes / 1024;

            System.out.println(kiloBytes + " KB = " + megaByteFromKiloBytes +
                    " MB and " + remainderOfKiloBytes + " KB");
        }
    }
}
