package com.example.example

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class CategoriesResponse (

   var categories : ArrayList<Categories> = arrayListOf()

):Parcelable