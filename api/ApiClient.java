package com.example.myapplication.api;
import android.app.DownloadManager;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static Retrofit retrofit;
//
    public static Retrofit getClient(String token) {
        if (retrofit == null) {
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(chain -> {
                        Request original = chain.request();
                        Request.Builder requestBuilder = original.newBuilder()
                                .header("Accept", "application/json");
                        if (token != null && !token.isEmpty()) {
                            requestBuilder.header("Authorization", "Bearer " + token);
                        }
                        Request request = requestBuilder.build();
                        return chain.proceed(request);
                    }).build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(ApiConstants.BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

