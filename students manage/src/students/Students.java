package students;

public class Students {
	
	public boolean flag;
	public String name;
	public String number;
	public String qq;
	
	Students(String name,String number,String qq){
		this.name = name;
		this.number = number;
		this.qq = qq;
		this.flag = true;
	}
	
	Students(){
		this.name = "";
		this.number = "";
		this.qq = "";
		this.flag = true;
	}
	
	public String getName(){
		return name;
	}
	public String getNumber(){
		return number;
	}
	public String getQq(){
		return qq;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setNumber(String number){
		this.number = number;
	}
	public void setQq(String qq){
		this.qq = qq;
	}
	
}
