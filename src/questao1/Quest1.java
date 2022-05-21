package quest1;

public class Quest1 {
	
	public static void main(String[]args) {
		float values[] = {2,4,5,6,8};
		int i;
		float media=0;
		
		for (i=0; i<=values.length-1;i++) {
			media += values[i];
		}
		
		media = media/values.length;
		System.out.print("Média do vetor: " +media);
	}

}
