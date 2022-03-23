package com.monhikk.springbootinfoproject.ping

import org.springframework.stereotype.Service

@Service
class PingService {
    fun handlePingRequest(): String {
        return "Pong!"
    }
}
