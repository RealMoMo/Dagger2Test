package com.cvte.realmo.dragger2.ui

import javax.inject.Inject


class MainPresenter @Inject constructor(private var mainActivity: MainActivity) {

    fun getName():String{
        return "dagger learn"
    }


    fun letViewShowData(){
        mainActivity.showMsg("ioc dagger")
    }
}