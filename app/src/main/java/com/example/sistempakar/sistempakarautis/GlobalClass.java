package com.example.sistempakar.sistempakarautis;

import android.app.Application;

public class GlobalClass extends Application {
    private String penyakit1;
    private String keterangan;
    private String solusi;
   private int total;
    private  String var_nama="";
    private String var_umur="";
    private String var_jk = "";

    private String listdiagnosa;



    public String getListdiagnosa() {
        return listdiagnosa;
    }

    public void setListdiagnosa(String listdiagnosa) {
        this.listdiagnosa =  listdiagnosa;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getSolusi() {
        return solusi;
    }

    public void setSolusi(String solusi) {
        this.solusi = solusi;
    }

    public String getPenyakit1() {
        return penyakit1;
    }

    public void setPenyakit1(String penyakit1) {
        this.penyakit1 = penyakit1;
    }

    public String getVar_nama() {
        return var_nama;
    }

    public void setVar_nama(String var_nama) {
        this.var_nama = var_nama;
    }

    public String getVar_umur() {
        return var_umur;
    }

    public void setVar_umur(String var_umur) {
        this.var_umur = var_umur;
    }

    public String getVar_jk() {
        return var_jk;
    }

    public void setVar_jk(String var_jk) {
        this.var_jk = var_jk;
    }



}
