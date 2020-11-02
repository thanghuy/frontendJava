package Home;

import javafx.beans.property.SimpleStringProperty;

public class Product {
    private String id;
    private String name;
    private String image;
    private String id_item;
    private int price;

    public Product(String id, String name, String image, String id_item, int price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.id_item = id_item;
        this.price = price;
    }
    public Product(){

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getId_item() {
        return id_item;
    }

    public void setId_item(String id_item) {
        this.id_item = id_item;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
