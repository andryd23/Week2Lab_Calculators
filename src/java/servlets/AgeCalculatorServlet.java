

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
                    
        
        String userAge = request.getParameter("user_age");
        int nextAge;
        
        boolean number = true;
        
       while(number = true) {
           if(userAge.matches("^[a-zA-Z]+$")){
               number = false;
           }
           break;
       }
        
         
         if(userAge == null || userAge.equals("")) {
            request.setAttribute("message", "You must enter your current age");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
            
        }
         
        if(number = false){
            request.setAttribute("message", "You must enter a number");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
         }
         
        else {  
        nextAge = Integer.parseInt(userAge) ;
        nextAge = nextAge + 1;
        request.setAttribute("message", "Your age next birthday will be " + nextAge);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;
        }
        
        
        
        
        
        
        
        
        
        
 
        
   
    }
    
         
    
      
      
      
      
      
      
    }
    
   
    
    
    
    
    
    


           
         
         
       
         
  
            
   
    
    
    
    
    
      
    
     

       
          
     
    
      
     
    
    
    


