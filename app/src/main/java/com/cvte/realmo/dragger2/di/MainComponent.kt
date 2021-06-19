package com.cvte.realmo.dragger2.di

import com.cvte.realmo.dragger2.ui.MainActivity
import dagger.Component

@Component(modules = arrayOf(MainActivityModule::class))
interface MainComponent {

    fun inject(mainActivity: MainActivity)
}