package com.example.firebase_uygulama;

public class shop_info {

    private String isim;
    private String bilgi;

    public shop_info(String isim, String bilgi) {
        this.isim = isim;
        this.bilgi = bilgi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String get_bilgi() {
        return bilgi;
    }

    public void set_bilgi(String bilgi) {
        this.bilgi = bilgi;
    }




}
