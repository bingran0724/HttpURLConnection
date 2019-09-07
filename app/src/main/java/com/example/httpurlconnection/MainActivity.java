package com.example.httpurlconnection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView responseText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        responseText = (TextView) findViewById(R.id.responseText);

        String url = "https://www.baidu.com/";
        HttpTool.sendRequest(url,new HttpCallbackListener(){
            @Override
            public void onFinish(String response) {
                // ...省略对返回结果的处理代码
                responseText.setText(response);
            }

            @Override
            public void onError(Exception e) {
                // ...省略请求失败的处理代码
            }
        });
    }
}
