class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        //if the target value is greater than equal to last element then we need to return first letter.
        if(target>=letters[letters.length-1]){
            return letters[0];
        }
        //letters array is in ascending order.
        //we can use binary search algorithm as it is in sort
        int start =0;
        int end=letters.length-1;
        while(start<=end){
            int mid= start+(end-start)/2; 
            /*it might be possible if we use start+end/2 may be more than the integer max value.so we are using the above formula.*/
            if(target<letters[mid]){
                end=mid-1;
            }
            else if(target>=letters[mid]){
                start=mid+1;
            }
           /* else {
                return letters[mid];
            }
            this else block is not required as we need to return only the greater value not the   equal value even if it present in array
            */
        }
        /* while loop breaks when start greater than end, at the end start=end+1, where we can get our ceiling value i.e; the smallest character in letters that is lexicographically greater than target */
        return letters[start];
    }
}