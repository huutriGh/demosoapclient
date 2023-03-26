package com.example.demosoapclient;

import java.io.*;

import com.example.soap.ws.client.generated.Greeting;
import com.example.soap.ws.client.generated.GreetingService;
import com.example.soap.ws.client.generated.Student;
import jakarta.inject.Inject;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        GreetingService greetingService = new GreetingService();
        Greeting greeting = greetingService.getGreetingPort();
        Student student = greeting.getStudent();

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + student.getName() + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}