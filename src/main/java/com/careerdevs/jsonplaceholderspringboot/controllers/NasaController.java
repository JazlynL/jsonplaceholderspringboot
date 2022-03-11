package com.careerdevs.jsonplaceholderspringboot.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/nasa")

public class NasaController {

 // this where we store variables to secure our API key
    @Autowired
    private Environment env;

    private String nasaEndPoint = "https://api.nasa.gov/planetary/apod?api_key=9tjju385WzPEvldot0EP3CyASStZZuXEE2r2jrAX"

            /*
             Method : Get
             Path : nasa/apod
             host: localhost:4000
             Url:http:// localhost:4000
             */


@GetMapping("apod")
    public Object route(RestTemplate restTemplate){
        String apiKey = env.getProperty("NASA_API_KEY");
        return restTemplate.getForObject(nasaEndPoint + apiKey , Object.class);

    }

    @Override
    public String toString() {
        return "NasaController{" +
                "nasaEndPoint='" + nasaEndPoint + '\'' +
                '}';
    }
}
