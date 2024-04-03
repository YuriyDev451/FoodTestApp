package com.gukunov.foodtestapp.common

interface BaseMapper<Input, Output> {
    fun transform(input: Input): Output
}