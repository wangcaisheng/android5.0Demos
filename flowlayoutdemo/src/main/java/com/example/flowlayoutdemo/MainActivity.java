package com.example.flowlayoutdemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScrollView scrollView = new ScrollView(this);
        FlowLayout flowLayout = new FlowLayout(this);
        flowLayout.setPadding(UiUtils.dp2px(6), UiUtils.dp2px(6), UiUtils.dp2px(6), UiUtils.dp2px(6));

        for (String text : list) {
            TextView textView = UiUtils.createRandomColorSelectorTextView();
            textView.setText(text);
            flowLayout.addView(textView);
        }

        scrollView.addView(flowLayout);

        setContentView(scrollView); // 把ScrollView作为界面根元素展示
    }

    public static ArrayList<String> list = new ArrayList<String>();
    static {
        list.add("你好");
        list.add("好帅");
        list.add("人挺不错");
        list.add("善良体贴");
        list.add("有本启奏无本退朝");
        list.add("so good");
        list.add("没有什么可以阻挡");
        list.add("我对自由的向往");
        list.add("好吧");
        list.add("呵呵");
        list.add("对不起");
        list.add("给我个机会");
        list.add("要我做什么都行");
        list.add("你好");
        list.add("你好");
        list.add("三年之后又三年");
        list.add("你好");
        list.add("挺利索的");
        list.add("迟早要还的");
        list.add("出来跑");
        list.add("怎么给你机会");
        list.add("你好");
        list.add("你好");
        list.add("和警察去说");
        list.add("有什么");
        list.add("你好");
        list.add("怎么给你机会");
        list.add("你好");
        list.add("对不起我是警察");
        list.add("你好");
        list.add("那就是要我死");
        list.add("谁知道");
        list.add("你好");
        list.add("都是小事");
        list.add("我想做个好人");
        list.add("出来混嘛");
        list.add("从来只有事情改变人");
        list.add("多做善事");
        list.add("你好");
        list.add("我也读过警校");
        list.add("老大啊");
        list.add("抓贼啊");
        list.add("我要个向窗的位置");
        list.add("都快十年了");
    }

}
