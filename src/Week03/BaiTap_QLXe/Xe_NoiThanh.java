package Week03.BaiTap_QLXe;

public class Xe_NoiThanh extends ChuyenXe {
        private int soTuyen;
        private double kmDadi;

        public int getSoTuyen() {
                return soTuyen;
        }

        public void setSoTuyen(int soTuyen) {
                this.soTuyen = soTuyen;
        }

        public double getKmDadi() {
                return kmDadi;
        }

        public void setKmDadi(double kmDadi) {
                this.kmDadi = kmDadi;
        }

        protected void nhapChuyenXe() {
            super.nhapChuyenXe();

            System.out.print("So tuyen: ");
            setSoTuyen(input.nextInt());

            System.out.print("So km di duoc: ");
            setKmDadi(input.nextDouble());
        }

        public void xuatXeNoiThanh(){
                xuatChuyenXe();
                System.out.println("So tuyen: " + getSoTuyen());
                System.out.println("So km di duoc: " + getKmDadi());
        }

        public Xe_NoiThanh(){}

        public Xe_NoiThanh(String maSoChuyen, String hoTenTX, String bienSoXe, double doanhThu, int soTuyen,
                        double kmDadi) {
                super(maSoChuyen, hoTenTX, bienSoXe, doanhThu);
                this.soTuyen = soTuyen;
                this.kmDadi = kmDadi;
        }

        @Override
        public String toString() {
                return "Chuyen Xe Noi Thanh \n" + super.toString() + "\nSo tuyen: " + getSoTuyen() + "\nSo km di duoc: " + getKmDadi() + "\nDoanh thu: " + getDoanhThu();
        }   

        
}
