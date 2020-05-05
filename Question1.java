
import java.util.*;
public class Question1 {

      public static void main( String [] args){
                
                public static void main( String [] args){
                
               System.out.println("Enter a string, float, int or variable_name:");
                Scanner sc = new Scanner(System.in);
                 
                while(sc.hasNextLine()){
                      
                      String input = sc.nextLine();
                      String[] word = input.split(" ");
                      
                       for(int i = 0; i< word.length; i++){
                       
                         
                         if(word[i].contains(".")){
                         
                     
                     System.out.print(word[i]+" is a float_lit\n");
                     
                     }else if(word[i].contains("")){ 
                     
                      System.out.print(word[i]+" is a string_lit\n");
                      
                     }else if(word[i].contains("123456789")){
                      
                      System.out.print(word[i]+" is an integer_lit");
                      
                      
                      } else { System.out.print(word[i]+ " is a variable name\n");
                      
                      }
                      
                                          
                     }                 
                     
                      }
                }
        }
        }
        
           
    
        

