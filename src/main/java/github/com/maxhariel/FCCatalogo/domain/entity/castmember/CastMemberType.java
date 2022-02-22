package github.com.maxhariel.FCCatalogo.domain.entity.castmember;

import java.util.HashMap;
import java.util.Map;

public enum CastMemberType {
    TYPE1(1),
    TYPE2(2);

    private Integer type;
    private final static Map values = new HashMap<>();

    private CastMemberType(Integer type) {
        this.type = type;
    }

    static {
        for (CastMemberType type : CastMemberType.values()) {
            values.put(type.type, type);
        }
    }

    public Integer getType() {
        return this.type;
    }

    public static Boolean valueOf(CastMemberType type) {
        CastMemberType castMemberType = (CastMemberType) values.get(type);
        if (castMemberType == null)
            return false;
        return true;
    }
}
