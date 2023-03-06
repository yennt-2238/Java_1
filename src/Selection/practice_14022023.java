package Selection;
import java.util.Scanner;
public class practice_14022023 {
	private static int number;
	static Scanner sc = new Scanner(System.in);
 	public static void main(String[] args) {
 // TODO Auto-generated method stub
	
 System.out.println("Nhập số từ bàn phím:");
 number= sc.nextInt();
// if (number>0) {
// System.out.println(number+" là số dương");
// }
// else if(number<0){
// System.out.println(number+" là số âm");
// }
// else {
// System.out.println(number+" là số không âm không dương");
// }
// 
 if (number>0) {
	 System.out.println(number+" là số dương");
	 return;
	 }
 if(number<0){
	 System.out.println(number+" là số âm");
	 return;
	 }
	 System.out.println(" là số 0");

 
	int date;
	System.out.println("Nhập ngày từ bàn phím:");
	date= sc.nextInt();
 switch (date) {
 case 2:
 System.out.println("Thứ 2");
 break;
 case 3:
 System.out.println("thứ 3");
 break;
 case 4:
 System.out.println("thứ 4");
 break;
 case 5:
 System.out.println("thứ 5");
 break;
 case 6:
 System.out.println("thứ 6");
 break;
 case 7:
 System.out.println("thứu 7");
 break;
 case 8:
 System.out.println("chủ nhật");
 break;
 default:
 System.out.println("Data invalid");
 }
 int diem;
	System.out.println("Nhập diem từ bàn phím:");
	diem= sc.nextInt();
	
	if ((diem>=0)&&(diem <=49)) {
 System.out.println(diem+" là điểm F");}
	else if((diem>=50)&&(diem <=59)){
 System.out.println(diem+" là điểm D");
	}
	else if((diem>=60)&&(diem <=69)){
 System.out.println(diem+" là điểm C");
	}
	else if((diem>=70)&&(diem <=79)){
 System.out.println(diem+" là điểm B");
	}
	else if((diem>=80)&&(diem <=100)){
 System.out.println(diem+" là điểm A");
	}
 else
 System.out.println("Data invalid");
}
}