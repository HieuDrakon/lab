
package lab6;

import java.util.Scanner;


public class nhanvien {
    String ten;
    String loainhanvien;
    long luong;
    
    public void nhanvien(){
        
    }
    public void nhanvien(String ten,long luong,String loainhanvien){
        this.ten=ten;
        this.luong=luong;
        this.loainhanvien=loainhanvien;
    }
    public String getTen(){
        return this.ten;
    }
    public void setTen(String ten) {
        this.ten=ten;
    }
    public long getLuong(){
        return this.luong;
    }
    public void setLuong(long luong) {
        this.luong=luong;
    }
    public String getLoainhanvien(){
        return loainhanvien;
    }
    public void setLoainhanvien(String loainhanvien){
        this.loainhanvien= loainhanvien;
    }
    public long tinhluong(){
       return tinhluong(); 
    }
    public void xuatthongtin(){
        System.out.println("tên"+getTen()+"lương"+getLuong());
    }
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập tên");
        ten= sc.nextLine();
        System.out.println("nhập loại nhân viên ");
        loainhanvien= sc.nextLine();
        System.out.println("nhập lương");
        luong= sc.nextLong();
        
    }
     public void xuat(){
        System.out.println("tên"+getTen());
        System.out.println("lương"+getLuong());
        System.out.println("loại nhân viên"+getLoainhanvien());
        System.out.println("tổng tiền lương là "+tinhluong());
    }
}

