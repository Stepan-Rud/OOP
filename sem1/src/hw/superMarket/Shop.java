package hw.superMarket;

import java.util.ArrayList;

public class Shop {
    private ArrayList<CategoryProduct> categories;
    public Shop(){
        this.categories = new ArrayList<>();
    }
    public void addCategory(CategoryProduct category){
        categories.add(category);
    }

    public ArrayList<CategoryProduct> getCategories() {
        return categories;
    }
    public void printCataLog(){
        for (CategoryProduct category:categories) {
            System.out.println(category.getName());
            ArrayList<Product> products = category.getListProduct();
            for (Product product:products) {
                System.out.println("- " + product.getName() + " - ");
            }
        }
    }
}
