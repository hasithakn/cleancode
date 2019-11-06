package com.hasitha;

public class User {

    private Session session;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public boolean passwordMatched(String password) {
        return false;
    }
}
