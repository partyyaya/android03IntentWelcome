package tw.ming.app.helloworid.mylayouttest3;

import android.app.Application;
import android.util.Log;

/**
 * Created by Mac on 2017/8/6.
 */

public class MainApp extends Application {//做一個類似application域的javabean
    String username;
    int data3;
    static int data4;
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("ming","Main:onCreate");
        username = "ming";
        data3=data4=400;
    }
}
