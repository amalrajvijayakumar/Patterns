package self;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {26, 24, 8, 4, 1};
		int key = 10;
		int min=0; int max = arr.length-1;
		//min = 0    max = 4    mid = 2
		//min = 0    max = 1    mid = 0
		//min = 1   max = 1    mid = 1
		
	while(min<=max)
		{
			int mid = (min+max)/2;
			if(key == arr[mid])
			{
				System.out.println("Yes Present at " + mid);
				break;
			}
			else if ( key > arr[mid])
			{
				max = mid-1; //max =
			}
			else
			{
				min = mid + 1; //min =1
			}
		}
		if(min>max)
		{
			System.out.println("Key is not present");
		}
   }
}
