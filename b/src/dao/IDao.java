package dao;
import java.util.HashMap;
import entity.Student;

public interface IDao {
	void insert(Student student) throws Exception;         //增加
	void delete();                                         //删除
	void update();                                         //更新修改
	public HashMap<String, Student> getstudents();         //双列集合 
	public Student getEntity(String Id);                   //查找
}
