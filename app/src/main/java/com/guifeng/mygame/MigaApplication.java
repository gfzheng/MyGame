package com.guifeng.mygame;

import android.app.Application;
import com.strongloop.android.loopback.RestAdapter;

/**
 * Created by guifeng on 2016/12/5.
 */
public class MigaApplication extends Application {
    RestAdapter adapter;

    public RestAdapter getLoopBackAdapter() {
        if (adapter == null) {
            // Instantiate the shared RestAdapter. In most circumstances,
            // you'll do this only once; putting that reference in a singleton
            // is recommended for the sake of simplicity.
            // However, some applications will need to talk to more than one
            // server - create as many Adapters as you need.
            adapter = new RestAdapter(
                    getApplicationContext(), "http://10.0.3.2:3000/api");
        }
        return adapter;
    }
}
