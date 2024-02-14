O(n) time complexity and tail recursive. 
It returns the recursive call directly and goes through n calls and does constant work (ignoring string operations)

Unknown space complexity as Java may implement tail optimizations for tail recursive algorithms that
do not store the previous calls variables as they are unneeded.