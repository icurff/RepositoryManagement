package Model;

import java.sql.Timestamp;

public class Product {

    private int id;
    private String name;
    private int price, quantity;
    private String category, brand, postBy;
    private Timestamp updateAt;

    public Product(int id) {
        this.id = id;
    }

    public Product() {
    }

    public Product(int id, String name, int price, int quantity, String category, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.brand = brand;
    }

    public Product(int id, String name, int price, int quantity, String category, String brand, String postBy, Timestamp updateAt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.brand = brand;
        this.postBy = postBy;
        this.updateAt = updateAt;
    }

    public Product(String name, int price, int quantity, String category, String brand, String postBy) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.brand = brand;
        this.postBy = postBy;
    }

    public Product(int id, String name, int price, int quantity, String category, String brand, String postBy) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.brand = brand;
        this.postBy = postBy;
    }

    public Product(String name, int price, int quantity, String category, String brand) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.brand = brand;
    }

    public Product(String name) {
        this.name = name;
    }

    public String getPostBy() {
        return postBy;
    }

    public void setPostBy(String postBy) {
        this.postBy = postBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

}
