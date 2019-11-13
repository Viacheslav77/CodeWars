
function cubeChange(A) {

    let rezult = 0;

    let tmp = [A[0]];

    for (let i = 1; i < A.length; i++) {

        if (tmp[i - 1] === (7 - A[i])) {
            A[i] = tmp[i - 1];
            rezult += 2
        }

        if (tmp[i - 1] != A[i]) {
            A[i] = tmp[i - 1];
            rezult++
        }
    }
    return rezult;

}



function solution(A) {     
    let rezult1 = cubeChange(A);
    let rezult2 = cubeChange(A.reverse());

    if (rezult1 < rezult2) return rezult1;
    if (rezult2 < rezult1) return rezult2;
    
}




