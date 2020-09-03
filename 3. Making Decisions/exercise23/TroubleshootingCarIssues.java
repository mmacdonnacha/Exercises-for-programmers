import java.util.Scanner;

public class TroubleshootingCarIssues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        String yesNo = scanner.nextLine().toLowerCase();

        if(yesNo.equals("y") || yesNo.equals("yes")){
            System.out.print("Are the battery terminals corroded? ");
            yesNo = scanner.nextLine().toLowerCase();

            if(yesNo.equals("y") || yesNo.equals("yes")){
                System.out.print("Clean terminals and try starting again.");
            }else{
                System.out.print("Replace cables and try again.");
            }

        }else{
            System.out.print("Does the car make a clicking noise? ");
            yesNo = scanner.nextLine().toLowerCase();

            if(yesNo.equals("y") || yesNo.equals("yes")){
                System.out.print("Replace the battery.");
            
            }else{
                System.out.print("Does the car crank up but fail to start? ");
                yesNo = scanner.nextLine().toLowerCase();

                if(yesNo.equals("y") || yesNo.equals("yes")){
                    System.out.print("Check spark plug connections.");
                
                }else{
                    System.out.print("Does the engine start and then die? ");
                    yesNo = scanner.nextLine().toLowerCase();

                    if(yesNo.equals("y") || yesNo.equals("yes")){
                        System.out.print("Does your car have fuel injection? ");
                        yesNo = scanner.nextLine().toLowerCase();

                        if(yesNo.equals("y") || yesNo.equals("yes")){
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }else{
                            System.out.print("Get it in for service.");
                        }

                    }else{
                        System.out.print("Go to the garage.");
                    }
                }
            }

        }

        scanner.close();
    }
}