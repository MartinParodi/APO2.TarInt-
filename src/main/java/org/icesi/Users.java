package org.icesi;
import java.util.Date;

public class Users {
    private String name;
    private String lastName;
    private String userName;
    private String password;

    private Date bornDate;
    private String direction;

    private int tell;

    private String email;

    // Constructor
    public Users(String name, String lastName, String userName, String password,
                 Date bornDate, String direction, int tell, String email) {
        this.name = name;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.bornDate = bornDate;
        this.direction = direction;
        this.tell = tell;
        this.email = email;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getTell() {
        return tell;
    }

    public void setTell(int tell) {
        this.tell = tell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
