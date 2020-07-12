package com.gl.microservices.netflixeurekanamingserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "healthcheck")
public class HealthCheckController {

  @GetMapping(value = "")
  public String status(){
    return "GREEN";
  }
}
