package com.Sanket.Recursion;

    /*package whatever //do not write package name here */

  public  class RemoveduplicatesfromString{

        public static void main(String[] args)
        {
            String S1 = "geeksforgeeks";
            System.out.println(removeConsecutiveDuplicates(S1));

            String S2 = "Saaaaaaaaaaaaaaaaaaaanket";
            System.out.println(removeConsecutiveDuplicates(S2));
        }
      public static String removeConsecutiveDuplicates(String input) {
          if(input.length() <= 1){
              return input;
          }

          if(input.charAt(0) == input.charAt(1)){
              return removeConsecutiveDuplicates(input.substring(1));
          }

          return input.charAt(0) +  removeConsecutiveDuplicates(input.substring(1));
      }
    }


