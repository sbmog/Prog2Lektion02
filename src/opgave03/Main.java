package opgave03;

import opgave03.model.SASBusiness;
import opgave03.model.SASGoLight;
import opgave03.model.SASGoSmart;
import opgave03.model.TicketType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vælg billettype: (1) SAS Go Light, (2) SAS Go Smart, (3) SAS Business");
        int choice = scanner.nextInt();
        TicketType ticketType;
        switch (choice) {
            case 1 -> ticketType = new SASGoLight();
            case 2 -> ticketType = new SASGoSmart();
            case 3 -> ticketType = new SASBusiness();
            default -> {
                System.out.println("Ugyldigt valg!");
                return;
            }
        }

        System.out.println("Hvor mange ekstra håndbagage vil du tilkøbe?");
        int extraHandLuggage = scanner.nextInt();

        System.out.println("Hvor mange ekstra indchecket bagage vil du tilkøbe?");
        int extraCheckedBags = scanner.nextInt();

        System.out.println("Hvor meget vejer din tungeste bagage?");
        double heavyBagWeight = scanner.nextDouble();

        int totalPrice = ticketType.calculateExtraCost(extraHandLuggage, extraCheckedBags, heavyBagWeight);
        System.out.println("Total bagagepris for " + ticketType.getTypeName() + ": " + totalPrice + " kr.");
    }
}