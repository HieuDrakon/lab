
package lab6;

import java.util.Scanner;


public class parttime extends nhanvien {
    int giolamviec;
    public void nhanvienparttime(String ten,int giolamviec ){
       this.giolamviec=giolamviec;
       this.ten=ten;
   }
   public int getGiolamviec(){
       
       return giolamviec;
       
   }
    public void setGiolamviec(int giolamviec){
        this.giolamviec=giolamviec;
    }
    @Override
    public long tinhluong(){
       return getLuong()* getGiolamviec();
    }
 @Override
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập tên");
        ten= sc.nextLine();
        System.out.println("nhập loại nhân viên ");
        loainhanvien= sc.nextLine();
        System.out.println("nhập lương");
        luong= sc.nextLong();
        System.out.println("nhập số giờ làm thêm");
        giolamviec= sc.nextInt();
    }
     @Override
    public void xuat(){
        System.out.println("tên"+getTen());
        System.out.println("lương"+getLuong());
        System.out.println("loại nhân viên"+getLoainhanvien());
        System.out.println("giờ làm việc là"+ getGiolamviec());
        System.out.println("tổng tiền lương là "+tinhluong());
        
    }
}
