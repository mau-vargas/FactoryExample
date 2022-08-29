package com.example.factoryexample.myexample

import com.example.factoryexample.myexample.validation.ChieValidation
import com.example.factoryexample.myexample.validation.ColombiaValidation
import com.example.factoryexample.myexample.validation.PeruValidation
import com.example.factoryexample.myexample.validation.Validation

class ModuleInitFactory {

    fun init(country: CountryEnum): Validation? =
        when {
            isChile(country.name) -> ChieValidation()
            isColombia(country.name) -> ColombiaValidation()
            isPeru(country.name) -> PeruValidation()
            else -> null

        }

    private fun isChile(county: String) :Boolean{
        return county == CountryEnum.CHILE.name
    }
    private fun isColombia(county: String) :Boolean{
        return county == CountryEnum.COLOMBIA.name
    }
    private fun isPeru(county: String) :Boolean{
        return county == CountryEnum.PERU.name
    }


}