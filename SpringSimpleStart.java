package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller  // This will return an HTML page instead of plain text
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    // Show the input form
    @GetMapping("/")
    public String showForm() {
        return "form"; // This will look for form.html in src/main/resources/templates
    }

    // Process the submitted form
    @PostMapping("/submit")
    public String processForm(@RequestParam String name, Model model) {
        model.addAttribute("userName", name);
        return "result"; // This will look for result.html in src/main/resources/templates
    }
}

// form.html
// <!DOCTYPE html>
// <html lang="en">
// <head>
//     <meta charset="UTF-8">
//     <title>Input Form</title>
// </head>
// <body>
//     <h2>Enter Your Name:</h2>
//     <form action="/submit" method="post">
//         <label>Name:</label>
//         <input type="text" name="name" required>
//         <button type="submit">Submit</button>
//     </form>
// </body>
// </html>


// result.html
// <!DOCTYPE html>
// <html lang="en">
// <head>
//     <meta charset="UTF-8">
//     <title>Result</title>
// </head>
// <body>
//     <h2>Hello, <span th:text="${userName}"></span>!</h2>
//     <a href="/">Go back</a>
// </body>
// </html>
