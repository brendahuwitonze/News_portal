package models;

import java.util.Objects;

public class Users {
    private  String name;

    private String position;

    private int id;

    private String user_role;


    public Users(String name, String position, String user_role){
        this.name=name;
        this.position=position;
        this.user_role=user_role;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Users users=(Users) o;
        return id == users.id &&
                Objects.equals (name, users.name) &&
                Objects.equals (position, users.position) &&
                Objects.equals (user_role, users.user_role);
    }

    @Override
    public int hashCode (){
        return Objects.hash (name, position, id, user_role);
    }
}
