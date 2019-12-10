package cn.itcast.appliccation;   //有什么用？
import java.util.HashMap;

  /*数据库*/
public class DBUtils {
	private static DBUtils instance = null;
	private HashMap<String, User> users = new HashMap<String, User>();
	
	private DBUtils() {
		
		//    小明
		User u1 = new User();
		u1.setCardId("1001");
		u1.setCardPwd("123456");
		u1.setUserName("小明");
		u1.setCall("11111111111");
		u1.setAccount(1000);
		users.put(u1.getCardId(), u1);
		//    小红
		User u2 = new User();
		u2.setCardId("1002");
		u2.setCardPwd("123456");
		u2.setUserName("小红");
		u2.setCall("11111111112");
		u2.setAccount(1000);
		users.put(u2.getCardId(), u2);
		//	      小黄
		User u3 = new User();
		u2.setCardId("1003");
		u2.setCardPwd("123456");
		u2.setUserName("小黄");
		u2.setCall("11111111113");
		u2.setAccount(1000);
		users.put(u3.getCardId(), u3);
	}
	//懒汉式单例模式
	public static DBUtils getInstance() {
		if (instance == null) {
			synchronized (DBUtils.class) {
				if (instance == null) {
					instance = new DBUtils();
				}
			}
		}
		return instance;
	}
	//获取账户信息根据卡号
	public User getUser(String cardId) {
		User user = (User) user.getCardId(); //??????
		return user;
	}
	//获取所有用户信息
	public HashMap<String, User> getUsers(){
		return users;
	}
}
