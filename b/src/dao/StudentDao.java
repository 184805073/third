package dao;

import java.io.*;
import entity.IEntity;
import entity.Student;

import java.util.HashMap;

public class StudentDao implements IDao {
	private static StudentDao instance;
	private HashMap<String, Student> students;
	private Student student;
	
	private StudentDao() throws Exception {
	//私有学生数据库   //构建文件txt存储学生数据，只调用无操作
		
		students = new HashMap<String, Student>();               // students是全部数据存放的地方
		student = new Student();                                 //new一个学生对象
		
		FileInputStream fi = new FileInputStream("student.txt"); //定义字符输出流 读出来
		ObjectInputStream oi = new ObjectInputStream(fi);        //建立字符输出流缓冲区
		students = (HashMap<String, Student>)oi.readObject();
		fi.close();
		oi.close();
	}
	public static StudentDao getInstance() throws Exception {
											  	 	//提供单例实例化对象
		if(instance == null) {                	 	//如果数据库为空
			synchronized(StudentDao.class) { 	 	//锁死   饿汉式
				instance = new StudentDao(); 	 	//创建实例对象
				return instance;             	 	//返回实例对象
			}
		}
		return instance;
	}
	public HashMap<String, Student> getstudents() {
		return students;
	}
	//增
	public void insert(Student student) throws Exception {
		students.put(student.getStudentNo(),student);
        FileOutputStream fs = new FileOutputStream("student.txt");
        ObjectOutputStream os = new ObjectOutputStream(fs);
        os.writeObject(students);
        os.close();
        fs.close();
	}

	//删除
	public void delete() {
		
		
		
	}

	//改
	public void update() {
		
	

	}

	
	//获得实体化对象 ，通过ID查找获得该学号的学生信息
	public Student getEntity(String Id) {
		
		
		return students.get(Id);
	}

	
	public static void main(String[] args) throws Exception {
		
	}

}
