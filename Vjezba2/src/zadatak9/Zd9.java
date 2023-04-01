package zadatak9;

public class Zd9 {

	public static void main(String[] args) {

		float[] nums = {2.44f, 4.55f, 7.88f, 44.32f, 51.11f};
		int idx = 0;
		for (float i: nums) {
			System.out.println("Index: "+ idx +" <-> Value: "+ i);
			idx++;
		}
	}

}
