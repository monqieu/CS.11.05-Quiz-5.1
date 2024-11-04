public class Main {

    /**
     * Given two arrays of integers, write a method called combine that combines the two arrays into one larger array.
     * The method combine will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10,12,14,16};
     * zip(myArray1, myArray2) → {1,3,5,7,9,2,4,6,8,10,12,14,16}
     */

    //since we are writing a METHOD that combines two given arrays, the two arrays to be combined should be the two parameters of the method
    public static int[] combine(int[] array1, int[] array2){
        int[] combinedArray =  new int[array1.length + array2.length];  //we need to know the total length of the new array when combining it

        //adding the elements from array1 to combinedArray first, according to instructions
        for(int i = 0; i < array1.length; i++){
            combinedArray[i] = array1[i];
        }

        //adding elements from array2 to combinedArray after the values of array1
        for(int i = 0; i < array2.length; i++){
            combinedArray[array1.length + i] = array2[i];
        }
        return combinedArray;
    }



    /**
     * Given two arrays of integers of equal length, write a method called zip that zips together all elements in each array into one larger array.
     * The method zip will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10};
     * zip(myArray1, myArray2) → {1,2,3,4,5,6,7,8,9,10}
     */

    public static int[] zip(int[] array1, int[] array2){
        //instantiating zippedArray, with its number elements combining that of array1 and array2
        int[] zippedArray = new int[array1.length + array2.length];
        //creating variable length for limiting range of loops
        int length = array1.length + array2.length;

        for(int i = 0; i<length; i++){
            zippedArray[i*2 + 1] = array1[i];
            // since this for loop assigns elements from array1 to zippedArray, elements are odd numbers
            //similar to arithmetic sequences, index is calculated as i*2+1, places elements from array1 at odd indices (1,3,5...)
        }

        for(int i = 0; i<length; i++){
            zippedArray[i*2] = array2[i];
            //array 2 is even numbers, so index calculated as i*2 places elements at even indices (2, 4, 6..)
        }
        return zippedArray;
    }



    /**
     * Given two arrays of integers of equal length, write a method called product that multiplies each element in the first array by the element at the corresponding index in the second array.
     * The method product will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10};=
     * product(myArray1, myArray2) → {2,12,30,56,90}
     */
    public static int[] product(int[] array1, int[] array2) {
        int[] product = new int[array1.length];
        for(int i = 0; i < array1.length; i++){
            product[i] = array1[i] * array2[i];
        }
        return product;
    }

    /**
     * Given an array of Strings, write a method called capitalCount that calculates the number of capital letters in each String and stores them into an array.
     * The method capitalCount will return a new one dimensional array of integers.
     * There is a catch - you are required to implement *two* methods in order to solve this problem.
     * One of these methods (countCapitalLetters) will be a helper method and will perform the task of counting and returning how many capital letters are in a single word.
     * In other words, the method capitalCount will call (or use) the method countCapitalLetters in order to achieve the desired output.
     * Hint: You can use the statement Character.isAlphabetic( … ) to determine whether a character is an alphabetic character.
     *
     * Method: capitalCount
     * Helper method: countCapitalLetters
     *
     * Hint: 'A' = 65 and 'Z' = 90
     *
     * String[] words = {“Christmas”, “IS”, “comInG”, “!”};
     * capitalCount(words) → {1, 2, 2, 0}
     */

    public static int[] capitalCount(String[] words) {
        //create integer array with same length as words array
        int[] result = new int[words.length];

        //loop through each word in the words array
        for(int i = 0; i < words.length; i++){
            result[i] = countCapitalLetters(words[i]);
            //for each word in the words array, call helper method and store the resulting value in the corresponding position in the result array
        }
        return result;

    }

    public static int countCapitalLetters(String word) {
        //count variable is initialized to count capital letters later on
        int count = 0;

        //loop through each CHARACTER in each word
        for( int i = 0; i < word.length(); i++){
            //obtaining the current character and storing it in char variable c
            char c = word.charAt(i);
            //condition: if the current character is alphabetic AND it is upper case, then count c will increase by 1
            if(Character.isAlphabetic(c) && Character.isUpperCase(c)){
                count ++;
            }
        }

        //returning total count of capital letters found
        return count;

    }

}
