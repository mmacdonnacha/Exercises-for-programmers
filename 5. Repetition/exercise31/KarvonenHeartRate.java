import java.util.Scanner;

public class KarvonenHeartRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String restingHRStr = "";
        String ageStr = "";
        boolean isNotValid = true;

        while(isNotValid){
            System.out.print("What is your resting heart rate? ");
            restingHRStr = scanner.nextLine();

            System.out.print("What is your age? ");
            ageStr = scanner.nextLine();

            if(restingHRStr.matches("[0-9]+") && ageStr.matches("[0-9]+")){
                isNotValid = false;
            }else{
                System.out.println("Invalid inputs. Only enter digits.");
            }
        }
        scanner.close();

        int restingHR = Integer.parseInt(restingHRStr);
        int age = Integer.parseInt(ageStr);

        printHeartRateTable(restingHR, age);
    }

    public static void printHeartRateTable(int heartRate, int age){
        System.out.printf("Resting Pulse: %d    Age: %d\n\n", heartRate, age);

        System.out.printf("Intensity    | Rate\n");
        System.out.printf("-------------|--------\n");

        for(int i=55; i<100; i+=5){
            double intensity = i/100.0;
            int bpm = (int)(((220 - age) - heartRate) * intensity) + heartRate;

            System.out.printf("%d%%          | %d bpm\n", i, bpm);
        }
    }
}
