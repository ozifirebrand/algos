function comparatorValue(a, b, d) {
    // Write your code here
    a.sort()
    b.sort()
    let counter = 0
    for ( let index = 0 ; index < a.length; index++){
        let small = b[0]
        let largest = b[b.length - 1]
        let sDifference = Math.abs(small - a[index])
        let lDifference = Math.abs(largest - a[index])
        if (sDifference > d && lDifference > d)counter ++
    }
    return counter

}
b = [ 13, 1, 4 ]
a = [ 7, 5, 9]
console.log("Number of unique comparator values is: ", comparatorValue(a, b, 2))

function restock(itemCount, target) {
    // Write your code here
    let  sum = 0;
    for(let x = 0; x< itemCount.length; x++){
        if( sum === target){
            break;
        }
        else if(sum < target){
            sum += itemCount[x];
        }
        else {
            return sum;
        }
    }
    if (sum > target){
        return Math.abs(sum - target);
    }
    else if( sum < target){
        return Math.abs(target - sum);
    }

}