public class CallMethod {
     static void myMethod () {
             System.out.println("I just got executed");
             System.out.println("myMethod has been created");
         }
         //Method in another Class is called
         public static void main(String[]args) {
             myMethod();
             myMethod();
     }
}

