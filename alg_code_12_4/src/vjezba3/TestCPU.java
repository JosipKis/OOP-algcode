package vjezba3;

public class TestCPU {

	private static CLLIST<ProcessCLS> cllList;
	
	public static void main(String[] args) {

	cllList = new CLLIST<>();
	System.out.println(cllList);
	ProcessCLS p1 = new ProcessCLS("P1", 1000);
	ProcessCLS p2 = new ProcessCLS("P2", 2500);
	ProcessCLS p3 = new ProcessCLS("P3", 3000);
	cllList.addFirst(p1);
	cllList.addFirst(p2);
	cllList.addLast(p3);
	System.out.println(cllList);
	simRoundRobin(10, cllList, 500);
	}
	/**
	    * Metoda za simulaciju RR algoritma
	    **/
	    private static void simRoundRobin(int cycles, CLLIST<ProcessCLS> processes, long alocatedTime){

	        if(processes.isEmpty()){
	            System.out.println("CPU is idle - nothing to process!");
	        } else {
	            System.out.println("Number of processes to simulate: " + processes.size());
	            System.out.println("Simulating Round Robin with " + cycles + " cycles and " + alocatedTime + " time for process");
	            System.out.println("----------------------------------------------------------------------------------------------------");
	            // nastaviti
	            for (int k = 0; k < cycles; k++) {
	            	if(processes.isEmpty()) {
	            		System.out.println("CPU finished all processes - out from looping.");
	            		break;
	            	}else {
	            		ProcessCLS actual = processes.getFirst();
	            		System.out.println("CPU fetched:\n"+ actual);
	            		if(actual.processingStep(alocatedTime)) {
	            			processes.rotate();
	            		}else {
	            			processes.removeFirst();
	            			System.out.println("Removed process: "+ actual.getProcessName());
	            		}
	            	}
	            }
	           
	            }
	            System.out.println("Processes left: " + processes.size());
	            System.out.println(processes);
	            System.out.println("----------------------------------------------------------------------------------------------------");
	        }

}
