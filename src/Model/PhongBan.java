/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
public class PhongBan implements Serializable{
    //mã phòng, tên phòng, mô tả, Hệ số công việc
    private int MaPhong;
    private String TenPhong;
    private String MoTa;
    private int HeSoCV;
    public PhongBan(){}
    public PhongBan(int MaPhong, String TenPhong, String MoTa, int HeSoCV) {
        this.MaPhong = MaPhong;
        this.TenPhong = TenPhong;
        this.MoTa = MoTa;
        this.HeSoCV = HeSoCV;
    }

    public int getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(int MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public int getHeSoCV() {
        return HeSoCV;
    }

    public void setHeSoCV(int HeSoCV) {
        this.HeSoCV = HeSoCV;
    }
    
}
