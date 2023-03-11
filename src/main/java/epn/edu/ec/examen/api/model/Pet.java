package epn.edu.ec.examen.api.model;

public class Pet {

    private int id;
    private String name;
    private String age;
    private String type;

    public Pet(int id, String name, String age, String type) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
