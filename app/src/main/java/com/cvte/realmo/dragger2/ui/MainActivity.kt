package com.cvte.realmo.dragger2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.widget.TextViewCompat
import com.cvte.realmo.dragger2.R
import com.cvte.realmo.dragger2.di.DaggerMainComponent
import com.cvte.realmo.dragger2.di.MainActivityModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainPresenter: MainPresenter
    lateinit var tvHello: AppCompatTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //presenter不需要持有activity的时候
//        DaggerMainComponent.builder().build().inject(this)


        //当需要把自己提供出去的时候，请加相应的module
        DaggerMainComponent.builder()
            .mainActivityModule(MainActivityModule(this))
            .build()
            .inject(this)

        tvHello = findViewById<AppCompatTextView>(R.id.tvHello)
        tvHello.setOnClickListener {
            Toast.makeText(this, mainPresenter.getName(), Toast.LENGTH_SHORT).show()

            mainPresenter.letViewShowData()
        }
    }


    fun showMsg(msg : String) {
        tvHello.text =  msg
    }
}