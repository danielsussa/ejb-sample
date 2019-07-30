package br.com.example.bean;

import javax.validation.constraints.NotNull;

/**
 * Person
 */
public class Person {
    @NotNull
    private String name;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(@NotNull String name) {
        this.name = name;
    }
}