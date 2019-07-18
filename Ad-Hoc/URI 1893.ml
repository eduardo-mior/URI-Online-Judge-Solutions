let inicio, final = Scanf.scanf "%i %i" (fun a b -> a, b);;

if (inicio >= 0 && final <= 2) then (
    Printf.printf "nova\n";
) else if (final > inicio && final <= 96) then (
    Printf.printf "crescente\n";
) else if (inicio >= final && final <= 96) then (
    Printf.printf "minguante\n";
) else ( 
    Printf.printf "cheia\n";
)