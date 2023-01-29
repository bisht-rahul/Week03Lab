package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rahul Bisht
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
      
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String firstNum = request.getParameter("first");
        String secondNum = request.getParameter("second");
        String operator = request.getParameter("operator");
        
        
        
         if ((firstNum == null || firstNum.equals("")) && (secondNum != null || secondNum.equals("")))
                 {
                     
                     request.setAttribute("message", "Enter Correct Number");
                     getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                     return;
                 }
        try
        {
               request.setAttribute("first", firstNum);
               request.setAttribute("second", secondNum);
        
           int firstInput = Integer.parseInt(firstNum);
           int secondInput = Integer.parseInt(secondNum);
           int result = 0; 
           
           if(operator.equals("+"))
           {
               result = firstInput + secondInput;
           }
   
           if(operator.equals("-"))
           {
               result = firstInput - secondInput;
           }
           if(operator.equals("*"))
           {
               result = firstInput * secondInput;
           }
           if(operator.equals("%"))
           {
               result = firstInput % secondInput;
           }
        }
        
        catch(Exception e)
        {
            request.setAttribute("first", firstNum);
            request.setAttribute("second", secondNum);
            request.setAttribute("result", "Result: invalid");
            getServletContext().getRequestDispatcher("WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
    }

}
