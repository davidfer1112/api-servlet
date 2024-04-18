package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/parametros/url-get")
public class ParametroGetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String saludo = req.getParameter("saludo");
        String nombre = req.getParameter("nombre");

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("    <head>");
        out.println("        <meta charset=\"UTF-8\">");
        out.println("        <title>Parametros Get de la url</title>");
        out.println("    </head>");
        out.println("    <body>");
        out.println("        <h1>Parametros Get de la url</h1>");
        if (saludo != null && nombre != null) {
            out.println("        <p>El saludo es: " + saludo + " "+ nombre+"</p>");
        }else if(saludo != null){
            out.println("        <p>El saludo es: " + saludo + "</p>");
        } else if (nombre != null){
            out.println("        <p>El nombre es: " + nombre + "</p>");
        } else{
            out.println("        <p>No se han recibido parametros</p>");
        }
        try {
            int codigo = Integer.parseInt(req.getParameter("codigo"));
            out.println("        <p>El codigo es: " + codigo + "</p>");
        } catch (NumberFormatException e) {
            out.println("        <p>No se ha recibido un codigo valido</p>");
        }
        out.println(    "</body>");
        out.println("</html>");
    }


}

