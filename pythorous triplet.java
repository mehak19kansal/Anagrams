package pythorous;
import java.util.*;
 public class  triplet{
	 public static void main(String args [])
		{
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			for(int a = 0;a < num;a++)
			{
				
				int n = sc.nextInt();
				int arr[] = new int[n];
				int flag = 0;
				for(int i=0;i<n;i++) {
				    
				    int a1=arr[i]*arr[i];
				    
					for(int j=i+1;j<n;j++) {
						
						int b=arr[j]*arr[j];
						
						int pt=a1+b;
					
						
						for(int k=j+1;k<n;k++) {
							int c=arr[k]*arr[k];
							
							if(c==pt)
								flag=1;
							
						}
					}
				}
			
				if(flag==1)
					System.out.println("yes");
				else
					System.out.println("no");
				}
			}
			}
		
