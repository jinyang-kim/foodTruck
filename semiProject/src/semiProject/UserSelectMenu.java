package semiProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserSelectMenu {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private User us = new UserImpl();
	
	// UserMenu
	public void userMenu() throws IOException{
		int ch;
		
		try {
			do {
				//clearScreen();
				System.out.println("���� ����");
				System.out.println("==================================================");
				System.out.println("1.�α��� 2.ȸ������ 3.�ڷΰ��� 4.����");
				System.out.println("==================================================");
				System.out.print("���� => ");
				ch = Integer.parseInt(br.readLine());
			} while (ch < 1 || ch > 4);

			switch (ch) {
			case 1 : if (us.logIn()) { // ���� : ture / ���� : false
				userLoginMenu();
			} break; //�α��� �����ϸ� userServiceMenu�� �Ѿ��.
			case 2 : us.signUP(); break; //ȸ�������� �����ϵ� �����ϵ� ������������ ���ƿ´�. 
			case 3 : return;
			case 4 : System.exit(0);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void userLoginMenu() throws IOException{
		int ch;
		
		try {
			do {
				//clearScreen();
				System.out.println("���� �α��� ����");
				System.out.println("==================================================");
				System.out.println("1.�ڱ��ֺ� Ǫ��Ʈ�� �˻� 2.�з��� ã�� 3.Ű���� �˻� 4.���ã�� 5.���� Ȯ�� 6.ȸ������ 7.�α׾ƿ�");
				System.out.println("==================================================");
				System.out.print("���� => ");
				ch = Integer.parseInt(br.readLine());
			} while (ch < 1 || ch > 7);

			switch (ch) {
			case 1 : System.out.println("�ڱ��ֺ� Ǫ��Ʈ�� �˻�"); break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			case 6 : userInfoMenu(); break;
			case 7 : userMenu(); break;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void userInfoMenu() throws IOException{
		int ch;
		
		try {
			do {
				//clearScreen();
				System.out.println("ȸ������");
				System.out.println("==================================================");
				System.out.println("1.��ȸ 2.���� 3.����Ʈ ��ȸ 4.Ż�� 5.�ڷΰ���");
				System.out.println("==================================================");
				System.out.print("���� => ");
				ch = Integer.parseInt(br.readLine());
			} while (ch < 1 || ch > 5);

			switch (ch) {
			case 1 : us.userInfo(); break;
			case 2 : System.out.println("ȸ������ ����"); break;
			case 3 : System.out.println("����Ʈ ��ȸ"); break;
			case 4 : System.out.println("Ż��"); break;
			case 5 : userLoginMenu(); break;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}