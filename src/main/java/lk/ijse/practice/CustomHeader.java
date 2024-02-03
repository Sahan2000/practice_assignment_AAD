package lk.ijse.practice;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "customerHeader", value = "/header")
public class CustomHeader extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getHeader("name");
        String city = req.getHeader("city");
        System.out.println("Name : " +name);
        System.out.println("City : " +city);
    }
}
