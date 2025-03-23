package lab4.task4;

import java.io.Serializable;

class Animal implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
