package com.guifeng.mygame.model;

import com.strongloop.android.loopback.ModelRepository;
import com.strongloop.android.remoting.adapters.RestContract;
import com.strongloop.android.remoting.adapters.RestContractItem;

/**
 * Created by guifeng on 2016/12/17.
 */

public class GameRepository extends ModelRepository<Game> {
    public GameRepository() {
        super("game", "games", Game.class);
    }

    @Override
    public RestContract createContract() {
        RestContract contract = super.createContract();

        contract.addItem(new RestContractItem("/" + getNameForRestUrl() + "/list-games", "GET"),
                getClassName() + ".listGames");

        return contract;
    }

}

