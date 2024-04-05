public static void print_list(List<Integer> arr)
 {
	 for (int i = 0; i < arr.size(); i++)
	 {
		 if (i != 0) System.out.print(" ");
		 System.out.print(arr.get(i));
	 }
	 
	 System.out.println();
 }
 
public static void insertionSort2(int n, List<Integer> arr) {
	if (n < 2) return;
	int idx = arr.size() - (n - 1);
	
	int element = arr.get(idx);
	
	arr.remove(idx);
	
	for (int i = 0; i < idx; i++)
	{
		if (element < arr.get(i))
		{
			arr.add(i, element);
			print_list(arr);
			insertionSort2(n-1, arr);
			return;
		}
	}
	arr.add(idx, element);
	print_list(arr);
	insertionSort2(n-1, arr);
}   