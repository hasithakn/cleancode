package com.hsenid.v1;

public class StudentLearningPlatform {

    public boolean isLogin(User user) {
        if (user.isLoggdIn) {
            return true;
        } else {
            return false;
        }
    }

    public void login(User user, String password) {
        if (user.passwordMatched(password)) {
            user.setSession(new Session());
            VisitorCount.getInstance().incrementCount();
        }
    }
}

