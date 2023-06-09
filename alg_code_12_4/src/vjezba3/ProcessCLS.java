package vjezba3;

public class ProcessCLS {

	private int processID;
	private static int cntID = 10;
	private long processDuration;
	private long processingTime;
	private String processName;

	


	public ProcessCLS(String name, long TimeDuration) {
		this.processName = name;
		this.processID = cntID++;
		this.processDuration = TimeDuration;
		this.processingTime = 0;
		System.out.println("Created process - ");
	}
	
	public void setProcessDuration(long timeDuration) {
		this.processDuration = timeDuration;
	}
	
	public String getProcessName() {
		return processName;
	}
	
	public int getProcessID() {
		return processID;
	}
	
	public boolean isFinished() {
		return processDuration == processingTime;
	}
	
	public boolean processingStep(long timeElapsed) {
		processingTime += timeElapsed;
		return processingTime < processDuration;
	}

	@Override
	public String toString() {
		return  " Duration=" + processDuration + ", processing="
				+ processingTime + ", Name=" + processName + "]";
	}
	
	
}