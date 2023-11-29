package hw.superMarket;

import java.util.ArrayList;

public class CategoryProduct {
    private String name;
    private ArrayList<Product> products;

    /**
     * @apiNote Этот метод создает новый список категроий продуктов с заданным именем
     * @param name Здесь задется имя
     */
    public CategoryProduct(String name) {
        this.products = new ArrayList<>();
        this.name = name;
    }
    public ArrayList<Product> getListProduct() {
        return products;
    }

    public void addListProduct(Product product) {
        products.add(product);
    }

    public String getName() {
        return name;
    }
}
