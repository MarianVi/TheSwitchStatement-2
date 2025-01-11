import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO

        String luna = scanner.nextLine();

        switch (luna) {
            case "Ianuarie":
            case "Martie":
            case "Mai":
            case "Iulie":
            case "August":
            case "Octombrie":
            case "Decembrie":
                System.out.println("Luna " + luna + " are 31 zile.");
                break;
            case "Aprilie":
            case "Iunie":
            case "Septembrie":
            case "Noiembrie":
                System.out.println("Luna " + luna + " are 30 zile.");
                break;
            case "Februarie":
                System.out.println("Luna " + luna + " are 28 zile.");
                break;
            default:
                System.out.println("Luna invalida!");
        }

        scanner.close();
    }
}