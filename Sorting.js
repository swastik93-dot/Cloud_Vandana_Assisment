// /B. Perform sorting of an array in descending order.

let numbers = [5, 2, 8, 1, 6];

for(let i =0 ;i<numbers.length;i++)
{
    for(let j = 0;j<numbers.length-1;j++)
    {
        if(numbers[j]<numbers[j+1])
        {
            let temp = numbers[j];
            numbers[j]  = numbers[j+1];
            numbers[j+1] = temp;
        }
    }
}

console.log(numbers);