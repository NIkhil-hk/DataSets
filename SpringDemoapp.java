package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    // Show the input form
    @GetMapping("/")
    public String showForm() {
        return "sum-form"; // Loads the HTML file from "templates"
    }

    // Process the form submission
    @PostMapping("/calculate")
    public String calculateSum(@RequestParam int num1, @RequestParam int num2, Model model) {
        int sum = num1 + num2;
        model.addAttribute("result", sum);
        return "result"; // Loads the result page
    }
}


SpringBootApp/
│── src/main/java/com/example/demo/DemoApplication.java
│── src/main/resources/templates/sum-form.html
│── src/main/resources/templates/result.html
│── src/main/resources/application.properties
│── pom.xml
