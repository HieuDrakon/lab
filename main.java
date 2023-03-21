package lab6;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);       
    nhanvien nv= new nhanvien();
    fulltime f=new fulltime();
    parttime p=new parttime();
    int n;
   do {
    System.out.println("menu");
    System.out.println("1. nhập nv fulltime");
    System.out.println("2. nhập nv parttime");
    System.out.println("3. xuất nv fulltime");
    System.out.println("4. xuat nv parttime");
    System.out.println("chọn ");
    n= sc.nextInt();
switch(n){
    case 1:
    {
        f.nhap();
        break;
    }
    case 2:
    {
        p.nhap();
        break;
    }
    case 3:
    {
        f.xuat();
        break;
    }
    case 4:
    {
        p.xuat();
        break;
    }
    case 5:
        default:
        break;
    
}
}while(n!=0);
}
}
