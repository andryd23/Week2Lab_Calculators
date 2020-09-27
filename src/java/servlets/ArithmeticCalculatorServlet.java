
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
          request.setAttribute("result","Result: -----");
       
         
       
         
         
         if(firstNumber !=  null && secondNumber != null || !firstNumber.equals("") && !secondNumber.equals("")) {
             
         int number1 = Integer.parseInt(firstNumber);
         int number2 = Integer.parseInt(secondNumber);
         String calculation = request.getParameter("calculation");
         
                 
         if(calculation.equals("add")){
             request.setAttribute("result","Result: " + (number1 + number2));
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
             return;
         }
         else if(calculation.equals("sub")) {
             request.setAttribute("result", "Result: " + (number1 - number2));
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
             return;
         }
         else if(calculation.equals("multi")) {
             request.setAttribute("result", "Result: " + (number1 * number2));
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
             return;
         }
         else if(calculation.equals("div")) {
             request.setAttribute("result", "Result: " + (number1 / number2));
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
             return;
         }
          
         
     }
         
          else if(firstNumber == null || secondNumber == null || firstNumber.equals(" ") || secondNumber.equals(" ") || firstNumber.matches("^[a-zA-Z]*$") || secondNumber.matches("^[a-zA-Z]*$")) {
             request.setAttribute("result", "Result: Invalid");
         }
         
         
         
         
         
         
  }
      
    

}
