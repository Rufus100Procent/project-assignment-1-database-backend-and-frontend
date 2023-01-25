package se.JensenYH.Java.SaltMerch.backendProject.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SizeContainer {
    @JsonProperty
    public String size;
    @JsonProperty
    public int stock;

    public SizeContainer() {
    }

    public SizeContainer(String size, int stock) {
        this.size = size;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "SizeContainer{" +
                "size='" + size + '\'' +
                ", stock=" + stock +
                '}';
    }
    //prefere to use getters and setters
    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    //</editor-fold>
}
