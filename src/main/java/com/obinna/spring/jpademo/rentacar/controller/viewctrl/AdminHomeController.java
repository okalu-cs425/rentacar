package com.obinna.spring.jpademo.rentacar.controller.viewctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminHomeController {

    @GetMapping(value = {"/", "/rentacar"})
    public String displayHomepage() {
        return "public/home/index";
    }
}
