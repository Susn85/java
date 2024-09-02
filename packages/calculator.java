package calculator ;
  public  class calculator
    {
   public static void main(String[] args) {
      
   }
  }
      class addition {
          int a,b;
         addition (int x , int y) {
            a=x;
            b=y;
         }
            public int add(int a, int b)
            {
                return (a+b);
                 }
                 }
                   class subtraction {
                     int a,b;
                     subtraction (int x, int y){
                        a=x;
                        b=y;
                     }
                       public int subtract (int a,  int b){
                             return (a-b);
                               }
                               }
                                 class multiply {
                                    int a,b;
                                    multiply(int x, int y){
                                       a=x;
                                       b=y;
                                    }
                                   public int multi(int a, int b){
                                       return (a*b);
                                         }
                                         }
                                           class divide {
                                             int a,b;
                                             divide(int x, int y){
                                                a=x;
                                                b=y;
                                             }
                                             public int divi(int a,  int b){
                                                 if (b ==0) {
                                                      throw new ArithmeticException("cannot divide by zero");
                                                           }
                                                                return (a/b);
                                                                   
                                                                     }
                                                                     } 
