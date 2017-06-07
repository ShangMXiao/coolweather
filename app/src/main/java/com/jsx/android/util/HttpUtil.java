package com.jsx.android.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/6/6 0006.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address,Callback callback) {
        OkHttpClient httpClient = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        httpClient.newCall(request).enqueue(callback);
    }
}
