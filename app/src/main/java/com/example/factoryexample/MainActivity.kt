package com.example.factoryexample

import android.app.ActivityManager
import android.content.ComponentCallbacks2
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.util.SparseArray
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.factoryexample.myexample.CountryEnum
import com.example.factoryexample.myexample.ModuleInitFactory
import java.lang.Thread.sleep


//https://medium.com/@manuelmato/el-patr%C3%B3n-factory-en-kotlin-d792fccbc8ee
class MainActivity : AppCompatActivity() {

    private val TAG = "FactoryPattern"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val factoryText = findViewById<TextView>(R.id.factoryText)

        val initModule = ModuleInitFactory().init(CountryEnum.COLOMBIA)

        factoryText.text = "FactoryPattern ${initModule?.validate()}"
    }

}