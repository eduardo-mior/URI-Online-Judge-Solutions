let t1, t2, t3, t4 = Scanf.scanf "%i %i %i %i" (fun a b c d -> a, b, c, d);;
let totalTomadas = (t1 + t2 + t3 + t4) - 3;;
Printf.printf "%d\n" (totalTomadas);