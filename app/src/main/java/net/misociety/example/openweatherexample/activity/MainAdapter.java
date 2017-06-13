package net.misociety.example.openweatherexample.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.misociety.example.openweatherexample.R;
import net.misociety.example.openweatherexample.databinding.ItemMainBinding;
import net.misociety.example.openweatherexample.model.CurrentWeather;

import java.util.List;

/**
 * Created by jaesunlee on 2017. 6. 12..
 * MainAdapter
 */

public class MainAdapter extends RecyclerView.Adapter
{
    private List<CurrentWeather> list;

    MainAdapter(List<CurrentWeather> list)
    {
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position)
    {
        CurrentWeather currentWeather = list.get(position);
        MainViewHolder viewHolder = (MainViewHolder)holder;
        viewHolder.mainItemViewModel.setCurrentWeather(currentWeather);
    }

    @Override
    public int getItemCount()
    {
        try {
            return list.size();
        } catch (NullPointerException e) {
            return 0;
        }
    }

    private class MainViewHolder extends RecyclerView.ViewHolder
    {
        private ItemMainBinding binding;
        private MainItemViewModel mainItemViewModel;

        MainViewHolder(View itemView)
        {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
            mainItemViewModel = new MainItemViewModel(binding);
            binding.setViewModel(mainItemViewModel);
        }
    }
}
