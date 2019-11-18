import java.util.*;

public class TelcomAccountSystem {

	public static void main(String[] args) {
		
		//ʵ����һ�������û���
		TelcomUser telcomUser=new TelcomUser("13800138000");
		
		//����ͨѶ��¼
		telcomUser.generateCommunicateRecord();
		
		//��ӡ�嵥
		telcomUser.printDetails();
		
	}

}
 
class TelcomUser {
      private String phoneNumber;//ʵ��������ĵ绰����
      private String callTo;  //����Ķ���
      private StringBuffer communicationRecords; //��̸��¼
      
      public TelcomUser(String phoneNumber){  //���ɵ�һ���û�������Ҫ�е绰����
    	  
    	  this.phoneNumber=phoneNumber;
    	  this.communicationRecords=new StringBuffer();
      }
      
      //ģ��ͨ����¼������
      void generateCommunicateRecord(){
    	   //�������ͨ����¼��Ŀ
    	  int recordNum=new Random().nextInt(10);
    	  for(int i=0;i<=recordNum;i++){
    		  //������ɵ�i��ͨ����¼
    		  //��ʼʱ�䣬��ǰʱ��֮ǰ��ĳ�����ʱ��
    		  long timeStart=System.currentTimeMillis()-new Random().nextInt(36000000);
    		  //����ʱ�䣬��ʼ���ʮ�����������һ��ʱ�䣬����һ����
    		  long timeEnd=timeStart+60000+new Random().nextInt(600000);
    		  //���к���
    		  this.callTo=this.getCallToPhoneNumber();
    		  //����ͨ����¼
    		  this.communicationRecords.append(this.phoneNumber+
    				  ","+timeStart+","+timeEnd+","+this.callTo+";");
    	  }
      }
      //������ɱ������ŵĺ���
      private String getCallToPhoneNumber(){
    	  return "1380372"+String.valueOf(new Random().nextInt(10))
    	  +String.valueOf(new Random().nextInt(10))
    	  +String.valueOf(new Random().nextInt(10))
    	  +String.valueOf(new Random().nextInt(10));
    	  
      }
      //�Ʒ�
      private String accountFee(long timeStart,long timeEnd){
    	 
    	  double feePerMinute=0.2;
    	  
    	  int minutes=Math.round((timeEnd-timeStart)/60000);
    	  double feeTotal=feePerMinute*minutes;
    	  
    	  return String.format("%.4f", feeTotal);
      }
      //��ӡ�嵥
      void printDetails(){
    	  //�����еļ�¼ת�����ַ����͵��������ͣ����ڷָ����һ��������Ϣ
    	 String allRecords=this.communicationRecords.toString();
    	 
    	 String[] recordArray=allRecords.split(";");
    	 
    	 for(int i=0;i<recordArray.length;i++){
    		 
    		 //System.out.println("message i"+recordArray[i]);
    		 String[] recordField=recordArray[i].split(",");
    		 
    		 System.out.println("���У�"+recordField[0]);
    		 System.out.println("���У�"+ recordField[3]);
    		 System.out.println("ͨ����ʼʱ�䣺"+new Date(Long.parseLong( recordField[1])));
    		 System.out.println("ͨ������ʱ��"+new Date(Long.parseLong(recordField[2])));
    		 System.out.println("�Ʒѣ�"+accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))
    		 +"Ԫ");
    		 
    		                
    	 }
    	  
      }
      
}