package github.com.maxhariel.FCCatalogo.domain.entity.genre;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import github.com.maxhariel.FCCatalogo.domain.BaseEntity;
import github.com.maxhariel.FCCatalogo.domain.entity.category.Category;

public class Genre extends BaseEntity {

    private String name;

    private List<Category> categories = new ArrayList<>();

    public Genre() {
    }

    public Genre(String name) {
        super.generateUUID();
        this.setName(name);
    }

    public Genre(UUID id, String name) {
        super.setId(id);
        this.setName(name);
    }

    public Genre(String name, List<Category> categories) {
        super.generateUUID();
        this.setName(name);
    }

    public Genre(UUID id, String name, List<Category> categories) {
        super.setId(id);
        this.setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("genre name is null");
        if (name.length() == 0)
            throw new IllegalAccessError("genre name is blank");
        this.name = name;
    }

    public List<Category> getCategories() {
        return this.categories;
    }

    public void setCategories(List<Category> categories) {
        if (categories == null)
            throw new IllegalArgumentException("genre categories is null");
        this.categories = categories;
    }

    public void addCategory(Category category) {
        if (category == null)
            throw new IllegalArgumentException("category is null");
        this.categories.add(category);
    }

    public void removeCategory(Category category) {
        if (category == null)
            throw new IllegalArgumentException("category is null");
        this.categories.removeIf(c -> categories.contains(category));
    }

}
