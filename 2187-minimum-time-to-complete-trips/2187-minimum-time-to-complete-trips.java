class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long lowestTime = 1;
        long maxTime = 100000000000000L;
        while(lowestTime < maxTime){
            long mid = lowestTime + (maxTime-lowestTime)/2;
            long tripsDone = tripsCompleted(time, mid, totalTrips);
            if(tripsDone >= totalTrips){
                maxTime = mid;
            }
            else{
                lowestTime = mid+1;
            }
        }
        return lowestTime;
    }

    private long tripsCompleted(int[] time, long currentTime, int totalTrips){
        long tripsDone = 0;
        for(int t : time){
            long tmp = (long) t;
            tripsDone += (currentTime/tmp);
            // instead of iterating the loop any further, break the loop.
            if(tripsDone >= totalTrips ){
                break;
            }
        }
        return tripsDone;
    }
}