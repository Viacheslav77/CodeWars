function amidakuji(ar) {
    const result = [];
    for (let inputData = 0; inputData <= ar[0].length; inputData++) {
        let counter = inputData;
        for (let i = 0; i < ar.length; i++) {
            const element = ar[i];
            if (counter === 0) {
                if (element[counter] == 1) counter++;
            } else (element[counter - 1] == 1) ? counter-- : (element[counter] == 1) ? counter++ : counter;
        }
        result[counter] = inputData;
    }
    return (result);
}

let ladder = [
    '001001',
    '010000',
    '100100',
    '001000',
    '100101',
    '010010',
    '101001',
    '010100'
];

amidakuji(ladder); // [4, 2, 0, 5, 3, 6, 1]