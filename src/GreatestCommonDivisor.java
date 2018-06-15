import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number a: ");
        a=scanner.nextInt();
        System.out.println("Enter Number b: ");
        b=scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0 && b==0){
            System.out.println("No greatest common divisor");
        }
        else
            if (a==0){
                System.out.println("greatset common divisor= "+b);
            }
            else if (b==0)
            System.out.println("greatest common divisor="+a);
        while (a!=b){
            if(a>b){
                a=a-b;
            }
            else
                b=b-a;
        }
        System.out.println("Greatest common divisor="+a);

    }
}

