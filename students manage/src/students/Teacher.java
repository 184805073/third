package students;

import java.util.*;
import students.Students;

public class Teacher {

	static int k=0;
	static int length=0;
	static Students[] Students=new Students[100];
	static Scanner in=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
 
	while(true){	
		
		System.out.println("cin>> choice please");
		System.out.println("1--------add");
		System.out.println("2--------delete");
		System.out.println("3--------change");
		System.out.println("4--------find");
		System.out.println("5--------break");
		
		int a=in.nextInt();
		
		switch(a){
		
		    case 1:    	
		    	add();		    	
		    	break;
		    	
		    case 2: 

                delete();		    			    	
		    	break;
		    case 3: 
		    	
		    	change();
		    	break;
		    case 4: 
		    	
		    	find();
		    	break;
		
		    default:
		    	System.out.println("cin is wrong ,again please");
		    	break;
		}
		
	}
	}
	
	public static void add(){
		
		while(true){
		
		System.out.println("cin>>0 quite, cin>>1 continue");
		if(in.nextInt()==0) break;
		//add
    	System.out.println("cin>> name  ---please");
    	Students[k].setName(in.next());
//    	String name=in.next();
     	
    	
    	System.out.println("cin>> num   ---please");
    	Students[k].setNumber(in.next());
//    	String num=in.next();
  	
    	System.out.println("cin>> qq    ---please");
    	Students[k].setQq(in.next());
//    	String qq=in.next();
    	
//    	Student stu=new Student(name,num,qq);
    	k++;
    	System.out.println("add Successfully");
//    	int i;
//    	for( i=0;i<length;i++){
//    		
//    		if(Stu[i].num==stu.num&&Stu[i].flag==true){
//    			
//    			//false
//    			System.out.println("num is already exits---add false");
//    			break;
//    		}
//    	}
//    	
//    	if(i==length){
//    		
//    	 Stu[k]=stu;
//    	 length++;	
//    	 k++;
//    	 
//    	 System.out.println("add Successfully");
//    	}
    	
	}//3
	}//2
	
	public static void delete(){
		
		System.out.println("cin>> num  ---please");
		String num=in.next();
		
    	int j;
    	for( j=0;j< length;j++){
    		
    		if(num.equals(Students[j].getNumber())){
    			
    			Students[j].flag=false;
    			
    			System.out.println("Delete Successfully");
    			break;
    		}
    	}
    	if(j==length){
    		
    		System.out.println("num cannot find, False Delete");
    	}
	}
	
	public static void change(){
		
		System.out.println("cin>> num  ---please");
    	String num=in.next();
    			
    	int i;
    	for(i=0;i< length;i++){
    		
    		// 
              if(num.equals(Students[i].getNumber())&&Students[i].flag==true){
            	  
            	  System.out.println("请输入要更改的信息：1 name 2 num 3 qq");
            	  
            	  String cc=in.next();
            	  
            	 
            	  System.out.println("请输入要更改的信息：1 name 2 num 3 qq");
            	  String changeTo=in.next();
            	  
            	  if(cc.equals("1")){
            		  
            		  //Stu[i].name=changeTo;
            		  Students[i].setName(changeTo);
            		  
            	  }else if(cc.equals("2")){
            		  
            		  //Stu[i].num=changeTo;
            		  Students[i].setNumber(changeTo); 
            		  
            	  }else if(cc.equals("3")){
            		  
            		  Students[i].qq=changeTo;
            	  }
            	  
            	  System.out.println("change Successfully");
            	  break;
              }	    		
    	}
    	
    	if(i==length) System.out.println("fail change");
	}
	
	public static void find(){
		
		System.out.println("cin>> num  ---please");
    	String num=in.next();
    	
    	int i;
    	for(i=0;i<length;i++){
    		
              if(num.equals(Students[i].number)&&Students[i].flag==true){
            	  
            	  
            	System.out.println("message:"+Students[i].name+Students[i].number+Students[i].qq);
            	System.out.println("message:"+Students[i].getName()+Students[i].getNumber()+Students[i].getQq());  
            	 break; 
             }
    	 }  
    	
    	if(i==length){
    		
    		System.out.println("wrong num or do not exist");
    	}
    	
	}

}
