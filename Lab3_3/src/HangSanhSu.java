import java.util.Scanner;

public class HangSanhSu extends HangHoa {

	public HangSanhSu(String maHang, String tenHang, String nhaSanXuat, double gia) {
		super(maHang, tenHang, nhaSanXuat, gia);
	}
private String loaiNguyenLieu;
public HangSanhSu(String maHang, String tenHang, String nhaSanXuat, double gia, String loaiNguyenLieu) {
	super(maHang, tenHang, nhaSanXuat, gia);
	this.loaiNguyenLieu = loaiNguyenLieu;
}
public String getLoaiNguyenLieu() {
	return loaiNguyenLieu;
}
public void setLoaiNguyenLieu(String loaiNguyenLieu) {
	this.loaiNguyenLieu = loaiNguyenLieu;
}
public void nhap() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Nhap loai nguyen lieu: ");
	loaiNguyenLieu=sc.nextLine();
}
@Override
public String toString() {
	return "HangSanhSu [loaiNguyenLieu=" + loaiNguyenLieu + "]";
}



}
