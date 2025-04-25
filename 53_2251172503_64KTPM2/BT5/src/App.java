import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng nhân viên: ");
        int n = Integer.parseInt(scanner.nextLine());
        NhanVien[] danhSach = new NhanVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1));
            System.out.print("Tên: ");
            String ten = scanner.nextLine();

            System.out.print("Số giờ làm: ");
            int gio = Integer.parseInt(scanner.nextLine());

            System.out.print("Loại (1-Toàn thời gian, 2-Bán thời gian): ");
            int loai = Integer.parseInt(scanner.nextLine());

            if (loai == 1) {
                danhSach[i] = new NhanVienToanThoiGian(ten, gio);
            } else {
                danhSach[i] = new NhanVienBanThoiGian(ten, gio);
            }
        }

        System.out.println("\n--- BẢNG LƯƠNG NHÂN VIÊN ---");
        for (NhanVien nv : danhSach) {
            nv.hienThiLuong();
        }

        scanner.close();
    }
}
