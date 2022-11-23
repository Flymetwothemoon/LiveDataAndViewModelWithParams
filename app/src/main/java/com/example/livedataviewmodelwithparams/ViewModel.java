package com.example.livedataviewmodelwithparams;

import androidx.lifecycle.MutableLiveData;

public class ViewModel extends androidx.lifecycle.ViewModel {
    public MutableLiveData<Integer>mIntegerMutableLiveData;
    int a = 0;
    public ViewModel(MutableLiveData<Integer> integerMutableLiveData) {
        mIntegerMutableLiveData = integerMutableLiveData;
    }
    public void init(){
        mIntegerMutableLiveData.setValue(a);
    }
    public void addOne(){
        a++;
        mIntegerMutableLiveData.setValue(a);
    }
    public void clear(){
        a = 0;
        mIntegerMutableLiveData.setValue(a);
    }

}
