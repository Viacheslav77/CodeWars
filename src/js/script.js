//the sum of fractions
function addFraction(numerator1, denominator1, numerator2, denominator2) {

    let denominator3 = (denominator1 * denominator2) / gcd(denominator1, denominator2);
    let numerator3 = (numerator1 * (denominator3 / denominator1)) + (numerator2 * (denominator3 / denominator2));
    let ratio = gcd(numerator3, denominator3);

    denominator3 = denominator3 / ratio;
    numerator3 = numerator3 / ratio;

    return [numerator3, denominator3];
}

function gcd(a, b) {
    if (a === 0) {
        return b;
    }
    return gcd(b % a, a);
}

console.log(addFraction(1,2,2,3));
console.log(addFraction(2,2,3,4));
console.log(addFraction(2,33,44,66));
console.log(addFraction(33,44,54,65));
