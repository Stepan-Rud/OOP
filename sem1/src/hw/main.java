package hw;

import jdk.jfr.Category;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        CategoryProduct category1 = new CategoryProduct("Молочные");
        category1.addListProduct(new Product("Молоко", 25, 2));
        category1.addListProduct(new Product("Кефир", 20, 17));
        category1.addListProduct(new Product("Простокваша", 17, 35));

        CategoryProduct category2 = new CategoryProduct("Мясо");
        category2.addListProduct(new Product("Свинина", 45, 4));
        category2.addListProduct(new Product("Курица", 30, 19));
        category2.addListProduct(new Product("Говядина", 60, 38));

        shop.addCategory(category1);
        shop.addCategory(category2);
        shop.printCataLog();

        User user1 = new User("Игорь", "fdf232");
        User user2 = new User("Петя", "fdf233422");

        user1.getBasket().addProduct(category1.getListProduct().get(0));
        user1.getBasket().addProduct(category1.getListProduct().get(2));
        user2.getBasket().addProduct(category2.getListProduct().get(1));

        category1.getListProduct().remove(0);
        category1.getListProduct().remove(1);
        category2.getListProduct().remove(1);

        System.out.println("\n" + user1.getLogin() + " Покупки: ");
        ArrayList<Product> user1Product = user1.getBasket().getProducts();
        for (Product product:user1Product) {
            System.out.println("-" + product.getName() + "-" + product.getPrice() + "-" + product.getRating());
        }
        System.out.println("\n" + user2.getLogin() + " Покупки: ");
        ArrayList<Product> user2Product = user2.getBasket().getProducts();
        for (Product product:user2Product) {
            System.out.println("-" + product.getName() + "-" + product.getPrice() + "-" + product.getRating());
        }
        }


    }

