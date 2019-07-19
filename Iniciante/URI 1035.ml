let a, b, c, d = Scanf.scanf "%i %i %i %i" (fun a b c d -> a, b, c, d);;

if (b > c && d > a && c > 0 && d > 0 && (c + d) > (a + b) && a mod 2 == 0) then (
    Printf.printf "Valores aceitos\n";
) else ( 
    Printf.printf "Valores nao aceitos\n";
)