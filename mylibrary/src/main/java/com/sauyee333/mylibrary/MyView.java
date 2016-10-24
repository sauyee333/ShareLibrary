package com.sauyee333.mylibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by sauyee on 24/10/16.
 */

public class MyView extends LinearLayout {

    public MyView(Context context){
        super(context);
    }

    public MyView(Context context, AttributeSet attributeSet){
        super(context, attributeSet);
    }

    private void initialize(Context context){
        inflate(context, R.layout.my_view, this);
    }
}
