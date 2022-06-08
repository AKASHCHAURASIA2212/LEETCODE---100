class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     
        int s1 = nums1.length;
        int s2 = nums2.length;
        if(s1!=0 && s2!=0)
        {
        int n11 = nums1[0];
        int n12 = nums1[s1-1];
        int n21 = nums2[0];
        int n22 = nums2[s2-1];
//             double mid1 = (n11+n12)/2;
//             double mid2 = (n21+n22)/2;
            
//             return mid1>mid2?mid1-mid2:mid2-mid1;
        // if(s1%2==0&&s2%2==0)
        // {
        // System.out.println("n12--> "+n12+" n21--> "+n21);      
        //     double mysum = (n12+n21);
        //     return mysum/2;
        // }
            
            
        System.out.println("n11-->"+n11+"\n n12-->"+n12+"\n n21-->"+n21+"\n n22"+n22);   
        int hi = n22<n12?n12:n22;
        int low = n11<n21?n11:n21;
        double sum = hi + low ; 
        // System.out.println("n22-->"+n22+" n12-->"+n12+" temp-->"+temp);
        System.out.println("low-->  "+low+"  hi--> "+hi);
        return sum/2;
          
        }
        
        if(s1==0 && s2>1)
        {
            double sum = (nums2[0]+nums2[s2-1]);
            return sum/2;
        }
        
        if(s2==0 && s1>1)
        {
         double sum = (nums1[0]+nums1[s1-1]);
            return sum/2;
        }
        
        return s1>0?nums1[0]:nums2[0];
        
    }
}