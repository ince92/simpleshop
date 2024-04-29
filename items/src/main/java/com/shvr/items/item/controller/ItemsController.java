package com.shvr.items.item.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/items")
public class ItemsController {

    @GetMapping
    public String helloitem(){
        return "hello112";
    }

}
