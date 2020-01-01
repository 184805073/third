package view;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;

import dao.StudentDao;
import entity.IEntity;

public class MainUI {
	public static void show1(String studentNo,String studentPassword) throws Exception{
		//��¼�ɹ������MainUI���빦��ѡ��
		System.out.println("================��ӭʹ��ѧ����Ϣ����ϵͳ=========");
		System.out.println("ѧ������");
		System.out.println("1-�޸����룻2-ѡ�Σ�3-��ѡ��0-�˳�");//4-�鿴������Ϣ��
		Scanner scanner = new Scanner(System.in);
		HashMap<String, IEntity> hash = new HashMap<String,IEntity>();
		StudentDao studentDao = StudentDao.getInstance();
	    hash = studentDao.getAllEntities();  //sc��
		String option = scanner.nextLine();  //����ѡ��������
		switch (option) {
		case "1":   //�޸�����
			ModifyPasswordUI.show();
			break;
		case "2":   //ѡ��
			CourseSelection.show1(studentNo, studentPassword);
			break;
		case "3":   //��ѡ
			CourseSelection.show2(studentNo, studentPassword);
			break;
//		case "4":   //�鿴������Ϣ
//			getEntity(studentNo);
//			break;
		case "0":   //�˳�
			break;
		default:
			System.out.println("��������������������룡");
		}
		System.out.println("========��лʹ��ѧ����Ϣ����ϵͳ=======");
	}
	
	public static void show2(String studentNo,String studentPassword) throws Exception{
		//��¼�ɹ������MainUI���빦��ѡ��
		System.out.println("================��ӭʹ��ѧ����Ϣ����ϵͳ=========");
		System.out.println("����Ա����");
		System.out.println("1-�鿴ѧ����Ϣ��2-�鿴�γ���Ϣ��3-�鿴ѧ��ѡ����Ϣ��0-�˳�");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();  //����ѡ��������
		switch (option) {
		case "1":   //ѧ����Ϣ����ɾ�Ĳ�
			Guanlistudent.show();
			break;
		case "2":   //�γ���Ϣ����ɾ�Ĳ�
			Guanlicourse.show();
			break;
		case "3":   //ѧ��ѡ����Ϣ����ɾ�Ĳ�
			Guanlisc.show();
			break;
		case "0":   //�˳�
			break;
		default:
			System.out.println("��������������������룡");
		}
		System.out.println("========��лʹ��ѧ����Ϣ����ϵͳ=======");
	}
	
}
