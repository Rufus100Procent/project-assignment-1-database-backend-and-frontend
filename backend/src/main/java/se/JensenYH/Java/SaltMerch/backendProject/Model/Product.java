package se.JensenYH.Java.SaltMerch.backendProject.Model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Product implements Serializable {
    private int id;
    private String category;
    private String title;
    private String description;
    private String previewImage;
    private List<ColorVariant> colorVariants;

    public Product() {
        colorVariants = new ArrayList<>();
    }

    public Product(int id, String category, String title, String description, String previewImage) {
        this.id = id;
        this.category = category;
        this.title = title;
        this.description = description;
        this.previewImage = previewImage;
        colorVariants = new ArrayList<>();
    }

    public Product(int id, String category, String title, String description, List<ColorVariant> colorVariants) {
        this.id = id;
        this.category = category;
        this.title = title;
        this.description = description;
        this.colorVariants = colorVariants;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreviewImage() {
        return previewImage;
    }

    public void setPreviewImage(String previewImage) {
        this.previewImage = previewImage;
    }

    public List<ColorVariant> getColorVariants() {
        return colorVariants;
    }

    public void setColorVariants(List<ColorVariant> colorVariants) {
        this.colorVariants = colorVariants;
    }
    //</editor-fold>
}

