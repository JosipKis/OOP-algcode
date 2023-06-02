package lab5_oop;

import java.io.Serializable;

public class User implements Serializable{

    private String userName;
    private String mail;
    private int id;
    private static int cnt = 100;

    public User(String userName, String mail){
        // dopuniti
        this.userName = userName;
        this.mail = mail;
        id = cnt;
        cnt += 10;

    }

    // getters za id
    public int getId() {
        return id;
    }

    public void info(){
        System.out.println(toString());
    }

    // generirajte toString


    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", mail='" + mail + '\'' +
                ", id=" + id +
                '}';
    }
}
