let valor = read_float();;
if (valor >= 0.0 && valor <= 25.0) then (
    Printf.printf "Intervalo [0,25]\n";
) else if (valor > 25.0 && valor <= 50.0) then (
    Printf.printf "Intervalo (25,50]\n";
) else if (valor > 50.0 && valor <= 75.0) then (
    Printf.printf "Intervalo (50,75]\n";
) else if (valor > 75.0 && valor <= 100.0) then (
    Printf.printf "Intervalo (75,100]\n";
) else (
    Printf.printf "Fora de intervalo\n";
)