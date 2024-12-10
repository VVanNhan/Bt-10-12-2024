import java.util.*;

public class QuanLyThuVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã thư viện: ");
        String maThuVien = scanner.nextLine();
        System.out.print("Nhập tên thư viện: ");
        String tenThuVien = scanner.nextLine();
        ThuVien thuVien = new ThuVien(maThuVien, tenThuVien);

        int luaChon;
        do {
            System.out.println("\n1. Thêm sách mới\n2. Xóa sách\n3. Tìm kiếm sách\n4. Hiển thị danh sách sách\n5. Xuất thông tin thư viện\n0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();
            switch (luaChon) {
                case 1:
                    System.out.print("Nhập ID sách: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhập tiêu đề sách: ");
                    String tieuDe = scanner.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String tacGia = scanner.nextLine();
                    System.out.print("Nhập thể loại: ");
                    String theLoai = scanner.nextLine();
                    System.out.print("Nhập năm xuất bản: ");
                    int namXuatBan = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập trạng thái (Dang Muon/San Sang): ");
                    String trangThai = scanner.nextLine();
                    Sach sach = new Sach(id, tieuDe, tacGia, theLoai, namXuatBan, trangThai);
                    thuVien.themSach(sach);
                    break;
                case 2:
                    System.out.print("Nhập ID sách cần xóa: ");
                    String idXoa = scanner.nextLine();
                    thuVien.xoaSach(idXoa);
                    break;
                case 3:
                    System.out.print("Nhập từ khóa tìm kiếm: ");
                    String keyword = scanner.nextLine();
                    List<Sach> ketQua = thuVien.timKiemSach(keyword);
                    for (Sach s : ketQua) {
                        System.out.println(s);
                    }
                    break;
                case 4:
                    thuVien.hienThiSach();
                    break;
                case 5:
                    System.out.println(thuVien);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (luaChon != 0);

        scanner.close();
    }
}
