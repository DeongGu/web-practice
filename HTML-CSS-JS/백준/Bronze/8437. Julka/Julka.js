const fs = require("fs");
const input = fs
  .readFileSync("/dev/stdin")
  .toString()
  .trim()
  .split("\n")
  .map(BigInt);

console.log(`${(input[0] + input[1]) / 2n}
${(input[0] - input[1]) / 2n}`);
