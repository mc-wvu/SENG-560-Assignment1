/**
 * Simple math class for SENG560 
 * needs to handle and return several types. 
 * method overloading is used to chose which method of the same name to run by return type. 
 * functions work on the primatives and utilize autoboxing to handle calling by the object version ie int = Integer. 
 * widening is also automatic ie. you can place an Int into a Long or a float into a double with no conversion. 
 * hex/
 * 
 */
package SENG560;

/**
 *
 * @author michaelcole
 */
public class basicmath {

/**
 * add two longs a return long
 * @param x 
 * @param y
 * @return long of x+y
 * @throws Exception 
 */    
Long addToLong(long x,long y) throws Exception { 
    return Math.addExact(x, y); // Why use java's build in math, because it will prevent overflow and create trapible exceptions. 

}

/**
 * add two strings that is either oct/hex/binary 
 * @param x oct/hex/binary string
 * @param y oct/hex/binary string
 * @return long of x + y
 * @throws Exception 
 */
Long addToLong(String x,String y) throws Exception{
    Long result;
    Long lx;
    Long ly;        
    try {
        lx = Long.decode(x); // power of OO  will detect and decode oct/hex/binary 
        ly = Long.decode(y);
    } catch (NumberFormatException nfe){ throw nfe;} // pass the exception up the call tree 

    result = addToLong(lx,ly);    
    return result;       
}
/**
 * will take float/double round them and return the added long
 * @param x
 * @param y
 * @return
 * @throws Exception 
 */
Long addToLong(double x, double y) throws Exception{
    return Math.round(x + y); // floats do not overflow in java, will become Double.MIN/MAX_INFINITY
}

/**
 * add to double with doubles
 * @param y
 * @param x
 * @return
 * @throws Exception 
 */
Double addToDouble (double y, double x) throws Exception {
    return x + y;  // new over flows in jva. 


}

/**
 * add to double via string oct/hex/binary
 * @param x
 * @param y
 * @return
 * @throws Exception 
 */

/**
 * 
 * @param x
 * @param y
 * @return 
 */
Long subtractToLong(long x, long y) throws Exception {
    return Math.subtractExact(x,y); 
}

/**
 * subtractToLong from String oct/hex/binary
 * @param x
 * @param y
 * @return
 * @throws Exception 
 */
Long subtractToLong(String x, String y) throws Exception {
     Long result;
    Long lx;
    Long ly;        
    try {
        lx = Long.decode(x); // power of OO  will detect and decode oct/hex/binary 
        ly = Long.decode(y);
    } catch (NumberFormatException nfe){ throw nfe;} // pass the exception up the call tree 

    result = subtractToLong(lx,ly);    
    return result; 
          
}

/**
 * subtract to long from double 
 * @param x
 * @param y
 * @return
 * @throws Exception 
 */
Long subtractToLong(double x, double y) throws Exception {
    return Math.round(x - y);
}



/** 
 * multiply to long with longs
 * @param x
 * @param y
 * @return 
 */
Long multiplyToLong(long x, long y) throws Exception {
    return Math.multiplyExact(x, y);
}

/**
 * multiply to long with string oct/hex/bin
 * @param x
 * @param y
 * @return
 * @throws Exception 
 */
Long multiplyToLong(String x,String y) throws Exception {
    Long result;
    Long lx;
    Long ly;        
    try {
        lx = Long.decode(x); // power of OO  will detect and decode oct/hex/binary 
        ly = Long.decode(y);
    } catch (NumberFormatException nfe){ throw nfe;} // pass the exception up the call tree 

    result = multiplyToLong(lx,ly);    
    return result; 
}



/** 
 * Integer divide in java, throws exception.  
 * @param x
 * @param 
 * @return 
 */
Long divideToLong(long x, long y) throws Exception { 
    long result; 
    if(y==0){throw new ArithmeticException("Divide By Zero"); }
    try { result = x / y; } catch( Exception ex){throw ex; }
return result; 
}

/**
 * integer divide from string oct/hex/bin 
 * @param x
 * @param y
 * @return
 * @throws Exception 
 */
Long divideToLong(String x, String y) throws Exception {
     Long result;
    Long lx;
    Long ly;        
    try {
        lx = Long.decode(x); // power of OO  will detect and decode oct/hex/binary 
        ly = Long.decode(y);
    } catch (NumberFormatException nfe){ throw nfe;} // pass the exception up the call tree 

    result = divideToLong(lx,ly);    
    return result;    
}

/**
 * divide doubles rounded to a long 
 * @param x
 * @param y
 * @return
 * @throws Exception 
 */
Long divideToLong(double x, double y) throws Exception {
    return Math.round(x / y); // there is no divide by zero with floats. 
}

/**
 * divide using doubles returning double
 * @param x double
 * @param y double
 * @return
 * @throws Exception 
 */
Double divideToDouble(double x, double y) throws Exception {
    return x / y; // no divide by zero with floats 
}

/**
 * SquareRoot 
 * @param x
 * @return Long 
 * @throws Exception 
 */
Long squareRootToLong(long x) throws Exception {
    return Math.round(Math.sqrt(x));
}

/**
 * squareRoot 
 * @param x String/ OCT/HEX/BIN
 * @return
 * @throws Exception 
 */
Long squareRootToLong(String x)throws Exception { 
    long lx;
    try {
        lx = Long.decode(x); // power of OO  will detect and decode oct/hex/binary 
    } catch (NumberFormatException nfe){ throw nfe;} // pass the exception up the call tree 
 return squareRootToLong(lx);
}

/**
 * square root 
 * @param x double/float
 * @return
 * @throws Exception 
 */
Long squareRootToLong(double x)throws Exception{ 
    return Math.round(Math.sqrt(x));
}

/**
 * square root 
 * @param x
 * @return
 * @throws Exception 
 */
Double squareRootToDouble(double x)throws Exception{
    return Math.sqrt(x);
}

/**
 * 
 * @param x
 * @return
 * @throws Exception 
 */
Double squareRootToDouble(long x)throws Exception{
  return Math.sqrt(x);
}

/**
 * 
 * @param x
 * @return
 * @throws Exception 
 */


/**
 * 
 * @param x
 * @param power
 * @return
 * @throws Exception 
 */
Long exponentToLong(long x, long power)throws Exception{ 
    return Math.round(Math.pow(x,power));
}

/**
 * 
 * @param x
 * @param power
 * @return
 * @throws Exception 
 */
Long exponentToLong(String x, String power)throws Exception{
        long lx; 
    long lpower; 
    try { lx = Long.decode(x);
        lpower = Long.decode(power);
    } catch (NumberFormatException nfe){ throw nfe;}
    return exponentToLong(lx,lpower);
}




/**
 * 
 * @param x number
 * @param power power to which you are raising 
 * @return x^power 
 */
Double exponentToDouble(double x,double power)throws Exception{
    return Math.pow(x,power);
}

/**
 *  exponent
 * @param x STring OCT/HEX/BIN
 * @param power
 * @return
 * @throws Exception 
 */

Double doubleTest(double result)throws Exception{
 
    if(result == Double.POSITIVE_INFINITY ) {
        throw new ArithmeticException("Double overflow resulting in POSITIVE_INFINITY");
    } else if(result == Double.NEGATIVE_INFINITY) {
        throw new ArithmeticException("Double overflow resulting in NEGATIVE_INFINITY");
    } else if(Double.compare(-0.0f, result) == 0) {
        throw new ArithmeticException("Double overflow resulting in negative zero");
    } else if(Double.compare(+0.0f, result) == 0) {
        throw new ArithmeticException("Double overflow resulting in positive zero");
    }

    return result;
}
}


