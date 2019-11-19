function decode(r) {
    let decodeKey = "", arrString = [], decodeMap = new Map(), rezult  = '';

    r.split("").forEach (element => {
        element.codePointAt(0) < 97 ? decodeKey += element : arrString.push(element);
    })
    for (let i = 0; i < 26; i++) decodeMap.set(
        (i * decodeKey % 26)* decodeKey % 26,
        String.fromCodePoint(((i * decodeKey) % 26) + 97));
    
    if(decodeMap.size != 26) return 'Impossible to decode';

    arrString.forEach(element => {
        rezult += decodeMap.get(element.codePointAt(0) - 97);
    });
    return rezult;

}
console.log(decode("6015ekx"));
console.log(decode("5057aan"));
