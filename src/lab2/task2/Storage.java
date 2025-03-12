package lab2.task2;

public class Storage {
    private int quantity;
    private double unitPrice;

    public Storage() {
        this.quantity = 0;
        this.unitPrice = 0.0;
    }

    public Storage(int quantity, double unitPrice) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public void changeQuantity(int newQuantity) {
        if (newQuantity >= 0) {
            this.quantity = newQuantity;
        } else {
            System.out.println("Количество товара не может быть отрицательным.");
        }
    }

    public void changeUnitPrice(double newUnitPrice) {
        if (newUnitPrice >= 0) {
            this.unitPrice = newUnitPrice;
        } else {
            System.out.println("Стоимость товара не может быть отрицательной.");
        }
    }

    public double totalCost() {
        return quantity * unitPrice;
    }

    public int compareTo(Storage other) {
        double thisCost = this.totalCost();
        double otherCost = other.totalCost();

        return Double.compare(thisCost, otherCost);
    }

    public static int totalQuantity(Storage... storage) {
        int total = 0;
        for (Storage warehouse : storage) {
            total += warehouse.quantity;
        }
        return total;
    }


}
