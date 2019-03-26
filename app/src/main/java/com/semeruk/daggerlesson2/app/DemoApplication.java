package com.semeruk.daggerlesson2.app;

import android.app.Application;

import com.semeruk.daggerlesson2.component.AppComponent;
import com.semeruk.daggerlesson2.component.DaggerAppComponent;
import com.semeruk.daggerlesson2.module.AppModule;

public class DemoApplication extends Application {

    private AppComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        // generated class (named as Dagger%COMPONENT_NAME%),
        // which only appears once the project has been rebuilt
        // since the last changes to the component.
        mComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getComponent() {
        return mComponent;
    }
}