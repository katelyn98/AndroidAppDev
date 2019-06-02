package com.katelyncmorrison.tracksinthewild.ui.gear;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GearViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GearViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is share fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}