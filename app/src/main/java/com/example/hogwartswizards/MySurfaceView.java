package com.example.hogwartswizards;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class MySurfaceView extends SurfaceView {
    public MySurfaceView(Context context, AttributeSet attrs){
        super(context,attrs);
        setWillNotDraw(false);
    }
}
