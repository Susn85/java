package cal.calculator;
  public  class Calculator
      {
            public int add(int a, int b)
            {
                return (a+b);
                 }

                       public int subtract (int a,  int b){
                             return (a-b);
                               }

                                   public int multi(int a, int b){
                                       return (a*b);
                                         }

                                             public int divi(int a,  int b){
                                                 if (b ==0) {
                                                      throw new ArithmeticException("cannot divide by zero");
                                                           }
                                                                return (a/b);
                                                                   
                                                                     }
                                                                     } 
