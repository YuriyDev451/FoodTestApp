package com.example.example

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SearchResponse (

  var meals : ArrayList<Meals> = arrayListOf()

):Parcelable