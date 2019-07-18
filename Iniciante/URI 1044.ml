let a, b = Scanf.scanf "%i %i" (fun x y -> x, y);;

if (a mod b == 0 || b mod a == 0) then (
    Printf.printf "Sao Multiplos\n";
) else ( 
    Printf.printf "Nao sao Multiplos\n";
)