package OOPS.WrapperClasses;

public class AutoBoxingAndUnboxing {
    public static void main(String[] args) {

        // Auto Boxing
        int varOne = 100;
        Integer wrapVarOne = varOne; // Integer wrapVarOne = Integer.valueOf(varOne);

        // Unboxing 
        Integer varTwo = 99;
        int unwrapVarTwo = varTwo; // int unwrapVarTwo = varTwo.intValue();

        Integer nullableValue = null;   
        // int unwrapNullableValue = nullableValue; // NullPointerException

        // Comparision
        Integer numOne = 200;
        Integer numTwo = 200;

        System.out.println(numOne == numTwo); // false, checks reference
        System.out.println(numOne.equals(numTwo)); // true

        Integer cachedNumOne = 100;
        Integer cachedNumTwo = 100;

        System.out.println(cachedNumOne == cachedNumTwo); // true, caching
        System.out.println(cachedNumOne.equals(cachedNumTwo)); // true

    }

    
}
