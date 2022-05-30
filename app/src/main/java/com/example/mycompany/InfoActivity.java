package com.example.mycompany;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity implements View.OnClickListener {

    int imgno = 0;
    int imgs[] = {R.drawable.infoimg01,R.drawable.infoimg02, R.drawable.infoimg03 ,
                    R.drawable.infoimg04, R.drawable.infoimg05};
    ImageView img_info;
    TextView txt_info;
    Button btn_info_back;
    String txts[] = {"유튜브는 재미있습니다","지메일은 편리합니다","드라이브를 사용하세요","클래스룸은 유용합니다","지도로 지구를 봐보세요"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        img_info = findViewById(R.id.img_info);
        txt_info = findViewById(R.id.txt_info);
        btn_info_back = findViewById(R.id.btn_info_back);

        img_info.setOnClickListener(this);
        btn_info_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.img_info:
                Log.d("TEST", "이미지 클릭");
                imgno = ++imgno %5;
                img_info.setImageResource(imgs[imgno]);
                txt_info.setText(txts[imgno]);
                break;
            case R.id.btn_info_back:
                Log.d("TEST", "버튼 클릭");
                finish();
                break;
        }
    }
}