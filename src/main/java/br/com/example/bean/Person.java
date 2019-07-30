package br.com.example.bean;

import javax.validation.constraints.NotNull;

/**
 * Person
 */
public class Person {
    @NotNull
    private String name;

    private String exception;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(@NotNull String name) throws Exception{
        this.name = name;
    }

    /**
     * @return the exception
     */
    public String getException() {
        return exception;
    }

    /**
     * @param exception the exception to set
     */
    public void setException(String exception)throws Exception {
        throw new Exception();
    }
}