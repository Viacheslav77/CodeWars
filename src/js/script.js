function array_diff(a, b) {
    let result, c = a;
    (a.length === 0 && b.length != 0) ? result = [] : ((b.length === 0 && a.length != 0) ? result = a : "");
    if (result) return result;
    a.length < b.length ? ( a = b, b = c ) : "";   
    b.forEach(element => a = a.filter(item => item != element));
    return a;
}

console.log(array_diff([1,2],[1]));
console.log(array_diff([1,2,2,2,3],[2]));
