package cn.itcast.appliccation;   //��ʲô�ã�
import java.util.HashMap;

  /*���ݿ�*/
public class DBUtils {
	private static DBUtils instance = null;
	private HashMap<String, User> users = new HashMap<String, User>();
	
	private DBUtils() {
		
		//    С��
		User u1 = new User();
		u1.setCardId("1001");
		u1.setCardPwd("123456");
		u1.setUserName("С��");
		u1.setCall("11111111111");
		u1.setAccount(1000);
		users.put(u1.getCardId(), u1);
		//    С��
		User u2 = new User();
		u2.setCardId("1002");
		u2.setCardPwd("123456");
		u2.setUserName("С��");
		u2.setCall("11111111112");
		u2.setAccount(1000);
		users.put(u2.getCardId(), u2);
		//	      С��
		User u3 = new User();
		u2.setCardId("1003");
		u2.setCardPwd("123456");
		u2.setUserName("С��");
		u2.setCall("11111111113");
		u2.setAccount(1000);
		users.put(u3.getCardId(), u3);
	}
	//����ʽ����ģʽ
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
	//��ȡ�˻���Ϣ���ݿ���
	public User getUser(String cardId) {
		User user = (User) user.getCardId(); //??????
		return user;
	}
	//��ȡ�����û���Ϣ
	public HashMap<String, User> getUsers(){
		return users;
	}
}
