package com.example.example

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MealsResponse (

  var meals : ArrayList<Meals> = arrayListOf()

):Parcelable