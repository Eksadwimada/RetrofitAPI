package com.example.retrofitapi.Network

import com.example.retrofitapi.ApiResponse
import com.example.retrofitapi.ResponseDataDeleteMahasiswa
import com.example.retrofitapi.ResponseDataInsertMahasiswa
import com.example.retrofitapi.ResponseDataUpdateMahasiswa
import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {
    @GET("datamahasiswa/")
    fun getdatamahasiswa() : Call<ApiResponse>

    @FormUrlEncoded
    @POST ("datamahasiswa/")
    fun insertMahasiswa (
        @Field("nim") nim : String,
        @Field("nama") nama : String,
        @Field("telepon") telepon : String
    ): Call<ResponseDataInsertMahasiswa>

    @DELETE("datamahasiswa/{nim}")
    fun deleteMahasiswa(@Path("nim") nim : String): Call<ResponseDataDeleteMahasiswa>

    @FormUrlEncoded
    @POST("datamahasiswa/{nim}")
    fun updateMahasiswa(
        @Path("nim") nim : String,
        @Path("nama") nama : String,
        @Path("telepon") telepon : String
    ): Call<ResponseDataUpdateMahasiswa>
}