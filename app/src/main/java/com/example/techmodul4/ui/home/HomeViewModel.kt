package com.example.techmodul4.ui.home

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.techmodul4.R
import com.example.techmodul4.model.homeDataModel

class HomeViewModel : ViewModel() {

    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    private val _name = MutableLiveData<String>()
    val name: LiveData<String> = _name

    private val _desc = MutableLiveData<String>()
    val desc: LiveData<String> = _desc

    fun loadData(): List<homeDataModel> {
        return listOf(
            homeDataModel(
                R.string.desc_laptop1,
                R.string.laptop1,
                R.drawable.asus_fx505dy
            ),
            homeDataModel(
                R.string.desc_laptop2,
                R.string.laptop2,
                R.drawable.asus_zephyrus15
            ),
            homeDataModel(
                R.string.desc_laptop3,
                R.string.laptop3,
                R.drawable.asus_f15
            ),
            homeDataModel(
                R.string.desc_laptop4,
                R.string.laptop4,
                R.drawable.msi_modern14
            ),
            homeDataModel(
                R.string.desc_laptop5,
                R.string.laptop5,
                R.drawable.asus_zephyrus15
            ),
            homeDataModel(
                R.string.desc_laptop6,
                R.string.laptop6,
                R.drawable.asus_gl553vd
            ),
            homeDataModel(
                R.string.desc_laptop7,
                R.string.laptop7,
                R.drawable.acer_helios300
            ),
            homeDataModel(
                R.string.desc_laptop8,
                R.string.laptop8,
                R.drawable.msi_katanagf66
            ),
            homeDataModel(
                R.string.desc_laptop9,
                R.string.laptop9,
                R.drawable.lenovo_legion7i
            ),
            homeDataModel(
                R.string.desc_laptop10,
                R.string.laptop10,
                R.drawable.lenovo_legiony530
            )
        )
    }

    fun setData(data: homeDataModel, context: Context) {
        _name.value = context.getString(data.NameResId)
        _image.value = data.ImageResId
        _desc.value = context.getString(data.DescriptionResId)
    }
}