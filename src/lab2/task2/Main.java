package lab2.task2;

public class Main {
    public static void main(String[] args) {
        Storage storage1 = new Storage(10, 5.0);
        Storage storage2 = new Storage(20, 3.0);

        System.out.println("Общая стоимость первого: " + storage1.totalCost());
        System.out.println("Общая стоимость второго: " + storage2.totalCost());

        int comparisonResult = storage1.compareTo(storage2);
        if (comparisonResult > 0) {
            System.out.println("Первое хранилище дороже второго.");
        } else if (comparisonResult < 0) {
            System.out.println("Первое хранилище дешевле второго.");
        } else {
            System.out.println("У обоих одинаковая стоимость.");
        }

        storage1.changeQuantity(15);
        storage1.changeUnitPrice(6.0);
        System.out.println("Общая стоимость первого после изменений: " + storage1.totalCost());

        int totalQuantity = Storage.totalQuantity(storage1, storage2);
        System.out.println("Общее количество товаров на складах: " + totalQuantity);
    }
}
