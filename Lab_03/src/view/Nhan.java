package view;

public class Nhan {
	try {
        int a = getSo1();
        int b = getSo2();
        txtKetQua.setText(String.valueOf(a * b));
    } catch (NumberFormatException ex) {
        txtKetQua.setText("Lỗi định dạng số!");
    }
}
