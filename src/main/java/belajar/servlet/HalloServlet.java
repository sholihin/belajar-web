/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anggi
 */
public class HalloServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         //get menampilkan request
        
        String x = req.getParameter("nama"); //untuk mengambil request
        String output = "hallo " + x;
        resp.getWriter().print(output); //respon ketika dipanggil
        resp.getWriter().flush(); // memastika bahwa respon dikitim
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //post tidak menampilkan request
        doGet(req, resp);        
    }   
}
