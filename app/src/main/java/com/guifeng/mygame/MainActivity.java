package com.guifeng.mygame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.guifeng.mygame.model.GameRepository;
import com.strongloop.android.loopback.RestAdapter;
import com.strongloop.android.remoting.adapters.Adapter;

public class MainActivity extends AppCompatActivity {
    private TextView mUserInfo;
    private TextView mGameInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGameInfo = (TextView) findViewById(R.id.game_info);
        mUserInfo = (TextView) findViewById(R.id.user_info);

        mUserInfo.setText(((MigaApplication)getApplication()).getPlayer().toString());

        RestAdapter restAdapter = ((MigaApplication)getApplication()).getLoopBackAdapter();
        GameRepository gameRepo = restAdapter.createRepository(GameRepository.class);
        //RenwuRepository renwuRepo = restAdapter.createRepository(RenwuRepository.class);

        //final ModelRepository<Model> repository = restAdapter.createRepository("renwu");

        //PlayerRepository userRepo = restAdapter.createRepository(PlayerRepository.class);
        //Player user = ((MigaApplication)getApplication()).getPlayer();

        //mGameInfo.setText(userRepo.getNameForRestUrl());
        //userRepo.createContract().

        //RestContract rc = gameRepo.createContract();

        //restAdapter.setContract(rc);

        //restAdapter.invokeInstanceMethod();

        //final Map<String,?> parameters = ImmutableMap.of(
        //        "ownerId", "1");
        //Log.e("MIGA",renwuRepo.getNameForRestUrl());

        //repository.find();
        gameRepo.invokeStaticMethod("listGames",null,
                new Adapter.Callback() {
                    @Override
                    public void onSuccess(String s) {
                        mGameInfo.setText(s);
                    }
                    @Override
                    public void onError(Throwable t) {
                        mGameInfo.setText("No Game found!"+t.toString());
                    }
                });
    }
}
