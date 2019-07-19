let e, d = Scanf.scanf "%i %i" (fun a b -> a, b);;
if (e > d) then (
    Printf.printf "Eu odeio a professora!\n";
) else if ((d - e) >= 3) then (
    Printf.printf "Muito bem! Apresenta antes do Natal!\n";
) else if ((e + 2) < 24) then (
    Printf.printf "Parece o trabalho do meu filho!\nTCC Apresentado!\n";
) else (
    Printf.printf "Parece o trabalho do meu filho!\nFail! Entao eh nataaaaal!\n";
)