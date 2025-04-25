class NhanVienBanThoiGian extends NhanVien {
    private final int LUONG_GIO = 30000;

    public NhanVienBanThoiGian(String ten, int soGioLam) {
        super(ten, soGioLam);
    }

    @Override
    public double tinhLuong() {
        return soGioLam * LUONG_GIO;
    }
}