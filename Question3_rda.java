import java.util.*;
public class Question3_rda {

   static char nextToken;
   static char IDENT = 'A';
   static char OR = '|', AND = '&', NOT = '!', LEFT_PAREN = '(', RIGHT_PAREN = ')',
   INT_LIT, ADD_OP ='+',SUB_OP='-',MUL_OP='*',DIV_OP='/',MOD_OP='%', ASSIGN_OP;
  
   public static void main(String [] args){
      Assign_stmt();
      
   }
  
   public static void lex(){
   
      Scanner sc = new Scanner(System.in);
      while(sc.hasNext()){
      
         nextToken = sc.next().charAt(0);
      }
   }
  
   public static void error(){
      System.out.println("there's an error");
   }
  
/* Assignment statement */
   public static void Assign_stmt(){
      System.out.println("Enter <assign_stmt>");
      lex();
      if(nextToken == IDENT){ // checks if the token is an id
         lex();
      } else{
         error();
      }
      while(nextToken == ASSIGN_OP){ // checks whether nextToken is assignment operator and return true or false 
         lex();
      
         Boolean_expr();// boolean_expr is called and checked whether there's a boolean expr
      
         
         Math_expr();//math_expr is called and checked whether there's a math expr
      }
   
   }
    
   /* Boolean Expression */
 
   public static void Boolean_expr() {
      System.out.printf("Enter <boolean_expr>");
     
      Boolean_term();
     
      if (nextToken == OR) {
         lex();
         Boolean_term();
      }
      System.out.println("Exit <Booelean_expr>");
   }
 
   public static void Boolean_term() {
      System.out.printf("Enter <Boolean_term>");
     
      Boolean_factor();
     
      while (nextToken == AND) {
         lex();
         Boolean_factor();
      }
      System.out.println("Exit <Boolean_term>");
   }
 
   public static void Boolean_factor() {
      System.out.println("Enter <factor>");
     
      if (nextToken == NOT){
         
         lex();
         
         if (nextToken == LEFT_PAREN) {
            lex();
            Boolean_expr();
         }
         else if (nextToken == RIGHT_PAREN){
            lex();
         }else{
            error();
         }
      }
          
      System.out.println("Exit <Boolean_factor>");
   }
 
 /* Mathematical Expression */
 
   public static void Math_expr() {
      System.out.println("Enter <Math_expr>");
      Math_term();
      while (nextToken == ADD_OP || nextToken == SUB_OP) {
         lex();
         Math_term();
      }
      System.out.println("Exit <Math_expr>");
   }
 
   public static void Math_term() {
      System.out.println("Enter <Math_term>");
     
      Math_factor();
     
      while (nextToken == MUL_OP || nextToken == DIV_OP || nextToken == MOD_OP) {
         lex();
         Math_factor();
      }
      System.out.println("Exit <term>");
   }
 
   public static void Math_factor() {
      System.out.println("Enter <factor>");
    
      if (nextToken == IDENT || nextToken == INT_LIT){
         
         lex();
         
      }else if (nextToken == LEFT_PAREN) {
         lex();
         Math_expr();
      }
      else if (nextToken == RIGHT_PAREN){
         lex();
      }else{
         error();
      }
         
      System.out.println("Exit <Math_factor> ");
   }
}