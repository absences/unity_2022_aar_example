# unioty_2022_aar_example

# ExtendUnityActivity
    what did i do?

    copy unity/editor/Data/PlaybackEngines/AndroidPlayer/Variations/il2cpp/Release/Classes/classes.jar to app/libs/classes.jar

    'classes.jar' Add As Library

    change build.gradle.kts-> dependencies compileOnly(files("libs\\classes.jar"))

    copy unity/editor/Data/PlaybackEngines/AndroidPlayer/Source/com/unity3d/player to app/src/mian/com/xx/xx 

    add to import
    ~~~
    import com.unity3d.player.IUnityPlayerLifecycleEvents;
    import com.unity3d.player.MultiWindowSupport;
    import com.unity3d.player.UnityPlayer; 
    ~~~


# example unity code
    ~~~
    private static AndroidJavaObject unityTool;
    private static AndroidJavaObject unityActivity;

    private static AndroidJavaObject UNITY_TOOL
    {
        get
        {
            if (unityTool == null)
            {
                AndroidJavaClass jc = new AndroidJavaClass("com.game.thridlibrary.UnityTool");
                unityTool = jc.CallStatic<AndroidJavaObject>("Instance");
            }
            return unityTool;
        }
    }
    private static AndroidJavaObject UNITY_ACTIVITY
    {
        get
        {
            if (unityActivity == null)
            {
                var jc = new AndroidJavaClass("com.unity3d.player.UnityPlayer");
                unityActivity = jc.GetStatic<AndroidJavaObject>("currentActivity");
            }
            return unityActivity;
        }
    }
    void Start()
    {
        UNITY_TOOL.Call("ShowToast", "hello");

        Debug.Log(UNITY_ACTIVITY.Call<int>("Add", 1,2));
    }
    ~~~