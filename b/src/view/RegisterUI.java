package view;

import java.util.Scanner;
import biz.StudentBiz;
import dao.StudentDao;
import entity.Student;

public class RegisterUI {  
	//用户注册
	public static void show() throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入学号：");
		String studentNo = scanner.nextLine();
		System.out.println("请输入姓名：");
		String studentName = scanner.nextLine();
		System.out.println("请输入性别：");
		String studentGender = scanner.nextLine();
		System.out.println("请输入年龄：");
		int studentAge = Integer.parseInt(scanner.nextLine());		
		System.out.println("请输入院系：");
		String studentDepartment = scanner.nextLine();
		System.out.println("请输入密码：");
		String firstPassword = scanner.nextLine();
		System.out.println("请再次输入密码：");
		String secondPassword = scanner.nextLine();
		
		StudentBiz sc = new StudentBiz();//调用学生数据库存入注册学生信息
		sc.register(studentNo, 
				studentName, 
				studentGender, 
				studentAge, 
				studentDepartment, 
				firstPassword, 
				secondPassword);
	}
}
