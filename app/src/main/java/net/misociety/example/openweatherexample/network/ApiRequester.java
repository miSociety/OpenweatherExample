package net.misociety.example.openweatherexample.network;

import android.content.Context;
import android.widget.Toast;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by jaesunlee on 2017. 6. 9..
 * ApiRequester
 */

public class ApiRequester<T>
{
    private Context context;

    public ApiRequester(Context context)
    {
        this.context = context;
    }

    /**
     * API요청. 에러시 동작은 공통으로 이곳에서 정의함.
     * @param single Single
     * @param success API요청 성공시 동작
     */
    public void request(Single<T> single, Consumer<T> success)
    {
        single.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(success, error -> {
                    Toast.makeText(context, "Error : " + error.getMessage(), Toast.LENGTH_SHORT).show();
                    //TODO Error Handling...
                });
    }
}
