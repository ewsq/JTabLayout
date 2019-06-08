package com.liang.jtablayout.tab;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.View;

import com.liang.jtablayoutx.R;

public class TabItem extends View {
    public final CharSequence text;
    public final Drawable icon;

    public TabItem(Context context) {
        this(context, (AttributeSet) null);
    }

    public TabItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.JTabItem,
                0, 0);
        this.text = typedArray.getText(R.styleable.JTabItem_android_text);
        this.icon = typedArray.getDrawable(R.styleable.JTabItem_android_icon);
        typedArray.recycle();
    }
}