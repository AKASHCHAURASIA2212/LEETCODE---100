/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    
    public int myBS(int st ,int end){
        while(true){
        int mid = (st+end)/2;
            
            int val = guess(mid);
            
            if(val==0){
                return mid;
            }else if(val==1){
                st=mid+1;
            }else{
              end=mid-1;
            }
        }
        
    }
    public int guessNumber(int n) {
       // return myBS(1,n);

        long start=1, end=n, mid;
        while( start<=end){
            
            mid= (start+end)/2;

            if( guess((int)mid)==0) return (int)mid;
            else if( guess((int)mid)==1) start=mid+1;
            else end=mid-1; 
        }

        return -1;
        
    }
}