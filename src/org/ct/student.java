package org.ct;

public class student {
public void studentName() {
System.out.println("Venkat");
}
public void studentMark() {
	System.out.println(1000);
}
public void studentAddress() {
	System.out.println("Andhra Pradesh");
}
public static void main(String[] args) {
	student info = new student();
	info.studentName();
	info.studentMark();
	info.studentAddress();
}
}