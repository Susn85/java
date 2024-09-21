import java.io.*;
class ThrowExamples {
    void myMethod(int num)throws IOException,ClassNotFoundException {
        if(num ==1) 
        throw new IOException("IOEXception Occured!");
        else 
          throw new ClassNotFoundException("ClassNotFoundException");
    }
}
public class Examples1 {
    public static void main(String args[]) {
        try {
            ThrowExamples obj=new ThrowExamples();
            obj.myMethod(1);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
}