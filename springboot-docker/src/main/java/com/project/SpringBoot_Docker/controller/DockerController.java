package com.project.SpringBoot_Docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



    @RestController
    public class DockerController {

        @GetMapping("/docker")
        public String  dockerdemo(){

            return "dockerizing springboot application";

        }
}
