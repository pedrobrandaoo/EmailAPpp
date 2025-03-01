import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EmailApp {
    public static void main(String[] args) {

        // Email em1 = new Email("Pedro", "Brandão");
        Scanner in = new Scanner(System.in);
        Email em1 = new Email(in);
        in.close();
    }
}