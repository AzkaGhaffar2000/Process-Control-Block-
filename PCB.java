
import java.io.*;
import java.util.*;
import java.util.Scanner;

class RegisterSet { 
    String XAR; 
    String XDI; 
    String XDO; 
    String PC; 
    String IR; 
    String EMIT; 
    String RR; 
    String PSW; 
    String R0; 
    String R1; 
    String R2; 
    String R3; 
    String R4; 
    String R5; 
    String R6; 
    String R7;
    }
public class PCB {
	public int ppid;
	public char state;
	public String name;
	public int priority;
	public int arrivalTime;
	public int BurstTime;
	int nextPCB; 
    public static void main(String args[]) throws IOException { 
        List<Object> ProcessTable = new ArrayList<Object>(100);
        try {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter filename:");
        String filename = keyboard.nextLine(); 
        File file = new File(filename);
		Scanner inputFile = new Scanner(file);
		for (int i= -1; i <= ProcessTable.size() ; i++) {
		Boolean line = null; 
		while (line = inputFile.nextLine() != null) {
			RegisterSet Register = new RegisterSet();
    		PCB myPCB = new PCB();
    		myPCB.ppid= i;
			ProcessTable.add(myPCB.ppid);
			myPCB.state= 'n';
			ProcessTable.add(myPCB.state);
			myPCB.name= inputFile.next();
			ProcessTable.add(myPCB.name);
			
			myPCB.priority= inputFile.nextInt();
			ProcessTable.add(myPCB.priority);
			
			myPCB.arrivalTime= inputFile.nextInt();
			ProcessTable.add(myPCB.arrivalTime);
			
			myPCB.BurstTime= inputFile.nextInt();
			ProcessTable.add(myPCB.BurstTime);
			
			Register.XAR= inputFile.next();
			ProcessTable.add(Register.XAR);
			
			Register.XDI= inputFile.next();
			ProcessTable.add(Register.XDI);
			
			Register.XDO= inputFile.next();
			ProcessTable.add(Register.XDO);
			
			Register.PC= inputFile.next();
			ProcessTable.add(Register.PC);
			
			Register.IR= inputFile.next();
			ProcessTable.add(Register.IR);
			
			Register.EMIT= inputFile.next();
			ProcessTable.add(Register.EMIT);
			
			Register.RR= inputFile.next();
			ProcessTable.add(Register.RR);
			
			Register.R0= inputFile.next();
			ProcessTable.add(Register.R0);
			
			Register.R1= inputFile.next();
			ProcessTable.add(Register.R1);
			
			Register.R2= inputFile.next();
			ProcessTable.add(Register.R2);
			
			Register.R3= inputFile.next();
			ProcessTable.add(Register.R3);
			
			Register.R4= inputFile.next();
			ProcessTable.add(Register.R4);
			
			Register.R5= inputFile.next();
			ProcessTable.add(Register.R5);
			
			Register.R6= inputFile.next();
			ProcessTable.add(Register.R6);
			
			Register.R7= inputFile.next();
			ProcessTable.add(Register.R7);
			System.out.println("");
			
			int next= myPCB.nextPCB= i;
			
			for (Object Table: ProcessTable)	{
		   		System.out.print(Table);
		   
			}
			System.out.println("");
			}
			}
		} catch (Exception e) {
        System.out.println("Error:File not found!");
    }
       
    }
}