package com.game.thridlibrary;


import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

public class UnityTool {
    private static UnityTool instance;

    public static UnityTool Instance() {
        if (instance == null) {
            instance = new UnityTool();
        }
        return instance;
    }

    public void ShowToast(final String msg) {
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }

    private Activity _unityActivity;
    public Activity getActivity() {
        if(null == _unityActivity) {
            try {
                Class<?> classtype = Class.forName("com.unity3d.player.UnityPlayer");
                Activity activity = (Activity) classtype.getDeclaredField("currentActivity").get(classtype);
                _unityActivity = activity;
            } catch (ClassNotFoundException e) {
                Log.d("Unity2Android", "getActivity: "+e);
            } catch (IllegalAccessException e) {
                Log.d("Unity2Android", "getActivity: "+e);
            } catch (NoSuchFieldException e) {
                Log.d("Unity2Android", "getActivity: "+e);
            }
        }
        return _unityActivity;
    }
}