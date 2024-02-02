public static int marsExploration(String s) {
	
	int sum = 0;
	
	for (int i = 0; i < s.length(); i++)
	{
		if (i % 3 == 1)
		{
			if (s.charAt(i) != 'O')
			{
				sum++;       
			}
		}   
		else
		{
			if (s.charAt(i) != 'S')
			{
				sum++;       
			}
		}
	}

	return sum;
}