public static void miniMaxSum(List<Integer> arr) {
	Collections.sort(arr);
	long sum = 0;
	for (int i = 0; i < 4; i++)
	{
		sum += arr.get(i);
	}
	System.out.printf("%d ", sum);
	sum = 0;
	for (int i = 4; i >= 1; i--)
	{
		sum += arr.get(i);
	}
	System.out.printf("%d", sum);
}