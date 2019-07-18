let a, b = Scanf.scanf "%f %f" (fun x y -> x, y);;
let aumento = (b *. 100.0 /. a) -. 100.0;;
Printf.printf "%.2f%%\n" (aumento);