let hInicial, hFinal = Scanf.scanf "%i %i" (fun a b -> a, b);;
if (hInicial > hFinal) then (
    Printf.printf "O JOGO DUROU %d HORA(S)\n" (24 - (hInicial - hFinal));
) else if (hFinal > hInicial) then (
    Printf.printf "O JOGO DUROU %d HORA(S)\n" (hFinal - hInicial);
) else (
    Printf.printf "O JOGO DUROU 24 HORA(S)\n";
)