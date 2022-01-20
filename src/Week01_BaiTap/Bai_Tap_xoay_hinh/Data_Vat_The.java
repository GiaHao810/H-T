package Week01_BaiTap.Bai_Tap_xoay_hinh;

// khuon de tao ra cac hinh khac nhau 
public class Data_Vat_The {
    String hinh_dang;  

    public Data_Vat_The(String new_hinh_dang ){
        hinh_dang = new_hinh_dang;
    }
    public void Xoay_Hinh(){
        System.out.println( this.hinh_dang + "đã xoay" );
    }
}
