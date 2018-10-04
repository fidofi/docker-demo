package com.fidofi.dockerdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: fido
 * @date: 2018/10/4 18:11
 * @description:
 */
@RestController
public class DockerController {
  @RequestMapping("/hello")
  public String test(@RequestParam("name") String name) {
    return "hello," + name;
  }
}
