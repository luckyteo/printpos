package com.devsimple.printpos;

import android.content.Context;
import android.widget.Toast;

public class DemoToast {
    private DemoToast(){
        // Private constructor
    }
    public static void showMessage(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }
}
