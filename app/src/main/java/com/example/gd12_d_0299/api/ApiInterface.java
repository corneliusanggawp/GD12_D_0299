package com.example.gd12_d_0299.api;

import com.example.gd12_d_0299.models.Mahasiswa;
import com.example.gd12_d_0299.models.MahasiswaResponse;
import com.example.gd12_d_0299.models.Profil;
import com.example.gd12_d_0299.models.ProfilResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiInterface {

    @Headers({"Accept: application/json"})
    @GET("mahasiswa")
    Call<MahasiswaResponse> getAllMahasiswa();

    @Headers({"Accept: application/json"})
    @GET("mahasiswa/{id}")
    Call<MahasiswaResponse> getMahasiswaById(@Path("id") long id);

    @Headers({"Accept: application/json"})
    @POST("mahasiswa")
    Call<MahasiswaResponse> createMahasiswa(@Body Mahasiswa mahasiswa);

    @Headers({"Accept: application/json"})
    @PUT("mahasiswa/{id}")
    Call<MahasiswaResponse> updateMahasiswa(@Path("id") long id,
                                            @Body Mahasiswa mahasiswa);

    @Headers({"Accept: application/json"})
    @DELETE("mahasiswa/{id}")
    Call<MahasiswaResponse> deleteMahasiswa(@Path("id") long id);

    @Headers({"Accept: application/json"})
    @POST("profil")
    Call<ProfilResponse> createProfil(@Body Profil profil);
}
