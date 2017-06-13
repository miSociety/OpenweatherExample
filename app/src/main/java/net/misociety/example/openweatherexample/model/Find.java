package net.misociety.example.openweatherexample.model;

import java.util.List;

/**
 * Created by jaesunlee on 2017. 6. 12..
 */

public class Find
{
    private String message, cod;
    private int count;
    private List<CurrentWeather> list;

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getCod()
    {
        return cod;
    }

    public void setCod(String cod)
    {
        this.cod = cod;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public List<CurrentWeather> getList()
    {
        return list;
    }

    public void setList(List<CurrentWeather> list)
    {
        this.list = list;
    }
}
