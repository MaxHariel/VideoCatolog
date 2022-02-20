package github.com.maxhariel.FCCatalogo.domain.category;

import java.util.UUID;

import github.com.maxhariel.FCCatalogo.domain.BaseEntity;

public class Category extends BaseEntity {

    private String name;

    public Category() {
    }

    public Category(String name) {
        super.generateUUID();
        this.setName(name);
    }

    public Category(UUID id) {
        super.setId(id);
    }

    public Category(UUID id, String name) {
        super.setId(id);
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("Category name is null");
        if (name.length() == 0)
            throw new IllegalAccessError("Category name is blank");
        this.name = name;
    }

}
