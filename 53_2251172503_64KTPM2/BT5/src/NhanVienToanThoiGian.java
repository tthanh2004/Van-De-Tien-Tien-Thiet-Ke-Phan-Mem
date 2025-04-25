public class NhanVienToanThoiGian extends NhanVien {
    private final int LUONG_GIO = 50000;

    public NhanVienToanThoiGian(String ten, int soGioLam) {
        super(ten, soGioLam);
    }

    @Override
    public double tinhLuong() {
        return soGioLam * LUONG_GIO;
    }
}
