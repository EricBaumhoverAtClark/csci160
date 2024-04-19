public static void staircase(int n) 
{
	for (int i = 1; i <= n; i++)
	{
		for (int j = 0; j < n - i; j++)
		{
			System.out.print(" ");
		}
		for (int k = n - i; k < n; k++)
		{
			System.out.print("#");
		}
		System.out.println();
	}
}

// Time is O(n^2) where n is the input n.
// Space is O(1) as no values are stored.