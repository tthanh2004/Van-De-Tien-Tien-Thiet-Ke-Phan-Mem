class NhanVien {
    protected String ten;
    protected int soGioLam;

    public NhanVien(String ten, int soGioLam) {
        this.ten = ten;
        this.soGioLam = soGioLam;
    }

    public double tinhLuong() {
        return 0; // sẽ override ở lớp con
    }

    public void hienThiLuong() {
        System.out.println("Tên: " + ten);
        System.out.println("Số giờ làm: " + soGioLam);
        System.out.println("Lương: " + tinhLuong() + " VND");
        System.out.println("-----------------------------");
    }
}