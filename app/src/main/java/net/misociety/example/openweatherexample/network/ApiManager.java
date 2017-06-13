package net.misociety.example.openweatherexample.network;


import net.misociety.example.openweatherexample.common.Const;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.protobuf.ProtoConverterFactory;

/**
 * Created by jaesunlee on 2017. 6. 9..
 * ApiManager
 */

public class ApiManager
{
    private static ApiManager instance;

    public static ApiManager getInstance()
    {
        synchronized (ApiManager.class)
        {
            if (instance == null)
                instance = new ApiManager();
        }
        return instance;
    }

    /**
     * Retrofit 생성
     * @return ApiService
     */
    public ApiService create()
    {
        // 로그
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);

        // Retrofit생성
        OkHttpClient.Builder httpBuilder = new OkHttpClient.Builder();
        httpBuilder.addInterceptor(httpLoggingInterceptor);
        OkHttpClient httpClient = httpBuilder.build();
        Retrofit.Builder retrofitBuilder = new Retrofit.Builder();
        Retrofit retrofit = retrofitBuilder.baseUrl(Const.URL)
                .addConverterFactory(ProtoConverterFactory.create()) // Protocol Buffer
                .addConverterFactory(GsonConverterFactory.create()) // Gson
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create()) // RxJava2
                .client(httpClient)
                .build();
        return retrofit.create(ApiService.class);
    }
}
