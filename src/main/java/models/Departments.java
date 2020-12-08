package models;

import java.util.Objects;

public class Departments {


    private String description;
    private String name;

    private int id;

    private int size;


    public Departments (String description, String name){

        this.name=name;

        this.description=description;

        this.size=0;


    }
    public String getDescription() {
        return description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Departments that=(Departments) o;
        return id == that.id &&
                size == that.size &&
                Objects.equals (description, that.description) &&
                Objects.equals (name, that.name);
    }

    @Override
    public int hashCode (){
        return Objects.hash (description, name, id, size);
    }
}