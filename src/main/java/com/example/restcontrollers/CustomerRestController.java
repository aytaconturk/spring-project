package com.example.restcontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class CustomerRestController {
    @GetMapping("/getCustomer")
    public Map<String, Object> getCustomer(int cid) {
        Map<String, Object> hm = new LinkedHashMap<>();
        hm.put("status", true);
        hm.put("name", "Zehra");
        hm.put("surname", "Bilsin");
        hm.put("cid", cid);
        return hm;
    }

    // Form Gönderim Application
    @GetMapping("/postCustomer")
    public Map<String, Object> postCustomer(int cid) {
        Map<String, Object> hm = new LinkedHashMap<>();
        hm.put("status", true);
        hm.put("name", "Zehra");
        hm.put("surname", "Bilsin");
        hm.put("cid", cid);
        return hm;
    }
}
