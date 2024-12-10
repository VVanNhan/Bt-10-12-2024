import java.util.*;
public class ThuVien {
    private String maThuVien;
    private String tenThuVien;
    private List<Sach> danhSachSach;

    public ThuVien(String maThuVien, String tenThuVien) {
        this.maThuVien = maThuVien;
        this.tenThuVien = tenThuVien;
        this.danhSachSach =  new ArrayList<>();
    }
    public void themSach(Sach sach) {
        danhSachSach.add(sach);
        System.out.println("Đã thêm sách: " + sach.getTieuDe());
    }
    public void xoaSach(String maSach) {
        danhSachSach.removeIf(sach -> sach.getMaSach().equals(maSach));
        System.out.println("Đã xóa sách với mã: " + maSach);
    }
    public List<Sach> timKiemSach(String tuKhoa) {
        List<Sach> ketQua = new ArrayList<>();
        for (Sach sach : danhSachSach) {
            if (sach.getTieuDe().toLowerCase().contains(tuKhoa.toLowerCase()) ||
                    sach.getTacGia().toLowerCase().contains(tuKhoa.toLowerCase())) {
                ketQua.add(sach);
            }
        }
        return ketQua;
    }
    public void hienThiSach() {
        System.out.println("Danh sách sách trong thư viện:");
        for (Sach sach : danhSachSach) {
            System.out.println(sach);
        }
    }
    public void hienThiThongTinThuVien() {
        System.out.println("Mã thư viện: " + maThuVien);
        System.out.println("Tên thư viện: " + tenThuVien);
        System.out.println("Tổng số sách: " + danhSachSach.size());
        hienThiSach();
    }
    public void sapXepSachTheo(String tieuChi) {
        if (tieuChi.equalsIgnoreCase("nam")) {
            danhSachSach.sort(Comparator.comparingInt(Sach::getNamXuatBan));
        } else if (tieuChi.equalsIgnoreCase("tieuDe")) {
            danhSachSach.sort(Comparator.comparing(Sach::getTieuDe));
        }
        System.out.println("Đã sắp xếp sách theo " + tieuChi);
    }
    public String toString() {
        return "ID Thư viện: " + maThuVien + ", Tên: " + tenThuVien + ", Tổng số sách: " + danhSachSach.size();
    }
}
