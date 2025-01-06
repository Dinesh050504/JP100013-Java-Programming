import java.util.Scanner;

public class Unitconversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Unit Conversion Tool!");
        System.out.println("Choose a conversion type:");
        System.out.println("1. Length");
        System.out.println("2. Weight");
        System.out.println("3. Temperature");
        System.out.print("Enter your choice (1-3): ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1: // Length conversions
                System.out.println("Length Conversion:");
                System.out.println("1. Meters to Kilometers");
                System.out.println("2. Kilometers to Meters");
                System.out.println("3. Miles to Kilometers");
                System.out.println("4. Kilometers to Miles");
                System.out.print("Enter your choice (1-4): ");
                int lengthChoice = scanner.nextInt();
                
                System.out.print("Enter the value to convert: ");
                double lengthValue = scanner.nextDouble();
                double lengthResult;
                
                switch (lengthChoice) {
                    case 1:
                        lengthResult = lengthValue / 1000;
                        System.out.println(lengthValue + " meters is " + lengthResult + " kilometers.");
                        break;
                    case 2:
                        lengthResult = lengthValue * 1000;
                        System.out.println(lengthValue + " kilometers is " + lengthResult + " meters.");
                        break;
                    case 3:
                        lengthResult = lengthValue * 1.60934;
                        System.out.println(lengthValue + " miles is " + lengthResult + " kilometers.");
                        break;
                    case 4:
                        lengthResult = lengthValue / 1.60934;
                        System.out.println(lengthValue + " kilometers is " + lengthResult + " miles.");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                break;
                
            case 2: // Weight conversions
                System.out.println("Weight Conversion:");
                System.out.println("1. Grams to Kilograms");
                System.out.println("2. Kilograms to Grams");
                System.out.println("3. Pounds to Kilograms");
                System.out.println("4. Kilograms to Pounds");
                System.out.print("Enter your choice (1-4): ");
                int weightChoice = scanner.nextInt();
                System.out.print("Enter the value to convert: ");
                double weightValue = scanner.nextDouble();
                double weightResult;
                
                switch (weightChoice) {
                    case 1:
                        weightResult = weightValue / 1000;
                        System.out.println(weightValue + " grams is " + weightResult + " kilograms.");
                        break;
                    case 2:
                        weightResult = weightValue * 1000;
                        System.out.println(weightValue + " kilograms is " + weightResult + " grams.");
                        break;
                    case 3:
                        weightResult = weightValue * 0.453592;
                        System.out.println(weightValue + " pounds is " + weightResult + " kilograms.");
                        break;
                    case 4:
                        weightResult = weightValue / 0.453592;
                        System.out.println(weightValue + " kilograms is " + weightResult + " pounds.");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                break;
              

            case 3: // Temperature conversions
                System.out.println("Temperature Conversion:");
                System.out.println("1. Celsius to Fahrenheit");
                System.out.println("2. Fahrenheit to Celsius");
                System.out.println("3. Celsius to Kelvin");
                System.out.println("4. Kelvin to Celsius");
                System.out.println("5. Fahrenheit to Kelvin");
                System.out.println("6. Kelvin to Fahrenheit");
                System.out.print("Enter your choice (1-6): ");
                int tempChoice = scanner.nextInt();
                
                System.out.print("Enter the value to convert: ");
                double tempValue = scanner.nextDouble();
                double tempResult;
                
                switch (tempChoice) {
                    case 1:
                        tempResult = (tempValue * 9/5) + 32;
                        System.out.println(tempValue + " Celsius is " + tempResult + " Fahrenheit.");
                        break;
                    case 2:
                        tempResult = (tempValue - 32) * 5/9;
                        System.out.println(tempValue + " Fahrenheit is " + tempResult + " Celsius.");
                        break;
                    case 3:
                        tempResult = tempValue + 273.15;
                        System.out.println(tempValue + " Celsius is " + tempResult + " Kelvin.");
                        break;
                    case 4:
                        tempResult = tempValue - 273.15;
                        System.out.println(tempValue + " Kelvin is " + tempResult + " Celsius.");
                        break;
                    case 5:
                        tempResult = (tempValue - 32) * 5/9 + 273.15;
                        System.out.println(tempValue + " Fahrenheit is " + tempResult + " Kelvin.");
                        break;
                    case 6:
                        tempResult = (tempValue - 273.15) * 9;
                }
        }
    }
}                        
