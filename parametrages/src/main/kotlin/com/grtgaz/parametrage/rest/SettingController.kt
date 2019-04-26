package com.grtgaz.parametrage.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/settings"])
class SettingController {


    @GetMapping("/test")
    fun callTest(): String {
        return "Hello !!"
    }


}