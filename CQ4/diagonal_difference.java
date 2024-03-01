public static int diagonalDifference(List<List<Integer>> arr) {
	int left_right = 0;
	int right_left = 0;
	
	for (int i = 0; i < arr.size(); i++)
	{
		left_right += arr.get(i).get(i);
		right_left += arr.get(i).get(arr.size()-i-1);
	}
	
	return Math.abs(left_right - right_left);
}