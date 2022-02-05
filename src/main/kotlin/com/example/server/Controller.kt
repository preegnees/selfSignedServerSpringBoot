package com.example.server

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@ResponseBody
class Controller {
    @GetMapping("/")
    fun get(): String {
        return "hello"
    }
}