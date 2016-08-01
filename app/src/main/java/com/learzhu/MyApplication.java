package com.learzhu;

import android.app.Application;
import android.nfc.Tag;
import android.os.Process;
import android.util.Log;

import com.learzhu.utils.MyUtils;

/**
 * @author Learzhu
 * @version $Rev$
 * @time 2016/8/1 17:27
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$  17:27
 * @updateDes ${TODO}
 */
public class MyApplication extends Application {
    private static final String TAG = "MyApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        String processName = MyUtils.getProcessName(getApplicationContext(), Process.myPid());
        Log.i(TAG, "MyApplication onCreate: processName" + processName);
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                do
//            }
//        }).start();
    }
}
