package net.misociety.example.openweatherexample.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import net.misociety.example.openweatherexample.R;
import net.misociety.example.openweatherexample.databinding.ActivityMainBinding;


/**
 * Created by jaesunlee on 2017. 6. 9..
 * Main
 */
public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainViewModel viewModel = new MainViewModel(binding);
        binding.setViewModel(viewModel);
    }
}
