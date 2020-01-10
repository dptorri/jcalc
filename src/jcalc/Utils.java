package jcalc;

public class Utils {

    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int div(int x, int y)
    {
    	if(y == 0 ) {
    		return 0;
    	} else {
	        int result = x/y;
	        return result;
    	}

    }
}
