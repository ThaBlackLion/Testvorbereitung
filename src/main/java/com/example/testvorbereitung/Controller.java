package com.example.testvorbereitung;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    Implementation j = new Implementation();
    @RequestMapping("/YardToMeter")
    public double YardToMeter(@RequestParam double yd) {

        return j.YardToMeter(yd);
    }

    @RequestMapping("/inchesToCentimeter")
    public double inchesToCentimeter(@RequestParam double in){
        return j.inchesToCentimeter(in);
   
    }
}
