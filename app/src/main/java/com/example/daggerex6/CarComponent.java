package com.example.daggerex6;

import dagger.Component;

@Component (modules = {WheelModule.class, DieselEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

}
