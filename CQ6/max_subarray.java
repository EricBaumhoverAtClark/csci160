// RECURSIVE
public static int maxSubarrayHelper(List<Integer> arr, int total)
{
	if (arr.size() == 0) return total;
	
	int front = arr.get(0);
	
	List<Integer> remainder = arr.subList(1, arr.size());
	
	int try_continue = maxSubarrayHelper(remainder, total + front);
	int new_section  = maxSubarrayHelper(remainder, front);
	
	return Math.max(try_continue, Math.max(total, new_section));
	
}
 
public static int maxSubsequence(List<Integer> arr, int max) {
	
	if (arr.size() == 0) return max;
	
	int front = arr.get(0);
	
	List<Integer> remainder = arr.subList(1, arr.size());
	
	int new_max = Math.max(front, Math.max(front + max, max));
	
	return maxSubsequence(remainder, new_max);
}

public static List<Integer> maxSubarray(List<Integer> arr) {
	ArrayList<Integer> output = new ArrayList<>();
	output.add(maxSubarrayHelper(arr.subList(1, arr.size()), arr.get(0)));
	output.add(maxSubsequence(arr.subList(1, arr.size()), arr.get(0)));
	return output;
}

// DP
public static int maxSubarrayHelper(List<Integer> arr)
{
	int data[] = new int[arr.size()];
	
	for (int i = 0; i < arr.size(); i++)
	{
		data[i] = arr.get(i);
		
		int total = 0; 
		for (int k = i; k < arr.size(); k++)
		{
			total += arr.get(k);
			data[i] = Math.max(data[i], total);
		}
			
	}
	
	int max = data[0];
	
	for (int i = 1; i < arr.size(); i++)
	{
		if (data[i] > max)
		{
			max = data[i];
		}
	}
	
	return max;
	
}
 
public static int maxSubsequence(List<Integer> arr) {
	
	int data[] = new int[arr.size()];
	
	for (int i = 0; i < arr.size(); i++)
	{
		data[i] = arr.get(i);
		
		for (int j = i + 1; j < arr.size(); j++)
		{
			if (arr.get(j) > 0)
			{
				data[i] += arr.get(j);
			}
		}
	}
	
	int max = data[0];
	
	for (int i = 1; i < arr.size(); i++)
	{
		if (data[i] > max)
		{
			max = data[i];
		}
	}
	
	return max;
}

public static List<Integer> maxSubarray(List<Integer> arr) {
	ArrayList<Integer> output = new ArrayList<>();
	output.add(maxSubarrayHelper(arr));
	output.add(maxSubsequence(arr));
	return output;
}