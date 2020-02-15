package com.example.daggerex6;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindPetrolEngine(PetrolEngine petrolEngine);
}
