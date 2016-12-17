package com.guifeng.mygame.model;

/**
 * Created by guifeng on 2016/12/5.
 */

public class Player extends com.strongloop.android.loopback.User {
    @Override
    public String toString() {
        return "Hi,"+get("username")+"/"+getEmail()+"/id["+getId()+"]";
    }
}
