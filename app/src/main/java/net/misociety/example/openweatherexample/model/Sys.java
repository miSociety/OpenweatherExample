package net.misociety.example.openweatherexample.model;

/**
 * Created by jaesunlee on 2017. 6. 9..
 */

public class Sys
{
    private int type, id;
    private double message;
    private long sunrise, sunset;
    private String country;

    public int getType()
    {
        return type;
    }

    public void setType(int type)
    {
        this.type = type;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public double getMessage()
    {
        return message;
    }

    public void setMessage(double message)
    {
        this.message = message;
    }

    public long getSunrise()
    {
        return sunrise;
    }

    public void setSunrise(long sunrise)
    {
        this.sunrise = sunrise;
    }

    public long getSunset()
    {
        return sunset;
    }

    public void setSunset(long sunset)
    {
        this.sunset = sunset;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }
}
