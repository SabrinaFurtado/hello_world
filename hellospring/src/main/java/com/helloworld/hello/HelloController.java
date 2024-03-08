package com.helloworld.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/bsms")
    public List<String> getBsms() {
        // Simulated list of BSMs (replace with real data)
        return Arrays.asList("- ORIENTAÇÃO AO FUTURO\r\n"
        		+ "- RESPONSABILIDADE PESSOAL\r\n"
        		+ "- MENTALIDADE DE CRESCIMENTO\r\n"
        		+ "- PERSISTÊNCIA");
    }

    @GetMapping("/learning-objectives")
    public List<String> getLearningObjectives() {
        // Your learning objectives for the week
        return Arrays.asList(
        		"Aprender Spring Boot",
                "Pratique os endpoints REST",
                "Entender a injeção de dependência"
        );
    }
}
