package com.example.ekene.managemeds.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

import com.example.ekene.managemeds.R;
import com.example.ekene.managemeds.ManageMedCore;

public class CustomEditText extends android.support.v7.widget.AppCompatEditText {

    private int typefaceType;

    public CustomEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray array = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.CustomEditText,
                0, 0);
        try {
            typefaceType = array.getInteger(R.styleable.CustomEditText_font_name,0);
        }finally {
            array.recycle();
        }
        if(!isInEditMode()){
            setTypeface(ManageMedCore.getApp().getTypeFace(typefaceType));
        }
    }
}
