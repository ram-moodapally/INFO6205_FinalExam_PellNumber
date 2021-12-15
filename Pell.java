package edu.neu.coe.info6205.finalexam;



public class Pell {
    public Pell() {
    }

    public long get(int n) {
        if (n < 0) throw new UnsupportedOperationException("Pell.get is not supported for negative n");
        if (n<=2)
        {
            return n;
        }
        if(n>2) {
        	long pl1 = 1;  
        	long pl2 = 2;  
        	long z;  
        	for (long i = 3; i <= n; i++)   {  
        	z = 2 * pl2 + pl1;  
        	pl1 = pl2;  
        	pl2 = z;  
        	}  
        	return pl2;  
        	
        }
        return 0; 
        }
}
