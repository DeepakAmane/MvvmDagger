package com.example.mvvmdagger;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ViewModelModule.class)
public interface PlayerComponent {

    void inject(MainActivity mainActivity);
}
