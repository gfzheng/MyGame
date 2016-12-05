package com.guifeng.mygame.model;

/**
 * Created by guifeng on 2016/12/5.
 */

public class UserRepository
        extends com.strongloop.android.loopback.UserRepository<User> {
    public interface LoginCallback
            extends com.strongloop.android.loopback.UserRepository.LoginCallback<User> {
    }

    public UserRepository() {
        super("user", null, User.class);
    }
}
