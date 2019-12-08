/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Cong
 */
public class NhanVien implements Serializable{
    private int MaNhanVien;
    private String HoTen;
    private String DiaChi;
    private String SDT;
    private int BacLuong;
    public NhanVien(){}
    public NhanVien(int MaNhanVien, String HoTen, String DiaChi, String SDT, int BacLuong) {
        this.MaNhanVien = MaNhanVien;
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.BacLuong = BacLuong;
    }

    public int getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(int MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public int getBacLuong() {
        return BacLuong;
    }

    public void setBacLuong(int BacLuong) {
        this.BacLuong = BacLuong;
    }
    
          
    
}
