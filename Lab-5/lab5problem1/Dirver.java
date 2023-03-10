package lab5problem1;

import java.util.Scanner;

public class Dirver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Icecream iceCream[] = new Icecream[2];
        for (int i = 0; i < 2; i++) {
            System.out.print("Company Name: ");
            String companyName = input.nextLine();
            System.out.print("Ice Cream Type: ");
            String iceCreamType = input.nextLine();
            System.out.print("iceCreamPrize: ");
            double iceCreamPrice = input.nextDouble();
            iceCream[i] = new Icecream();
            iceCream[i].setIcecreamCompany(companyName);
            iceCream[i].setIcecreamType(iceCreamType);
            iceCream[i].setIcecreamPrice(iceCreamPrice);
            input.nextLine();
        }
        System.out.print("Enter search company name here: ");
        String searchCompanyName = input.nextLine();
        Icecream.searchByCompany(searchCompanyName,iceCream);
    }


}
