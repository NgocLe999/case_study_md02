package model.entity;

public class Department {
    private long id;
    private String name;
    private String floor;

    public Department(long id, String name, String floor) {
        this.id = id;
        this.name = name;
        this.floor = floor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", floor='" + floor + '\'' +
                '}';
    }
}
