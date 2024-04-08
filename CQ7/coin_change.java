
// Base Cases
// * n == 0 - recursive sequence is valid.
// * n != 0 && n < All values in c - recursive sequence is not valid so return 0.

// Recursive Case
// * n > some c - find all valid sequences that use that coin and higher coins. Avoid lower coins to prevent duplicates.

public static long getWays(int n, List<Long> c) {
	if (n == 0)
	{
		return 1;
	}
	
	long total = 0;
	for (int i = 0; i < c.size(); i++)
	{
		if (n >= c.get(i))
		{
			total += getWays((int)(n - c.get(i)), c.subList(i, c.size()));
		}
	}
	return total;
}