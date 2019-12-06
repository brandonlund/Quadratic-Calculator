import java.util.Scanner;

public class Main {

    public static double A, B, C;

    public static void main(String args[]){

        enterNum();
        printOut();

    }

    public static void enterNum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a: ");
        double a = input.nextDouble();
        System.out.println("You've entered " + a + " for a.\n--------------------------");
        A = a;

        System.out.println("Please enter b: ");
        double b = input.nextDouble();
        System.out.println("You've entered " + b + " for b.\n--------------------------");
        B = b;

        System.out.println("Please enter c: ");
        double c = input.nextDouble();
        System.out.println("You've entered " + c + " for c.\n--------------------------");
        C = c;
        
        input.close();
    }

    public static void printOut(){

        System.out.println("The answer is: ");

        System.out.println("x = " + solvePos() + ", " + solveNeg());

        if(A > 1 || A < 1){
            if(solvePos() >= 0 && solveNeg() >= 0){
                System.out.println(A + "(x - " + solvePos() + ")(x - " + solveNeg() + ")");
            }
        
            else if(solvePos() <= 0 && solveNeg() >= 0){
                System.out.println(A + "(x + " + -solvePos() + ")(x - " + solveNeg() + ")");
            }

            else if(solvePos() >= 0 && solveNeg() <= 0){
                System.out.println(A + "(x - " + solvePos() + ")(x + " + -solveNeg() + ")");
            }

            else if(solvePos() <= 0 && solveNeg() <= 0){
                System.out.println(A + "(x + " + -solvePos() + ")(x + " + -solveNeg() + ")");
            }
        }else{
            if(solvePos() >= 0 && solveNeg() >= 0){
                System.out.println("(x - " + solvePos() + ")(x - " + solveNeg() + ")");
            }
        
            else if(solvePos() <= 0 && solveNeg() >= 0){
                System.out.println("(x + " + -solvePos() + ")(x - " + solveNeg() + ")");
            }

            else if(solvePos() >= 0 && solveNeg() <= 0){
                System.out.println("(x - " + solvePos() + ")(x + " + -solveNeg() + ")");
            }

            else if(solvePos() <= 0 && solveNeg() <= 0){
                System.out.println("(x + " + -solvePos() + ")(x + " + -solveNeg() + ")");
            }
        }
        
    }

    public static double solvePos(){
        double px = (-B + Math.sqrt(B*B - 4*A*C))/(2*A);
        return px;
    }

    public static double solveNeg(){
        double nx = (-B - Math.sqrt(B*B - 4*A*C))/(2*A);
        return nx;
    }

}