
public static void plusMinus(List<Integer> arr) {
	double positive = 0;
	double negative = 0;
	double zeroes   = 0;
	
	for (int val : arr)
	{
		if (val > 0)
		{
			positive++;
		}
		else if (val == 0)
		{
			zeroes++;
		}
		else
		{
			negative++;
		}
	}
	System.out.printf("%.6f\n", positive / arr.size());
	System.out.printf("%.6f\n", negative / arr.size());
	System.out.printf("%.6f\n", zeroes   / arr.size());
}