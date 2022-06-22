package at.technikum.randomnumber;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomNumberController {

    @GetMapping("/")
    public int randomNumber(){
        Random rn = new Random();
        return rn.nextInt(1,101);
    }


}
