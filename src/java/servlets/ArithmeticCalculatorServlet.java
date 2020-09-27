
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet {
    
     @Override
      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
      
      getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
      
      
      
  }
      
      
      @Override
      protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
          String firstNumber = request.getParameter("firstN");
          String secondNumber = request.getParameter("secondN");
          request.setAttribute("numberOne", firstNumber);
          request.setAttribute("numberTwo", secondNumber);
          PrintWriter out = response.getWriter();
          
          if(firstNumber.matches("^[a-zA-Z]*$") || secondNumber.matches("^[a-zA-Z]*$")) {
              request.setAttribute("message", "invalid");   
              getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
              return;
          }
          else if(firstNumber == null && secondNumber == null|| firstNumber.equals("") && secondNumber.equals("")) {
              request.setAttribute("message", "----");  
              getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
              return;
              
          }
          
          
          
         
          
         
      }
      
    

}
