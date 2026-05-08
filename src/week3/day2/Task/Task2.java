package week3.day2.Task;

public class Task2 {
    static void main(String[] args) {
        Product hammerHandle = new Product("Рукоять молотка", 10);
        Product hammerHead = new Product("Боёк молотка", 11);
        Product hammerScrew = new Product("Винт для молотка", 9);
        Product hammer = new Product("Молоток", 0);

        hammer.craftHammer(hammerHandle, hammerHead, hammerScrew, hammer);
        hammer.craftHammer(hammerHandle, hammerHead, hammerScrew, hammer);
        hammer.craftHammer(hammerHandle, hammerHead, hammerScrew, hammer);
        hammer.craftHammer(hammerHandle, hammerHead, hammerScrew, hammer);
        hammer.craftHammer(hammerHandle, hammerHead, hammerScrew, hammer);
        hammer.craftHammer(hammerHandle, hammerHead, hammerScrew, hammer);
        hammer.craftHammer(hammerHandle, hammerHead, hammerScrew, hammer);
        hammer.craftHammer(hammerHandle, hammerHead, hammerScrew, hammer);
        hammer.craftHammer(hammerHandle, hammerHead, hammerScrew, hammer);

        System.out.println("Количество произведенных молотков: " + hammer.quantity);
        System.out.println("Остаток материалов на складе :" + "\n"
                + "Рукоять молотка: " + hammerHandle.quantity + "\n"
        + "Боек молотка: " + hammerHead.quantity + "\n"
        + "Винт для молотка: " + hammerScrew.quantity);


    }

}

class Product {
    String name;
    int quantity;


    Product(String name2, int quantity2) {
        name = name2;
        quantity = quantity2;
    }

    public void craftHammer(Product product1, Product product2, Product product3, Product product4) {
        if (product1.quantity == 0 || product2.quantity == 0 || product3.quantity == 0) {
            System.out.println("Нехватает деталей для изготовления");
        } else {
            product1.quantity--;
            product2.quantity--;
            product3.quantity--;
        }
        product4.quantity++;
    }

}