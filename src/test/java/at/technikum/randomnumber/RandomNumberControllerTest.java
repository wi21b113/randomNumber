package at.technikum.randomnumber;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

import static org.junit.Assert.*;

public class RandomNumberControllerTest {


    @Test
    public void randomNumberTrue() {
        Random rn = new Random();
        int toProveOk = rn.nextInt(1,101);
        Assertions.assertTrue(toProveOk > 0);
    }
}