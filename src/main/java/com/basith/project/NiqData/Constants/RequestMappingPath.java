package com.basith.project.NiqData.Constants;

public enum RequestMappingPath {
    EXTERNAL ("external"),
    INTERNAL ("internal");
    private final String name;

    private RequestMappingPath(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }
}
