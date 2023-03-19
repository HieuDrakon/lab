package b2;

import java.util.Scanner;
public class hocsinh {
    String ten;
    String lop;
    int toan, ly, hoa;
    
    public void hocsinh(){
        
    }
    public void hocsinh(String ten,int toan,String lop,int ly,int hoa){
        this.ten=ten;
        this.ly=ly;
        this.hoa=hoa;
        this.lop=lop;
        this.toan=toan;
        
    }
    public String getTen(){
        return this.ten;
    }
    public void setTen(String ten) {
        this.ten=ten;
    }
    public String getLop(){
        return this.lop;
    }
    public void setLop(String lop) {
        this.lop=lop;
    }
    public int getToan(){
        return toan;
    }
    public void setToan(int toan){
        this.toan=toan;
    }
    public int getHoa(){
        return toan;
    }
    
    public void setHoa(int hoa){
        this.hoa=hoa;
    }
    public int getLy(){
        return toan;
    }
    public void setLy(int ly){
        this.ly=ly;
    }
    
    public long diemtrungbinh(){
     return (getToan()+getHoa()+getLy())/3;
    }
    public void xuatthongtin(){
        System.out.println("tên"+getTen()+"lương"+diemtrungbinh());
    }
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập tên");
        ten= sc.nextLine();
        System.out.println("lớp  ");
        lop= sc.nextLine();
        System.out.println("nhập điểm toán");
        toan= sc.nextInt();
        System.out.println("nhập điểm hóa");
        hoa= sc.nextInt();
        System.out.println("nhập điểm lý");
        ly= sc.nextInt();
    }
     public void xuat(){
        System.out.println("tên  "+getTen());
        System.out.println("lớp  "+getLop());
        System.out.println("điểm toán "+getToan());
        System.out.println("điểm hóa  "+getHoa());
        System.out.println("điểm lý  "+getLy());
        System.out.println("điểm tb  "+diemtrungbinh());
    }
}
