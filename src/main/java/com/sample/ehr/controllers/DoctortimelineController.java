package com.sample.ehr.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * controller.
 */
@Controller
public class DoctortimelineController {

    @GetMapping("/viewdoctortimeline")
    public String showDoctim() {
        return "doctor/doctortimeline";
    }

}