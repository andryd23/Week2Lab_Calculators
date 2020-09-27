
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
      
        request.setAttribute("result","Result: -----" );
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
      
  }
      
      
      @Override
      protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
          String firstNumber = request.getParameter("firstN");
          String secondNumber = request.getParameter("secondN");
          request.setAttribute("numberOne", firstNumber);
          request.setAttribute("numberTwo", secondNumber);
           
           boolean isNumber = true;
           
             while(isNumber = true) {
                if(!firstNumber.matches("[0-9]*$") || !secondNumber.matches("[0-9]*$")){
                 request.setAttribute("result","Result: Invalid");
                 getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                 return;  
                }
                 else if(firstNumber == null || firstNumber.equals("") || secondNumber == null || secondNumber.equals("")) {
                 request.setAttribute("result","Result: Invalid");
                 getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                 return;      
             }
                break;
            }
             
             
           double firstN = Double.parseDouble(request.getParameter("firstN"));
           double secondN = Double.parseDouble(request.getParameter("secondN"));
        
            String calculation = request.getParameter("calculation");
            
             if(calculation.equals("+")){
             double sum = firstN + secondN;
             request.setAttribute("result","Result: " + sum);
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
             return;
             }
                                
             else if(calculation.equals("-")) {
             double sub = firstN - secondN;
             request.setAttribute("result", "Result: " + sub);
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
             return;
             }
            else if(calculation.equals("*")) {
             double multi = firstN * secondN;
             request.setAttribute("result", "Result: " + multi);
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
             return;
            }
            else if(calculation.equals("%")) {
             double div = firstN / secondN;
             request.setAttribute("result", "Result: " + div);
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
             return;
            }
          
        
          
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
         
         
         
         
         
  }
      
    

}
