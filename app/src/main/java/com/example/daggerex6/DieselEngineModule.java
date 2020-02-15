package com.example.daggerex6;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine ProvidesDieselEngine(){
        return new DieselEngine(horsePower);

    }
}
