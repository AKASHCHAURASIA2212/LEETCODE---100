/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    
    
    public int firstBadVersion(int n) {
        if(n==1)
        {
          return 1;
        }
        int pmid=Integer.MAX_VALUE;
        int li=1;
        int ri=n;
        while(li<=ri)
        {
            int mid = li + (ri-li) / 2 ;          
            boolean bad = isBadVersion(mid);
            
            if(bad==true)
            {
                pmid = mid;
                ri=mid-1;
            }
            else
            {
                li=mid+1;
            }

       }
        return pmid;
    }
}