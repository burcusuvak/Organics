import java.util.Objects;
import java.util.Scanner;

public abstract class User implements Person {
    private String name;
    private String surname;
    private String username;
    private String password;
    private String email;
    private char type;

    public User(){}
    public User(String name, String surname, String username, String password, String email,char type) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public boolean login(){
        return true;
    }

    public boolean signUP()
    {
        return  true;
    }
    public char getType(){
    	return this.type;
    }
    
    public void setType(char ty){
    	this.type=ty;
    }
    @Override
    public abstract boolean equals(Object o);

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
