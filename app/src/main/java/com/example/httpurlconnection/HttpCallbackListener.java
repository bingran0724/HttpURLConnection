package com.example.httpurlconnection;

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
