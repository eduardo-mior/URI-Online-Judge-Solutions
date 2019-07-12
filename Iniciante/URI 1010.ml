let cod1, n1, valor1, cod2, n2, valor2 = Scanf.scanf "%i %f %f\n%i %f %f" (fun a b c d e f -> a, b, c, d, e, f);;
let total = (n1 *. valor1) +. (n2 *. valor2);;
Printf.printf "VALOR A PAGAR: R$ %.2f\n" (total);