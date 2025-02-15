package com.github.hfantin.client.controllers

import com.github.hfantin.client.services.ClientService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/clients")
class ClientController {

    private val logger = LoggerFactory.getLogger(javaClass.simpleName)

    @Autowired
    private lateinit var clientService: ClientService

    @GetMapping
    fun findAll() = clientService.findAll()


}
