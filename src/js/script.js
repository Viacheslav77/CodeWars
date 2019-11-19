function findUniq(arr) {
    let uniqueNumber1 = arr[0], uniqueNumber2;
    arr[0] === arr[1]  ? (uniqueNumber1 = arr[0]) : (
        arr[0] === arr[2]  ? (uniqueNumber1 = arr[0]) : (uniqueNumber1 = arr[1])) ;
    arr.forEach(element => uniqueNumber1 != element ? uniqueNumber2 = element : "" );
    return uniqueNumber2;
  }

console.log(findUniq([ 1, 1, 1, 2, 1, 1 ]));
console.log(findUniq([ 0, 0, 0.55, 0, 0 ]));
