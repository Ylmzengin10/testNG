package tests.practıce;

import org.testng.annotations.Test;

import java.util.Properties;

public class P01 {


    @Test(priority = 10)
    public void Didem(){
        System.out.println("Didem");
    }

    @Test
    public void zeynep(){
        System.out.println("Zeynep");
    }
    @Test(priority = -5)
    public void kadir(){
        System.out.println("kadir");
    }
}
