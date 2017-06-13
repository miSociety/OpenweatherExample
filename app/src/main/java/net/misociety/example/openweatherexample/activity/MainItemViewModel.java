package net.misociety.example.openweatherexample.activity;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

import net.misociety.example.openweatherexample.common.Const;
import net.misociety.example.openweatherexample.databinding.ItemMainBinding;
import net.misociety.example.openweatherexample.model.CurrentWeather;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by jaesunlee on 2017. 6. 12..
 */

public class MainItemViewModel
{
    private ItemMainBinding binding;

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

    MainItemViewModel(ItemMainBinding binding)
    {
        this.binding = binding;
    }

    public void setCurrentWeather(CurrentWeather currentWeather)
    {
        String url = Const.URL_ICON + currentWeather.getWeather().get(0).getIcon()+".png";
        icon.set(url);
        background.set(0xff87cefa);
        city.set(currentWeather.getName() + "(" + currentWeather.getSys().getCountry() + ")");
        temp.set(String.format(Locale.KOREA, "%.1f℃", currentWeather.getMain().getTemp()));
        date.set(convertDate(currentWeather.getDt()*1000, "MMM dd yyyy HH:mm"));
//        sunrise.set("Sunrise : " + convertDate(currentWeather.getSys().getSunrise()*1000, "HH:mm:ss"));
//        sunset.set("Sunset : " + convertDate(currentWeather.getSys().getSunset()*1000, "HH:mm:ss"));
        humidity.set(String.format(Locale.KOREA, "Humidity : %.1f%%", currentWeather.getMain().getHumidity()));
        windspeed.set(String.format(Locale.KOREA, "Wind : %.1fm/s", currentWeather.getWind().getSpeed()));
        binding.mainWindDirection.setRotation((float)currentWeather.getWind().getDeg() + 180);
    }

    private String convertDate(long currentTimeinMillis, String format)
    {
        Date date = new Date();
        date.setTime(currentTimeinMillis);
        SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.US);
        return sdf.format(date);
    }

}
