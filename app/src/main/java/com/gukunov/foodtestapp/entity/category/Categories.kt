package com.example.example

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class Categories (

   var idCategory             : String? = null,
   var strCategory            : String? = null,
   var strCategoryThumb       : String? = null,
   var strCategoryDescription : String? = null

):Parcelable