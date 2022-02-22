package github.com.maxhariel.FCCatalogo.domain.entity.castmember;

import java.util.UUID;

import github.com.maxhariel.FCCatalogo.domain.BaseEntity;

public class CastMember extends BaseEntity {

    private String name;
    private CastMemberType type;

    public CastMember() {
    }

    public CastMember(UUID id, String name, CastMemberType type) {
        super.setId(id);
        this.setName(name);
        this.setType(type);
    }

    public CastMember(String name, CastMemberType type) {
        super.generateUUID();
        this.setName(name);
        this.setType(type);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("castMember name is null");
        if (name.length() == 0)
            this.name = name;
    }

    public CastMemberType getType() {
        return this.type;
    }

    public void setType(CastMemberType type) {
        if (type == null)
            throw new IllegalArgumentException("castMember type is null");
        if (!CastMemberType.valueOf(type))
            throw new IllegalArgumentException("castMember type is invalid");
        this.type = type;
    }

}
