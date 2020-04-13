package com.example.config_client_server.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author QuanZhi.Song
 * @create 2020/4/9 20:35
 * @discription:
 */
@RestController
public class ConfigController {
    @Value("${profiles}")
    private String gitConfigName;

    @GetMapping("/hello")
    public String fromGitHubServer(){
        return gitConfigName;
    }
}
