package net.misociety.example.openweatherexample.network;


import net.misociety.example.openweatherexample.BuildConfig;
import net.misociety.example.openweatherexample.model.CurrentWeather;
import net.misociety.example.openweatherexample.model.Find;

import java.util.Map;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by jaesunlee on 2017. 6. 9..
 * ApiService
 */

public interface ApiService
{
    /**
     * 현재 날씨 API (도시 한개)
     * @param queryMap Query
     * @return
     */
    @GET("weather?appid="+ BuildConfig.OPENWEATHER_APPID)
    Single<CurrentWeather> currentWeatherData(@QueryMap Map<String, String> queryMap);

    /**
     * 현재 날씨 API (도시 여러개)
     * @param queryMap Query
     * @return
     */
    @GET("find?appid="+ BuildConfig.OPENWEATHER_APPID)
    Single<Find> currentWeatherDatalist(@QueryMap Map<String, String> queryMap);
}
