package com.example.example

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class CategoriesResponse (

   var categories : ArrayList<Categories> = arrayListOf()

):Parcelable