// Recursive

// Base case
// * If either list is empty, there are no remaining common elements.

// Recursive cases
// * If the first element in a equals the first element in b, add it, and recursively call without either.
// * If not equal, check the possibilities of removing only 1 element from one list, resulting in two calls.
public static List<Integer> longestCommonSubsequence(List<Integer> a, List<Integer> b) {
        
	if (a.size() == 0) return new ArrayList<>();
	if (b.size() == 0) return new ArrayList<>();
	
	if (a.get(0) == b.get(0)) {
		List<Integer> result = longestCommonSubsequence_helper(a.subList(1, a.size()), b.subList(1, b.size()));
		System.out.println(a.size() + " " + b.size() + " : " + a.get(0));
		result.add(0, a.get(0));
		return result;
	}
	else 
	{
		List<Integer> rec_a = longestCommonSubsequence_helper(a.subList(1, a.size()), new ArrayList<>(b));
		List<Integer> rec_b = longestCommonSubsequence_helper(new ArrayList<>(a), b.subList(1, b.size()));
	
		List<Integer> result = rec_a.size() > rec_b.size() ? rec_a : rec_b;
		return result;
	}
}

// DP

// Didn't work out. Tried to be clever and failed.
 public static List<Integer> longestCommonSubsequence(List<Integer> a, List<Integer> b) {
        
        List<Integer> bigger = a.size() > b.size() ? a : b;
        List<Integer> smaller = a.size() > b.size() ? b : a;
        
        int data1[] = new int[smaller.size()];
        int data2[] = new int[bigger.size()];
        
        for (int i = 0; i < bigger.size(); i++)
        {
            data2[i] = -1;
        }
        
        // Map elements to other indices.
        for (int i = 0; i < smaller.size(); i++)
        {
            int element_i = smaller.get(i);
            
            int j = 0;
            
            for (; j < bigger.size(); j++)
            {
                int element_j = bigger.get(j);
                 
                if (element_i == element_j)
                {
                
                    System.out.println("" + i + " : " + j + " - " + element_i);
                    
                    data1[i] = j;
                    data2[j] = i;
                    
                    break;
                }
            }
            
            if (j == bigger.size())
            {
                data1[i] = -1;
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        
        // ??? Unfinished
        
        
        return result;
    }