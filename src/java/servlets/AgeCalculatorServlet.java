

package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class AgeCalculatorServlet extends HttpServlet {
    
   
    
    @Override
      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
      
      getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
   
      
  }
    
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String userAge;
        userAge = request.getParameter("user_age");
        request.setAttribute("ageUser", userAge);
        
         if(userAge == null || userAge.equals("")) {
            request.setAttribute("message", "You must give your current age.");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
            
            }
         
            else if(userAge.matches("^[a-zA-Z]*$")) {
            request.setAttribute("message", "Your must enter a number");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;        
            }
            
            else if(userAge.matches("^[0-9]*$")) {
            int nextAge = Integer.parseInt(userAge) ;
            nextAge = nextAge + 1;
            request.setAttribute("message", "Your age next birthday will be " + nextAge);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
            }
         
         
       
          
          
        } 
         
  
            
   }
    
    
    
    
    
      
    
     

       
          
     
    
      
     
    
    
    


