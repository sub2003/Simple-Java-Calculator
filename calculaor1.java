import java.util.Scanner;
public class calculaor1{
    public static void main(String[]args){
        Scanner q1=new Scanner(System.in);

        double Numbers[]=new double[2];
        int c=0;
        double total=0;

        while(true){
            total=0;
            System.out.println("Select option.");
            System.out.println("1.Add       : +");
            System.out.println("2.Subtract  : -");
            System.out.println("3.Multiply  : *");
            System.out.println("4.Divide    : /");
            System.out.println("5.Power     : ^");
            System.out.println("6.Remainder : %");
            System.out.println("7.Terminate : #");
            System.out.println("8.Reset     : $");
            System.out.print("Enter choice(+,-,*,/,^,%,#,$): ");
            char choice=q1.next().charAt(0);

            switch (choice) {
                case '#':
                    System.out.println("Done. Terminating");
                    return;
                case '$':
                    continue;
                case '+':
                case '-':
                case '*':
                case '/':
                case '%':
                case '^':
                    break;
                default:
                    System.out.println("Unrecognized operation");
            }
            
            while (true) {
                System.out.print("Enter first number: ");
                
                if(q1.hasNextDouble()){
                    Numbers[0]=q1.nextDouble();
                    break;
                }
                else{
                System.out.println("Not a valid number.please enter again");
                q1.next();
                continue;
                }
            }

            while (true) {
                System.out.print("Enter second number: ");
                
                if(q1.hasNextDouble()){
                    Numbers[1]=q1.nextDouble();
                    break;
                }
                else{
                System.out.println("Not a valid number.please enter again");
                q1.next();
                continue;
                }
            }
            
            switch(choice){
                case '+':
                    total=Numbers[0]+Numbers[1];
                    break;
                case '-':
                    total=Numbers[0]-Numbers[1];
                    break;
                case '*':
                    total=Numbers[0]*Numbers[1];
                    break;
                case '/':
                    total=Numbers[0]/Numbers[1];
                    break;
                case '^':
                    total=Math.pow(Numbers[0],Numbers[1]);
                    break;
                case '%':
                    total=Numbers[0]%Numbers[1];
                    break;
                default:
                    System.out.println("Something Went Wrong");
            }
            if(choice=='/' || choice=='%')
                if(Numbers[1]==0){
                    System.out.println("float division by zero");
                    total = Double.NaN;
                }
            
            System.out.println(Numbers[0]+" "+choice+" "+Numbers[1]+" = "+total);
            

        }
    
    
    }
}