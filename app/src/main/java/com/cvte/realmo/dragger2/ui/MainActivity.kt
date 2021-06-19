package com.cvte.realmo.dragger2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.widget.TextViewCompat
import com.cvte.realmo.dragger2.R
import com.cvte.realmo.dragger2.di.DaggerMainComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerMainComponent.builder().build().inject(this)


//        findViewById<AppCompatTextView>(R.id.tvHello)
        findViewById<AppCompatTextView>(R.id.tvHello).setOnClickListener {
            Toast.makeText(this, mainPresenter.getName(), Toast.LENGTH_SHORT).show()
        }
    }
}