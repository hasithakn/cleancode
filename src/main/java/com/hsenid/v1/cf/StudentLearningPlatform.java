package com.hsenid.v1.cf;

public class StudentLearningPlatform {

    public boolean isLogin(User user) {
        return user.isLoggedIn;
    }

    public void login(User user, String password) {
        if (user.passwordMatched(password)) {
            user.setSession(new Session());
        }
    }
}


