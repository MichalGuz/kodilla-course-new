package com.kodilla.good.patterns.challenges;

public class User {
    String nameOfUser;
    String surnameOfUser;
    String nick;
    String idUser;

    public User(String nameOfUser, String surnameOfUser, String nick, String idUser) {
        this.nameOfUser = nameOfUser;
        this.surnameOfUser = surnameOfUser;
        this.nick = nick;
        this.idUser = idUser;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }

    public String getSurnameOfUser() {
        return surnameOfUser;
    }

    public String getNick() {
        return nick;
    }

    public String getIdUser() {
        return idUser;
    }
}
