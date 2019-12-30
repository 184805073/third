package view;

import java.sql.SQLException;
import java.util.Scanner;

public class MainUI {
	
	public static void show1() throws Exception{
		//登录成功后进入MainUI进入功能选择
		System.out.println("================欢迎使用学生信息管理系统=========");
		System.out.println("学生界面");
		System.out.println("1-修改密码；2-选课；3-个人信息；0-退出");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();  //输入选择功能数字
		switch (option) {
		case "1":   //修改密码
			ModifyPasswordUI.show();
			break;
		case "2":   //选课
			//new CourseSelection().show();
			break;
		case "3":   //个人信息
			//new StudentSelection().show();
			break;
		case "0":   //退出
			break;
		default:
			System.out.println("输入操作有误！请重新输入！");
		}
		System.out.println("========感谢使用学生信息管理系统=======");
	}
	public static void show2() throws Exception{
		//登录成功后进入MainUI进入功能选择
		System.out.println("================欢迎使用学生信息管理系统=========");
		System.out.println("管理员界面");
		System.out.println("1-查看学生信息；2-查看课程信息；3-查看学生选课信息；0-退出");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.nextLine();  //输入选择功能数字
		switch (option) {
		case "1":   //学生信息的增删改查
			
			break;
		case "2":   //课程信息的增删改查
			
			break;
		case "3":   //学生选课信息的增删改查
			//new CourseSelection().show();
			break;
		case "0":   //退出
			break;
		default:
			System.out.println("输入操作有误！请重新输入！");
		}
		System.out.println("========感谢使用学生信息管理系统=======");
	}
}
