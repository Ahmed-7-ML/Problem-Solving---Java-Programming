import org.intellij.lang.annotations.Language;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWebController {

    @GetMapping("/")
    public String homePage() {
        // هنا بنستخدم الـ Annotation عشان IntelliJ يفهم إن ده HTML
        @Language("HTML")
        String htmlContent = """
                <!DOCTYPE html>
                <html>
                <head>
                    <title>My First Java Webpage</title>
                    <style>
                        body { font-family: Arial, sans-serif; text-align: center; background-color: #f4f4f4; }
                        h1 { color: #2c3e50; }
                        p { color: #7f8c8d; }
                    </style>
                </head>
                <body>
                    <h1>Welcome to my Java Website!</h1>
                    <p>This page is served by a Spring Boot Controller.</p>
                    <button onclick="alert('Hello from Java!')">Click Me</button>
                </body>
                </html>
                """;

        return htmlContent;
    }
}