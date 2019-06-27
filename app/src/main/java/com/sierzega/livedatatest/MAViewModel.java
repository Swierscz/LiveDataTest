package com.sierzega.livedatatest;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.Random;

public class MAViewModel extends ViewModel {
    private MARepository maRepository = new MARepository();
    public MutableLiveData<String> getSomeData(){
        return maRepository.getSomeData();
    }

    public MAViewModel(){
        final Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){

                    Random random = new Random();
                    if (getSomeData()!= null)
                        getSomeData().postValue(Integer.toString(random.nextInt()));

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();
    }
}
