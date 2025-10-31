package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DummyService {

    public void checkNull() {
        String str = "test";
        System.out.println(str.length());
    }
}
