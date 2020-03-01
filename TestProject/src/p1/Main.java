package p1;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MuscatBank mb =  new MuscatBank();
		mb.setEmId(10);
		mb.setEmName("Majed");
		mb.setEmPosition("Asistent Manager");
		mb.setEmStatus("Active");
		
		
		System.out.println(
			"EmployeeID: " + mb.getEmId() +"\n"+
			"Employee Name:" + mb.getEmName() + "\n"+
			"Employee Position:" + mb.getEmPosition()+"\n"+
			"Employee Status: " + mb.getEmStatus());
		
		
		System.out.println("Write Once Run Any Where!");
	}
	
	}


