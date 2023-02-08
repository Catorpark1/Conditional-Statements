public class LogicalNot {
    public static void main(String[] args) {
        System.out.println("Is the string equal to 'Milk'?");
        String text = "Water";
        if (!(text.equals("Water"))) {//true if the condition text.equals("Water") is false
            System.out.println("No!");
        } else {
            System.out.println("Yes");
        }
    }
}