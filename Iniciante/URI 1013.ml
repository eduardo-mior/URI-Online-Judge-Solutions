let valor1, valor2, valor3 = Scanf.scanf "%i %i %i" (fun a b c -> a, b, c);;

if (valor1 > valor2 && valor1 > valor3) then (
    Printf.printf "%d eh o maior\n" (valor1);
) else if (valor2 > valor3) then (
    Printf.printf "%d eh o maior\n" (valor2);
) else (
    Printf.printf "%d eh o maior\n" (valor3);
)