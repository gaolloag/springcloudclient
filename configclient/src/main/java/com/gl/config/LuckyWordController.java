package com.gl.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LuckyWordController {

    @Value("${lucky-word}") String luckyWord;
    @Value("${lucky-word-role}") String luckyWordRole;

    @RequestMapping("/lucky-word")
    public String showLuckyWord() {
        return "The lucky word is: " + luckyWord + ",The lucky word Role is: " + luckyWordRole;
    }
}
