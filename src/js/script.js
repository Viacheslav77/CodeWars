function convertFrac(lst) {
    if (lst.length === 0 || !(typeof lst === "object")  ) return '';

    let result = '';
    let denominatorAll = (lst[0][1] * lst[1][1]) / gcd(lst[0][1], lst[1][1]);
    for (let i = 1; i < lst.length; i++) {
        let denominatorNext = (denominatorAll * lst[i][1]) / gcd(denominatorAll, lst[i][1]);
        denominatorAll = denominatorNext > denominatorAll ? denominatorNext : denominatorAll;
    }
    for (let i = 0; i < lst.length; i++)
        result += `(${lst[i][0] * denominatorAll / lst[i][1]},${denominatorAll})`;
    return result;
}

function gcd(a, b) {
    if (a === 0) return b;
    return gcd(b % a, a);
}


let lst = [[1, 2], [1, 3], [1, 4]]
console.log(convertFrac(lst)); //"(6,12)(4,12)(3,12)"

console.log(convertFrac("33")); //"(6,12)(4,12)(3,12)"