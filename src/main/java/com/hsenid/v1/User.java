package com.hsenid.v1;

class User {

    public boolean isLoggdIn;
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
