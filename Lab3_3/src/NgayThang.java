import java.awt.desktop.PrintFilesEvent;
import java.util.Scanner;

public class NgayThang {
private int ngay,thang,nam;

public NgayThang(int ngay, int thang, int nam) {
	super();
	this.ngay = ngay;
	this.thang = thang;
	this.nam = nam;
}

public int getNgay() {
	return ngay;
}

public void setNgay(int ngay) {
	this.ngay = ngay;
}

public int getThang() {
	return thang;
}

public void setThang(int thang) {
	this.thang = thang;
}

public int getNam() {
	return nam;
}

public void setNam(int nam) {
	this.nam = nam;
}

public void nhap() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap ngay: ");
	this.ngay=sc.nextInt();
	System.out.println("Nhap thang: ");
	this.thang=sc.nextInt();
	System.out.println("Nhap nam: ");
	this.nam=sc.nextInt();
}

@Override
public String toString() {
	return "NgayThang [ngay=" + ngay + ", thang=" + thang + ", nam=" + nam + "]";
}

}
