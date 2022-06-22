package at.technikum.randomnumber;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberControllerTest {

    @Test
    void randomNumberTrue() {
        Random rn = new Random();
        int toProveOk = rn.nextInt(1,101);
        Assert.assertTrue(toProveOk > 0 && toProveOk < 101);
    }

    @Test
    void randomNumberFalse() {
        Random rn = new Random();
        int toProveOk = rn.nextInt(1,101);
        Assert.assertNotEquals(toProveOk,null);
    }
}