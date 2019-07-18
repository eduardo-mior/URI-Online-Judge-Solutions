let x1, y1, x2, y2 = Scanf.scanf "%f %f\n%f %f" (fun a b c d -> a, b, c, d);;
let distancia = sqrt(((x2 -. x1) ** 2.0) +. ((y2 -. y1) ** 2.0));;
Printf.printf "%.4f\n" (distancia);