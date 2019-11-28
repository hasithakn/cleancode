package com.hsenid.v2;

public class SessionService {

    public Session isLogin(User user, String password) {
        if (user.getSession() != null) {
            return user.getSession();
        } else if (user.passwordMatched(password)) {
            Session session = new Session();
            user.setSession(session);
            return session;
        }
        return null;
    }



}



















/*
*
    public boolean isLogin(User user) {
        return user.getSession() != null;
    }

    public void login(User user, String password) {
        if (user.passwordMatched(password)) {
            user.setSession(new Session());
        }
    }

    */