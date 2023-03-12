import com.sun.tools.javac.Main;

public class Main1 {
    int x;
    public Main1 (){
        x=5;
    }
    public static void main (String[] args) {
        Main1 myObj = new Main1();
        System.out.println(myObj.x);
    }
}
