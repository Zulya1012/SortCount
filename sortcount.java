public class sortcount{
	public static void main (String[] arg){
		int num[] = {7, 5, 7, 1, 1, 7, 3, 5, 4, 2};
		int count=1;
		for (int i=0; i<num.length; i++){
			for (int j=1; j<num.length; j++){
				if (num[j-1]>num[j]){
					int min=num[j];
					num[j]=num[j-1];
					num[j-1]=min;
				}
			}
		}
		
		for (int k=1; k<num.length; k++){
			if (num[k]==num[k-1]){
				count=count+1;
			}
				
			
			else {
			System.out.println(num [k-1]);
			System.out.println(count);
			count=1;
			}
		}
		System.out.println(num[num.length-1]);
		System.out.println(count);
		
	}
}
