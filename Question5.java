
public class Question5 {

    public static void main(String [] args){
      
      withOutGoto(2);
    }
    
  public static void withOutGoto( int n){
      int x[][] = new int[n][n];

    for ( int i = 1; i < n; i++) {
      
        for ( int j = 1; j < n; j++){

         
          if (x[i][j] != 0){
       break;
          
          }
        System.out.println ("First all-zero row is:"+ i);
          break;
        }
       
    }
  }
    }
  


