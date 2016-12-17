package com.guifeng.mygame.model;

/**
 * Created by guifeng on 2016/12/5.
 */

public class PlayerRepository
        extends com.strongloop.android.loopback.UserRepository<Player> {
    public interface LoginCallback
            extends com.strongloop.android.loopback.UserRepository.LoginCallback<Player> {
    }

    public PlayerRepository() {
        super("player", "players", Player.class);
    }
}
