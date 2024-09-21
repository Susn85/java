class MyException extends Exception {
    String str1;
    MyException(String str2) {
        str1=str2;
    }
    public String toString() {
        return("MyException Occured:"+str1);
    }
}
public class UserDefinedException {
    public static void main(String args[]) {
        try {
            System.out.println("Starting of try block");
            throw new MyException("this is my error message");
        }
        catch(MyException exp) {
            System.out.println("catch block");
            System.out.println(exp);
        }
    }
}



