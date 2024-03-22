public static void plusMinus(List<Integer> list) {
    double p = 0;
    
    double n    = 0;
    
    double z   = 0;
    
    for (int element : list)
    {
        if (element > 0) p++;
        else if (element == 0) z++;
        else n++;
    }
    System.out.printf("%.6f\n", p / list.size());
    
    System.out.printf("%.6f\n", n / list.size());
    
    System.out.printf("%.6f\n", z   / list.size());
}