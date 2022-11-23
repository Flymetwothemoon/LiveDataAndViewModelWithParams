package com.example.livedataviewmodelwithparams;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class ViewModelFactory implements ViewModelProvider.Factory {
    public MutableLiveData<Integer>mIntegerMutableLiveData;

    public ViewModelFactory(MutableLiveData<Integer> integerMutableLiveData) {
        mIntegerMutableLiveData = integerMutableLiveData;
    }


    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new com.example.livedataviewmodelwithparams.ViewModel(mIntegerMutableLiveData);
    }
}
