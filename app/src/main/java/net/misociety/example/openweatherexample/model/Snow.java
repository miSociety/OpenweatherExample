package net.misociety.example.openweatherexample.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jaesunlee on 2017. 6. 9..
 */

public class Snow
{
    @SerializedName("3h")
    private double h3;

    public double getH3()
    {
        return h3;
    }

    public void setH3(double h3)
    {
        this.h3 = h3;
    }
}
