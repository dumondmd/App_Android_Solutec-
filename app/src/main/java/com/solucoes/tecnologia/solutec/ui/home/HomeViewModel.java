package com.solucoes.tecnologia.solutec.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Bem vindo a Solutec");
    }

    public LiveData<String> getText() {
        return mText;
    }
}