package b2;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        hocsinh hs=new hocsinh();
        hocsinhchuyentoan t=new hocsinhchuyentoan();
        int n;
        do {
    System.out.println("menu");
    System.out.println("1. nhập ");
    System.out.println("2. xuất ");
    System.out.println("3. nhập học sinh chuyên toán");
    System.out.println("4. xuất học sinh chuyên toán");
    System.out.println("chọn ");
    n= sc.nextInt();
            switch(n){
                case 1:
                {
                    hs.nhap();
                    break;
                }
                case 2:
                {
                    hs.xuat();
                    break;
                }
                case 3:
                {
                    t.nhap();
                }
                case 4:
                {
                    t.xuat();
                    break;
                }
                case 5:
                default:
                break;
        }
}while( n!=0);
        }
}
