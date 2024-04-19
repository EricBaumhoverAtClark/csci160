public static List<Integer> shortestPath(List<List<Integer>> a, List<List<Integer>> queries) {
	
	class CoordComparator implements Comparator<Integer> {
		@Override public int compare(Integer a, Integer b)
		{
			int a_score = (a & 0xFFF00000) >> 20;
			
			int b_score = (b & 0xFFF00000) >> 20;
			
			int one = a_score;
			int two = b_score;
			
			return one - two;
		}
	}
	
	ArrayList<Integer> results = new ArrayList<>();
	
	int n = a.size();
	int m = a.get(0).size();
		System.out.printf("Size n & m: %d %d \n", n, m);
	
	for (List<Integer> query : queries)
	{
		System.out.printf("Loop\n\n");
		
		int s_x = query.get(0);
		int s_y = query.get(1);
		System.out.printf("Start: %d %d \n", s_x, s_y);
		int start = m * s_x + s_y + (a.get(s_x).get(s_y) << 20);
		int end_x = query.get(2);
		int end_y = query.get(3);
		System.out.printf("End: %d %d \n", end_x, end_y);
		
		CoordComparator comp = new CoordComparator();
		
		PriorityQueue<Integer> best = new PriorityQueue<>(comp);
		HashSet<Integer> explored = new HashSet<>();
		
		best.add(start);
		
		while (! best.isEmpty())
		{

			int current = best.remove();
			explored.add(current);
			int c_score = (current & 0xFFF00000) >> 20;
			
		   
			
			int c_coord = current & 0xFFFFF;
			int c_x = c_coord / m;
			int c_y = c_coord % m;
			System.out.printf("Coord: %d %d \n", c_x, c_y);
			System.out.printf("Score: %d \n\n", c_score);
			 if (c_x == end_x && c_y == end_y) 
			{
				results.add(c_score);
				break;
			}
			
                
                
                if (c_x > 0 && ! explored.contains(current - 1)) 
                    best.add(current - m + (a.get(c_x - 1).get(c_y) << 20));
                if (c_x < n - 1 && ! explored.contains(current + 1)) 
                    best.add(current + m + (a.get(c_x + 1).get(c_y) << 20));
                if (c_y > 0 && ! explored.contains(current - 1)) 
                    best.add(current - 1 + (a.get(c_x).get(c_y - 1) << 20));
                if (c_y < m - 1 && ! explored.contains(current + 1)) 
                    best.add(current + 1 + (a.get(c_x).get(c_y + 1) << 20));
                
                
            }
        }
        return results;
    }
	
	// A* implementation that combines x y and score into a single number.
	// Time: O(nmq) where n is the number of rows, m is the number of columns and q is the number of queries. Does not explore the same cell twice. 