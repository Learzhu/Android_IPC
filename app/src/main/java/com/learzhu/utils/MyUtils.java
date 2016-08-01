package com.learzhu.utils;

import android.app.ActivityManager;
import android.content.Context;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

/**
 * @author Learzhu
 * @version $Rev$
 * @time 2016/8/1 17:30
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$  17:30
 * @updateDes ${TODO}
 */
public class MyUtils {
    /*通过pid获取进程的名字*/
    public static String getProcessName(Context context, int pid) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> runningApps = activityManager.getRunningAppProcesses();
        if (runningApps == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo procInfo :
                runningApps) {
            if (procInfo.pid == pid)
                return procInfo.processName;
        }
        return null;
    }

    public static void close(Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
