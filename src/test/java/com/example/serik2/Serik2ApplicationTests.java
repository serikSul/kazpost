package com.example.serik2;

import com.example.serik2.controller.ServiceController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Serik2ApplicationTests {

    @Autowired
    ServiceController controller;

    @Test
    void contextLoads() {
//        controller.postService();
    }

}
