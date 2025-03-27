# unioty_2022_aar_example

# ExtendUnityActivity
    what did i do?

    copy unity/editor/Data/PlaybackEngines/AndroidPlayer/Variations/il2cpp/Release/Classes/classes.jar to app/libs/classes.jar

    'classes.jar' Add As Library
    
    dependencies->compileOnly(files("libs\\classes.jar"))

    copy unity/editor/Data/PlaybackEngines/AndroidPlayer/Source/com/unity3d/player to app/src/mian/com/xx/xx 

    add to import
    ~~~
    import com.unity3d.player.IUnityPlayerLifecycleEvents;
    import com.unity3d.player.MultiWindowSupport;
    import com.unity3d.player.UnityPlayer; 
    ~~~