package com.hasitha;

/**
 * SideEffects is Created by Hasithakn on 11/5/2019
 */
public class SideEffects {

}

class User {

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

class Session {
}

//with side effects
class SessionService1 {

    public Session login(User user, String password) {
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


//after refactor with CQRS
class SessionService2 {

    public boolean isLogin(User user) {
        return user.getSession() != null;
    }

    public void login(User user, String password) {
        if (user.passwordMatched(password)) {
            user.setSession(new Session());
        }
    }
}