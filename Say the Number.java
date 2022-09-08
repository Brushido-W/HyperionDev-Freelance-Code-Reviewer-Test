import java.text.NumberFormat;

// create class that converts numbers to words
public class NumberToWordsConverter {

    // create a public static variable to store constant values form 0 - 19
    public static final String[] units = { " ", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen" };
            
    // create a public static variable to store constant values for ever 10th value from 0 - 90
    public static final String[] tens = { 
            "", "",    "Twenty","Thirty",
            "Forty","Fifty","Sixty",
            "Seventy","Eighty","Ninety" 
    };

    public static String convert(final int n) {
    //0 Zero
    //10 ten
    //100 hundred
    //1,000 thousand
    //100,000 hundred thousand
    //1,000,000 million
    //1,000,000,000 billion
    //1,000,000,000,000 trillion
    //1,000,000,000,000,000 quadrilliom
        
        // if number = Zero print "0"
        if (n == 0) {
            return "Zero";
        }
        
        // if the number is between 0 and 19 print the value
        if (n < 20) {
            return units[n];
        }

        // if the number is less than 100
        if (n < 100) {
            // display the respective string in the "tens" list
            return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
        }
        
        // if the number is less than 1000
        if (n < 1000) {
            // display the number followed by hundred 
            return units[n / 100] + " Hundred," + ((n % 100 != 0) ? " " : "") + convert(n % 100);
        }
        
        // if the number is less than 100000
        if (n < 100000) {
            // retuns the number divisible by a Thousand as that number followed by a Thousand and the following converted strings
            return convert(n / 1000) + " Thousand," + ((n % 1000 != 0) ? " " : "") + convert(n % 1000);
        }
        
        // if the number is less than 1000000
        if (n < 1000000) {
            // retuns the number divisible by a Hundred Thousand as that number followed by a Hundred Thousand and the following converted strings
            return convert(n / 100000) + " Hundred Thousand," + ((n % 100000 != 0) ? " " : "") + convert(n % 100000);
        }

        // if the number is less than 100000000
        if (n < 100000000L) {
            // retuns the number divisible by a million as that number followed by a million and the following converted strings
            return convert(n / 1000000) + " Million," + ((n % 1000000 != 0) ? " " : "") + convert(n % 1000000);
        }
        
        // if the number is less than 1000000000000
        if (n < 1000000000000L) {
            // retuns the number divisible by a billion as that number followed by a billion and the following converted strings
            return convert(n / (int)100000000000L) + " Billion," + ((n % 100000000000L != 0) ? " " : "") + convert(n % (int)100000000000L);
        }
        
        // if the number is less than 1000000000000000
        if (n < 1000000000000000L) {
            // retuns number 
            return convert(n / (int)1000000000000L) + " Trillion," + ((n % 1000000000000L != 0) ? " " : "") + convert(n % (int)1000000000000L);
        }
        
        // retuns any number over 999,999,999,999,999 as a trillion
        return "Please enter a number from 0 to 999,999,999,999,999";
    }

    public static void main(final String[] args) {
        
        // declare n as an integer
        int n;

        n = 0;
        // prints out the value of n, the equals sign (=)
        // then uses the convert function to display the integer in words
        System.out.println(NumberFormat.getInstance().format(n) + " = '" + convert(n) + "'");

        n = 11;
        // prints out the value of n, the equals sign (=)
        // then uses the convert function to display the integer in words
        System.out.println(NumberFormat.getInstance().format(n) + " = '" + convert(n) + "'");

        n = 1043283;
        // prints out the value of n, the equals sign (=)
        // then uses the convert function to display the integer in words
        System.out.println(NumberFormat.getInstance().format(n) + " = '" + convert(n) + "'");

        n = (int)90376000010012L;
        // prints out the value of n, the equals sign (=)
        // then uses the convert function to display the integer in words
        System.out.println(NumberFormat.getInstance().format(n) + " = '" + convert(n) + "'");
    }
}
