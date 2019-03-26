package com.semeruk.daggerlesson2.component;

import com.semeruk.daggerlesson2.activity.MainActivity;
import com.semeruk.daggerlesson2.app.DemoApplication;
import com.semeruk.daggerlesson2.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

// the concept of “components” is used to associate modules with injection targets
@Singleton
@Component(modules = { AppModule.class })
public interface AppComponent {

    void inject(DemoApplication application);
    void inject(MainActivity mainActivity);
}