package hw.superMarket;

public class Product {

    private String name;
    private Integer price;
    private Integer rating;

    /**
     *
     * @param name Имя продукта
     * @param price Цена продукта
     * @param rating Рейтнинг покупателей
     */
    public Product(String name, Integer price, Integer rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
