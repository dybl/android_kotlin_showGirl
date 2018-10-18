package com.junjc9.j9.gg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button showBtn;
    private ImageView showImg;
    private ArrayList<String> urls;
    private int curPos = 0;g
    private PictureLoader loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loader = new PictureLoader();
        initData();
        initUI();
    }

    private void initData() {
        urls = new ArrayList<>();
        urls.add("https://desk-fd.zol-img.com.cn/t_s1366x768c5/g5/M00/05/0C/ChMkJ1l_JRCIA-oAAAS5EW43hXUAAfSaAEVxL8ABLkp466.jpg");
        urls.add("https://desk-fd.zol-img.com.cn/t_s1366x768c5/g5/M00/05/0C/ChMkJll_JQCIRL6WAAIE-vEqU8UAAfSaACmbQMAAgUS185.jpg");
        urls.add("https://desk-fd.zol-img.com.cn/t_s1366x768c5/g5/M00/05/0C/ChMkJ1l_JQiIVrsEAAakZPWnOCwAAfSaAC-yQcABqR8241.jpg");
        urls.add("https://desk-fd.zol-img.com.cn/t_s1366x768c5/g5/M00/05/0C/ChMkJ1l_JQ-IfkkoABFDwss4troAAfSaAEBYQAAEUPa636.jpg");
        urls.add("https://desk-fd.zol-img.com.cn/t_s1366x768c5/g5/M00/0B/0B/ChMkJliUTuiILtObAIMgoVSlSrwAAZrPgER3o8AgyC5106.jpg");

    private void initUI() {
        showBtn = (Button) findViewById(R.id.btn_show);
        showImg = (ImageView) findViewById(R.id.img_show);
        showBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_show:
                if (curPos == 9) {
                    curPos = 0;
                } else {
                    loader.load(showImg, urls.get(curPos));
                    curPos++;
                }
                break;
        }
    }
}
