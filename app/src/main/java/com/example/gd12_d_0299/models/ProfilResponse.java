package com.example.gd12_d_0299.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProfilResponse {
    private String message;

    @SerializedName("profil")
    private List<Profil> profilList;

    public String getMessage() { return message; }

    public void setMessage(String message) { this.message = message; }

    public List<Profil> getProfilList() { return profilList; }

    public void setProfilList(List<Profil> profilList) { this.profilList = profilList; }
}
