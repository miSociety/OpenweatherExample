package net.misociety.example.openweatherexample.model;

import java.util.List;

/**
 * Created by jaesunlee on 2017. 6. 9..
 * 현재 날씨
 */

public class CurrentWeather
{
    private Coord coord;
    private List<Weather> weather;
    private Main main;
    private Wind wind;
    private Clouds clouds;
    private Rain rain;
    private Snow snow;
    private Sys sys;
    private String base, name;
    private int id, cod;
    private long dt;

    public Coord getCoord()
    {
        return coord;
    }

    public void setCoord(Coord coord)
    {
        this.coord = coord;
    }

    public List<Weather> getWeather()
    {
        return weather;
    }

    public void setWeather(List<Weather> weather)
    {
        this.weather = weather;
    }

    public Main getMain()
    {
        return main;
    }

    public void setMain(Main main)
    {
        this.main = main;
    }

    public Wind getWind()
    {
        return wind;
    }

    public void setWind(Wind wind)
    {
        this.wind = wind;
    }

    public Clouds getClouds()
    {
        return clouds;
    }

    public void setClouds(Clouds clouds)
    {
        this.clouds = clouds;
    }

    public Rain getRain()
    {
        return rain;
    }

    public void setRain(Rain rain)
    {
        this.rain = rain;
    }

    public Snow getSnow()
    {
        return snow;
    }

    public void setSnow(Snow snow)
    {
        this.snow = snow;
    }

    public Sys getSys()
    {
        return sys;
    }

    public void setSys(Sys sys)
    {
        this.sys = sys;
    }

    public String getBase()
    {
        return base;
    }

    public void setBase(String base)
    {
        this.base = base;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getCod()
    {
        return cod;
    }

    public void setCod(int cod)
    {
        this.cod = cod;
    }

    public long getDt()
    {
        return dt;
    }

    public void setDt(long dt)
    {
        this.dt = dt;
    }
}
