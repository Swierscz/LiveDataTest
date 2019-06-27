package com.sierzega.livedatatest;

import android.arch.lifecycle.MutableLiveData;

public class MARepository {
    private MutableLiveData<String> someData;
    public MutableLiveData<String> getSomeData() {
        if (someData == null) {
            someData = new MutableLiveData<String>();
        }
        return someData;
    }

    //POST - Brak gwarancji dostarczenia (nie dostarczy jak nie ma observerów), może być wywołane z background_threada


    /*
    *
    * setValue():

    Sets the value. If there are active observers, the value will be dispatched to them. This method must be called from the main thread.

postValue():

    Posts a task to a main thread to set the given value. If you called this method multiple times before a main thread executed a posted task, only the last value would be dispatched.

To summarize, the key difference would be:

setValue() method must be called from the main thread. But if you need set a value from a background thread, postValue() should be used.
    *
    *
    * */

}

