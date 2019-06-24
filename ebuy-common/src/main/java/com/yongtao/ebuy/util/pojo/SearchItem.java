package com.yongtao.ebuy.util.pojo;

import java.io.Serializable;

public class SearchItem implements Serializable
{
    private String id;
    private String title;
    private String sell_point;
    private long price;
    private String category_name;
    private String image;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSell_point() {
        return sell_point;
    }

    public long getPrice() {
        return price;
    }

    public String getCategory_name() {
        return category_name;
    }

    public String getImage() {
        return image;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSell_point(String sell_point) {
        this.sell_point = sell_point;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
