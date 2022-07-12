package week1.assignment;

public class mymobile {
       String mobilename = "samsung";
       String model  = "galaxya50s";
       int ram_memory = 8;
       boolean network_accessable;
       
   //make calling   
       public void makecall() {
		System.out.println("calling");
	}
       
 //sending message
       public void sendMsg() {
	System.out.println("sending message");
}
       
 //paybill 
       private void paybills() {
	     System.out.println("prepaid");
}  
       
       //main method print out statements.
       public static void main(String[] args) {
		mymobile phone = new mymobile();
		System.out.println("mobilename is " +phone.mobilename);
		System.out.println("model "+phone.model);
		System.out.println("ram_memory "+phone.ram_memory);
		System.out.println("is network_accessable "+phone.network_accessable );
		phone.makecall();
		phone.sendMsg();
		phone.paybills();
		
		
	}
}
