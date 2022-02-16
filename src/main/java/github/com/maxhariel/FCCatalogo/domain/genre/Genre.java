package github.com.maxhariel.FCCatalogo.domain.genre;

import java.util.UUID;

import github.com.maxhariel.FCCatalogo.domain.BaseEntity;

public class Genre extends BaseEntity {

    private String name;

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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("");
        if (name.length() == 0)
            throw new IllegalAccessError("");
        this.name = name;
    }
}
