import java.util.Scanner;

public class Test_Arwqe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scann = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���>>");
		int num = scann.nextInt();
		
		for(int i=num;i>0;i--) {
			for(int j=0;j<i;j++){
			   System.out.print("*");
		}
			System.out.println();
	}

	}

}
