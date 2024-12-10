public class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private String theLoai;
    private int namXuatBan;
    private String trangThai;
    public Sach(String maSach, String tieuDe, String tacGia, String theLoai, int namXuatBan, String trangThai) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.namXuatBan = namXuatBan;
        this.trangThai = trangThai;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String toString() {
        return "Sach{" +
                "maSach='" + maSach + '\'' + ", tieuDe='" + tieuDe + '\'' + ", tacGia='" + tacGia + '\'' + ", theLoai='" + theLoai + '\'' + ", namXuatBan=" + namXuatBan + ", trangThai=" + trangThai + '}';
    }
}
