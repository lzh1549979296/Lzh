package xiaoquan.com.lzh;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by LZH on 2017/2/9.
 */

public class SecondActivity  extends AppCompatActivity{
    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Log.i(TAG, "onCreate: "+"第二次提交");
    }
}
