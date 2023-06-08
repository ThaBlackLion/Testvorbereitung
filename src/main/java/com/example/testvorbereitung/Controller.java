package com.example.testvorbereitung;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    Implementation imp=new Implementation();

    @RequestMapping("/inchesToCentimeter")
    public double inchesToCentimeter(@RequestParam double in){
        return imp.inchesToCentimeter(in);
    }
}
