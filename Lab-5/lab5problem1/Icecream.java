package lab5problem1;

public class Icecream {
    private String icecreamType, icecreamCompany;
    private double icecreamPrice;

    public Icecream(String icecreamType, String icecreamCompany, double icecreamPrice) {
        this.icecreamType = icecreamType;
        this.icecreamCompany = icecreamCompany;
        this.icecreamPrice = icecreamPrice;
    }

    public Icecream() {
    }

    public String getIcecreamType() {
        return icecreamType;
    }

    public void setIcecreamType(String icecreamType) {
        this.icecreamType = icecreamType;
    }

    public String getIcecreamCompany() {
        return icecreamCompany;
    }

    public void setIcecreamCompany(String icecreamCompany) {
        this.icecreamCompany = icecreamCompany;
    }

    public double getIcecreamPrice() {
        return icecreamPrice;
    }

    public void setIcecreamPrice(double icecreamPrice) {
        this.icecreamPrice = icecreamPrice;
    }

    public String toString() {
        return "icecreamCompany='" + icecreamCompany + '\'' +
                ", icecreamType='" + icecreamType + '\'' +
                ", icecreamPrice=" + icecreamPrice;
    }

    public static void searchByCompany(String searchCompany, Icecream iceCream[]) {
        for (int j = 0; j < 2; j++) {
            if (iceCream[j].getIcecreamCompany().equals(searchCompany)) {
                System.out.println(iceCream[j].toString());
            }
        }
    }
}
