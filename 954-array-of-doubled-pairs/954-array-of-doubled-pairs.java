class Solution {
/*      After sorting the array, we can be sure that the ith element, if present in hashmap,
        could only have a arr[i] * 2 element present incase of positive integers 
        and arr[i]/2 incase of negative integers. If it isn't present, then we return false
        
        Try thinking about the following TC:
        [-4,-2,0,0,1,2,2,4]
        */
    
    public boolean canReorderDoubled(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i,0) +1);
        }
        Arrays.sort(arr);
        for(int i: arr){
            if(map.containsKey(i) == false){
                continue;
            }
            int temp = i*2;
            if(i < 0){
                if((i & 1)== 1){
                    return false;
                }
                temp = i/2;
            }
            if(map.containsKey(temp) == false || map.get(temp) < map.get(i)){
                return false;
            }
            /* Incase map.get(temp) > map.get(i), this means that 
            eventually we would have to check for
            map.get(temp) - map.get(i) number of temp * 2(temp/2, incase of negative)       
            elements atleast */
            
            map.put(temp,map.get(temp) - map.get(i));
            map.remove(i);
            if(temp != 0 && map.get(temp) == 0){
                map.remove(temp);
            }
            
        }
        return true;
    }
}