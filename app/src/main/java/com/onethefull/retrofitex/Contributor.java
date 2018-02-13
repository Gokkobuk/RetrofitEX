package com.onethefull.retrofitex;

public class Contributor {
    //login 정보를 받아올 것이므로
    public final String login;
    public final String type;
    public Contributor(String login, String type) {
        this.login = login;
        this.type = type;
    }
}
