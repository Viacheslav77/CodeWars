function solution(str) {

    let lenghtOfStr = str.length;
    let isItaPair = lenghtOfStr - Math.trunc(lenghtOfStr / 2) * 2;

    if (!(isItaPair === 0)) str += "_";

    let splitStr = [];
    for (let i = 0; i < lenghtOfStr; i += 2)  splitStr.push(str[i] + str[i + 1])

    return splitStr;
}

console.log(solution('abcdef'));
console.log(solution('й'));
console.log(solution(''));