
//short solution
game = n => n * n % 2 == 0 ? [n * n / 2 ] : [n * n, 2];

//solution through the sum of fractions
function gameToo(n) {

    if (n <= 0) return [0];
    if (n === 1) return [1, 2];
    else {
        const chessboard = [];

        for (let i = 0; i < n; i++) chessboard[i] = row(n, i);

        let [numeratorAll, denominatorAll] = getRowSum(chessboard[0], n); //The sum of the first row

        for (let i = 1; i < n; i++) {
            [numeratorRow, denominatorRow] = getRowSum(chessboard[i], n); //The sum of the next row
            [numeratorAll, denominatorAll] = addFraction(numeratorAll, denominatorAll, numeratorRow, denominatorRow);
        }

        if (denominatorAll === 1) return [numeratorAll];
        else return [numeratorAll, denominatorAll];
    }
}

function row(n, i) {
    const chessboardRow = []
    ++i;
    for (let j = 0; j < n; j++ , i++) chessboardRow[j] = i + 1;

    return chessboardRow;
}

function getRowSum(chessboardRow, n) {
    let [numeratorSumRow, denominatorSumRow] = addFraction(1, chessboardRow[0], 2, chessboardRow[1]);
    for (let j = 2; j < n; j++) {
        [numeratorSumRow, denominatorSumRow] = addFraction(numeratorSumRow, denominatorSumRow, j + 1, chessboardRow[j]);
    }
    return [numeratorSumRow, denominatorSumRow];
}

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

console.log(game(8));
console.log(gameToo(8));
console.log(game(5));
console.log(gameToo(5));
