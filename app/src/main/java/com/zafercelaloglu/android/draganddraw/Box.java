package com.zafercelaloglu.android.draganddraw;

import android.graphics.PointF;

/**
 * Created by zafer on 2.02.16.
 */
public class Box {

    private PointF mOrigin;
    private PointF mCurrent;

    public PointF getOrigin() {
        return mOrigin;
    }

    public PointF getCurrent() {
        return mCurrent;
    }

    public void setCurrent(PointF current) {
        mCurrent = current;
    }

    public Box(PointF origin) {
        mCurrent = origin;
        mOrigin = origin;
    }
}
