package ru.alishev.springcourse;

public class TestBean {
    //Objekten der Klasse wird Spring bilden
    private String name;

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
