public static boolean hasHackerrank(String s, String completed)
{
	if (s.length() == 0)
	{
		return false;
	}
	else
	{
		char front = s.charAt(0);
		String target = "hackerrank";
		
		if (front == target.charAt(completed.length()))
		{
			completed = completed + front;
			
			if (completed.equals(target)) return true;
		}
		
		return hasHackerrank(s.substring(1), completed);
	}
}

public static String hackerrankInString(String s) {
	return hasHackerrank(s, "") ? "YES" : "NO";
}