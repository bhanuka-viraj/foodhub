package com.elight.foddie_android.data

import retrofit2.http.GET

interface FoodApi {
    @GET("/food")
    suspend fun getFoods(): List<String>

}