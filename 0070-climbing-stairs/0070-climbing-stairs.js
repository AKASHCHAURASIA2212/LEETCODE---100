/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    let arr = []
    arr.push(1);
    arr.push(1);
    
    for(let i=2;i<=n;i++){
        arr.push(arr[i-1]+arr[i-2]);
    }
    
    return arr[n];
};