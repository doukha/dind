package com.grtgaz.parametrage.rest

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/health"])
class HealthController {

    @GetMapping
    fun sayOk(): ResponseEntity<String> {


        return ResponseEntity.ok("Settings are fine!!!!")
    }

}
