package com.example.datefinder;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class MyController{
    @GetMapping("/")
    public String getDate(){
        LocalDate now = LocalDate.now();
        LocalDate sumDays = now.plusDays(100);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String strDate = sumDays.format(formatter);
        return strDate;
    }
}