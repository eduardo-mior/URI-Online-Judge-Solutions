let a, b, c = Scanf.scanf "%f %f %f" (fun a b c -> a, b, c);;

let triangulo = a *. c /. 2.0;;
let circulo = 3.14159 *. (c *. c);;
let trapezio = ((a +. b) *. c) /. 2.0;;
let quadrado = b *. b;;
let retangulo = a *. b;;

Printf.printf "TRIANGULO: %.3f\n" (triangulo);
Printf.printf "CIRCULO: %.3f\n" (circulo);
Printf.printf "TRAPEZIO: %.3f\n" (trapezio);
Printf.printf "QUADRADO: %.3f\n" (quadrado);
Printf.printf "RETANGULO: %.3f\n" (retangulo);