public class ThrowExamples {
    static void checkEligibility(int stuage, int stuweight) {
        if(stuage<12 && stuweight<40) {
            throw new ArithmeticException("student is not eligble for registration");
        }
        else {
            System.out.println("student entry is valid !");
        }
    }
    public static void main(String args[] ) {
        System.out.println("welcome to the registration process!");
        checkEligibility(10, 39);
        System.out.println("Have a nice day");
    }
  }