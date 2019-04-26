package com.grtgaz.parametrage.config

import generated.ZWSPARAMETRAGEHTTPS_Service
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SettingConfig {

    @Bean
    fun getSetting(): ZWSPARAMETRAGEHTTPS_Service {
        return ZWSPARAMETRAGEHTTPS_Service()
    }
}