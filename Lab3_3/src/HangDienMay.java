import java.util.Scanner;

public class HangDienMay extends HangHoa{
	public HangDienMay(String maHang, String tenHang, String nhaSanXuat, double gia) {
		super(maHang, tenHang, nhaSanXuat, gia);
	}

	private Double thoiGianBaoHanh,dienAp,congSuat;

	
	public Double getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(Double thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public Double getDienAp() {
		return dienAp;
	}

	public void setDienAp(Double dienAp) {
		this.dienAp = dienAp;
	}

	public Double getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(Double congSuat) {
		this.congSuat = congSuat;
	}

	public HangDienMay(String maHang, String tenHang, String nhaSanXuat, double gia, Double thoiGianBaoHanh,
			Double dienAp, Double congSuat) {
		super(maHang, tenHang, nhaSanXuat, gia);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.dienAp = dienAp;
		this.congSuat = congSuat;
	}

	HangHoa hh = new HangHoa(maHang, tenHang, nhaSanXuat, gia);
	public void nhap() {
		hh.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Thoi gian bao hanh la : ");
		this.thoiGianBaoHanh=sc.nextDouble();
		System.out.println("Dien ap la : ");
		this.dienAp=sc.nextDouble();
		System.out.println("Cong Suat la : ");
		this.congSuat=sc.nextDouble();
		
	}

		

	@Override
	public String toString() {
		return "HangDienMay [thoiGianBaoHanh=" + thoiGianBaoHanh + ", dienAp=" + dienAp + ", congSuat=" + congSuat
				+ "]";
	}

	
	
	
}
