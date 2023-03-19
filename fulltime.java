
package lab6;

import java.util.Scanner;

/**
 *
 * @author Hieu
 */
public class fulltime extends nhanvien {
   int loaichucvu, ngaylamthem;
   public void nhanvienfulltime(String ten,int loaichucvu,int ngaylamthem ){
       this.loaichucvu=loaichucvu;
       this.ngaylamthem=ngaylamthem;
       this.ten=ten;
   }
   public int getLoaichucvu(){
       
       return loaichucvu;
       
   }
    public void setLoaichucvu(int loaichucvu){
        this.loaichucvu=loaichucvu;
    }
    public int getNgaylamthem(){
       
       return ngaylamthem;
       
   }
    public void setNgaylamthem(int ngaylamthem){
        this.ngaylamthem=ngaylamthem;
    }
    @Override
    public long tinhluong(){
       return getLuong()*getNgaylamthem();
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
        System.out.println("nhập chức vụ");
        loaichucvu= sc.nextInt();
        System.out.println("nhập ngày làm thêm");
        ngaylamthem= sc.nextInt();
    }
    @Override
    public void xuat(){
        System.out.println("tên"+getTen());
        System.out.println("lương"+getLuong());
        System.out.println("loại nhân viên"+getLoainhanvien());
        System.out.println("loại chức vụ là"+getLoaichucvu());
        System.out.println("tổng tiền lương là "+tinhluong());     
    }
}
