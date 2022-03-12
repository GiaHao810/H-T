package Week03.BaiTap_QLXe;

public class ListChuyenXe extends Xe_NgoaiThanh{
    ChuyenXe[] CX = new ChuyenXe[100];
    private int countCX = 0;

    public void ListCX(){
        for(int i = 1; i < 100; i++){
            CX[i] = new ChuyenXe();
        }
    }

    public void nhapDSXe(int loaiXe){
        if(countCX > 100){
            System.out.println("Du lieu khong qua 100 CX!");
        } else {
            if(loaiXe == 1){
                CX[countCX] = new Xe_NoiThanh();
                Xe_NoiThanh xeNoiT = new Xe_NoiThanh();
                xeNoiT.nhapXeNoiThanh();
                CX[countCX] = xeNoiT;
                countCX++;
            } else {
                CX[countCX] = new Xe_NgoaiThanh();
                Xe_NgoaiThanh xeNgoaiT = new Xe_NgoaiThanh();
                xeNgoaiT.nhapXeNgoaiThanh();
                CX[countCX] = xeNgoaiT;
                countCX++;
            }
        }
    }

    public void xuatDSXe(){
        for(int i = 0; i < this.countCX; i++){
            System.out.println("--------------------------");
            System.out.println(CX[i].toString());
        }
    }
}
