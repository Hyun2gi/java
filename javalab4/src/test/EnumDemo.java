package test;

public class EnumDemo {
	
	public enum Weekend{
		FRI, SAT, SUN
	}

	public static void main(String[] args) {
		Weekend day = Weekend.FRI;
		System.out.println(day.ordinal() + " " + day.toString());
	}

}
