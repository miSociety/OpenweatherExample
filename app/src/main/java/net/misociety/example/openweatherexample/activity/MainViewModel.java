package net.misociety.example.openweatherexample.activity;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;

import net.misociety.example.openweatherexample.databinding.ActivityMainBinding;
import net.misociety.example.openweatherexample.model.Find;
import net.misociety.example.openweatherexample.network.ApiManager;
import net.misociety.example.openweatherexample.network.ApiParameters;
import net.misociety.example.openweatherexample.network.ApiRequester;

import java.util.HashMap;

import io.reactivex.Single;

/**
 * Created by jaesunlee on 2017. 6. 12..
 */

public class MainViewModel
{
    private ActivityMainBinding binding;
    public final ObservableField<String> icon = new ObservableField<>();
    public final ObservableField<String> date = new ObservableField<>();
    public final ObservableField<String> city = new ObservableField<>();
    public final ObservableField<String> temp = new ObservableField<>();
    public final ObservableField<String> desc = new ObservableField<>();
    public final ObservableField<String> windspeed = new ObservableField<>();
    public final ObservableField<String> humidity = new ObservableField<>();
    public final ObservableField<String> pressure = new ObservableField<>();
    public final ObservableField<String> sunrise = new ObservableField<>();
    public final ObservableField<String> sunset = new ObservableField<>();
    public final ObservableInt background = new ObservableInt();

    MainViewModel(ActivityMainBinding binding)
    {
        this.binding = binding;
    }

    // Click Search Button
    public void onClickSearch()
    {
        String cityName = binding.mainContent.getText().toString();
        requestCurrentWeatherList(cityName);
    }

    // Request Current Weather List
    private void requestCurrentWeatherList(String cityName)
    {
        HashMap<String, String> queryMap = new HashMap<>();
        queryMap.put(ApiParameters.Q, cityName);
        queryMap.put(ApiParameters.UNITS, ApiParameters.UNITS_METRIC);
        Single<Find> currentWeatherListSingle = ApiManager.getInstance().create().currentWeatherDatalist(queryMap);

        ApiRequester<Find> requester = new ApiRequester<>(binding.getRoot().getContext());
        requester.request(currentWeatherListSingle, currentWeatherList -> {
            binding.mainList.setLayoutManager(new LinearLayoutManager(binding.getRoot().getContext()));
            binding.mainList.setItemAnimator(new DefaultItemAnimator());
            MainAdapter adapter = new MainAdapter(currentWeatherList.getList());
            binding.mainList.setAdapter(adapter);
        });
    }
}
