package com.monhikk.springbootinfoproject.ping

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PingController(val pingService: PingService) {

    @GetMapping("/ping")
    fun handlePing(): String {
        return pingService.handlePingRequest()
    }
}
