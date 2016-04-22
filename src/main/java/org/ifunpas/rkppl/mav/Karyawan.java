/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ifunpas.rkppl.mav;

/**
 *
 * @author SB-604-11
 */
public class Karyawan {
    String nama, pekerjaan;

    public Karyawan() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
    
    public boolean cekU(int umur){
        boolean toReturn = false;
        if(umur >= 0 && umur <=70){
            toReturn = true;
        }
        
        return toReturn;
    }
    
    
}
