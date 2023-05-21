package utilities;

public class ResuableMethods {



    public static void bekle(int saniye) {
        try {
            Thread.sleep((long) (saniye * 1000));
        } catch (InterruptedException var2) {

        }
    }



}
