
public class BubbleSort implements SortingAlgorithm {

	public void sort(int a[])
	{
		int j = 0;
		for(int i = 0; i<a.length-1-j; i++)
		{
			if(a[i] > a[i+1])
			{
				swap(a,i,i+1);
			}
		}
		boolean swapped = true;
		while(swapped)
		{
			swapped = false;
			for(int i=0; i<a.length-1;i++)
			{
				if(a[i]>a[i+1])
				{
					swap(a,i,i+1);
					swapped = true;
				}
			}
		}
	}
	private void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}
	
	

}
