package com.germainz.marpo;

import android.graphics.Paint;
import android.widget.TextView;

import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;

import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XC_MethodHook;

public class Marpo implements IXposedHookZygoteInit {

    // Marpo
    private static final String MARPO = "Marpo";
    private static final String MARPO_MARPO = "\\w+";
    private static final String MARPO_MARPO_MARPO = "setText";
    private static final String MARPO_MARPO_MARPO_MARPO = "android.view.GLES20Canvas";
    private static final String MARPO_MARPO_MARPO_MARPO_MARPO = "drawText";
    private static final String MARPO_MARPO_MARPO_MAAARPOOOOO = "setHint";
    private static final int MAAARPOOO = 0;

    @Override
    public void initZygote(StartupParam marpoMarpoMarpoMarpo) throws Throwable {
        XC_MethodHook marpoMarpo = new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam marpoMarpoMARPO) throws Throwable {
                CharSequence marpoMarpoMarpo = (CharSequence) marpoMarpoMARPO.args[MAAARPOOO];
                if (marpoMarpoMarpo != null) {
                    String marpo = marpoMarpoMarpo.toString().replaceAll(MARPO_MARPO, MARPO);
                    marpoMarpoMARPO.args[MAAARPOOO] = marpo;
                }
            }
        };

        findAndHookMethod(TextView.class, MARPO_MARPO_MARPO, CharSequence.class, TextView.BufferType.class,
                boolean.class, int.class, marpoMarpo);
        findAndHookMethod(TextView.class, MARPO_MARPO_MARPO_MAAARPOOOOO , CharSequence.class, marpoMarpo);
        findAndHookMethod(MARPO_MARPO_MARPO_MARPO, null, MARPO_MARPO_MARPO_MARPO_MARPO, String.class, float.class,
                float.class, Paint.class, marpoMarpo);
    }

}
