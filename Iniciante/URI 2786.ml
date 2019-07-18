let l = read_int();;
let c = read_int();;
let lajes1 = (l * c) + ((l - 1) * (c - 1));;
let lajes2 = ((l - 1) * 2) + ((c - 1) * 2);;
Printf.printf "%d\n" (lajes1);
Printf.printf "%d\n" (lajes2);