/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rahul Bisht
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String age = request.getParameter("age");
        String displayMessage = "";
       
        if(age == null || age.equals("")) 
        {
            request.setAttribute("displayMessage", "Please enter your current age!");
        }
        
        try
        {
            int ageInput = Integer.parseInt(age);
            if (ageInput > 0)
            {
                displayMessage = "Your next birthday will be: " + (ageInput + 1);
                
            }
            else
            {
                displayMessage = "Please give your current age!";
            }
            
         }
        catch (Exception e)
        {
            displayMessage = "PLease give your current age!";
        }
        
        request.setAttribute("displayMessage", displayMessage);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
    }

}
