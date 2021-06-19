package com.cvte.realmo.dragger2.di

import com.cvte.realmo.dragger2.ui.MainActivity
import dagger.Module
import dagger.Provides


@Module
class MainActivityModule constructor(private var mainActivity: MainActivity){


    @Provides
    fun providerMainActivity():MainActivity{
        return mainActivity
    }
}