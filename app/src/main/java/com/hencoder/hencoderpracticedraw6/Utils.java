package com.hencoder.hencoderpracticedraw6;

import android.content.res.Resources;
import android.util.DisplayMetrics;

public class Utils {

    /**
     * dp转px
     *
     * @param dp 需要转换的dp值
     * @return 转换后px的值
     */
    public static float dpToPixel(float dp) {
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        return dp * metrics.density;
    }
}
