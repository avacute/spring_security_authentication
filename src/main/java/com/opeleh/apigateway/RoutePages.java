package com.opeleh.apigateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class RoutePages {

    @RequestMapping(value="/api/v1/route", method=RequestMethod.GET)
    public String home() {
        return "We are still testing gateway";
    }
    

}