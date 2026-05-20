import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Divison\n5.Modulo");
        System.out.println("Enter your choice: ");
        int op = sc.nextInt();
        switch(op) {
            case 1: System.out.println("Addition: "+(a+b));
            break;
            case 2: System.out.println("Substraction: "+(a-b));
            break;
            case 3: System.out.println("Multiplication: "+(a*b));
            break;
            case 4: System.out.println("Division: "+((float)a/b));
            break;
            case 5: System.out.println("Modulo: "+((float)(a%b)));
            break;
            default: System.out.println("Invalid Operation");
        }
        sc.close();
    }
}