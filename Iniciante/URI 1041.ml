let x, y = Scanf.scanf "%f %f" (fun a b -> a, b);;

if (x = 0.0 && y = 0.0) then (
    Printf.printf "Origem\n";
) else if (x = 0.0) then (
    Printf.printf "Eixo Y\n";
) else if (y = 0.0) then (
    Printf.printf "Eixo X\n";
) else if (y > 0.0 && x > 0.0) then (
    Printf.printf "Q1\n";
) else if (y > 0.0 && x < 0.0) then (
    Printf.printf "Q2\n";
) else if (y < 0.0 && x < 0.0) then (
    Printf.printf "Q3\n";
) else if (y < 0.0 && x > 0.0) then (
    Printf.printf "Q4\n";
)