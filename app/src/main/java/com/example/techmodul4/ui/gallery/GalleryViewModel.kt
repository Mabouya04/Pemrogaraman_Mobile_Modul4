package com.example.techmodul4.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.techmodul4.R
import com.example.techmodul4.model.galleryDataModel

class GalleryViewModel : ViewModel() {

    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    fun loadData(): List<galleryDataModel> {
        return listOf(
            galleryDataModel(R.drawable.asus_fx505dy),
            galleryDataModel(R.drawable.asus_g14),
            galleryDataModel(R.drawable.asus_f15),
            galleryDataModel(R.drawable.msi_modern14),
            galleryDataModel(R.drawable.asus_zephyrus15),
            galleryDataModel(R.drawable.asus_gl553vd),
            galleryDataModel(R.drawable.acer_helios300),
            galleryDataModel(R.drawable.msi_katanagf66),
            galleryDataModel(R.drawable.lenovo_legion7i),
            galleryDataModel(R.drawable.lenovo_legiony530)
        )
    }

    fun setData(data: galleryDataModel) {
        _image.value = data.ImageResId
    }
}