
package b2;


public class hocsinhchuyentoan extends hocsinh {
    public void hocsinhgioitoan(String ten,int toan,String lop,int ly,int hoa){
        this.ten=ten;
        this.ly=ly;
        this.hoa=hoa;
        this.lop=lop;
        this.toan=toan;
}

    
    @Override
    public long diemtrungbinh(){
        return (getToan()*2+getHoa()+getLy())/4 ;
    }
    public void nhap(){
        super.nhap();
        
    }
    @Override
    public void xuat(){
        super.xuat();
        
    }
}
