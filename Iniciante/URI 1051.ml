let salario = read_float();;
if (salario >= 0.0 && salario <= 2000.0) then (
    Printf.printf "Isento\n";
) else if (salario > 2000.0 && salario <= 3000.0) then (
    Printf.printf "R$ %.2f\n" ((salario -. 2000.0) *. 0.08);
) else if (salario > 3000.0 && salario <= 4500.0) then (
    Printf.printf "R$ %.2f\n" (((salario -. 3000.0)  *. 0.18) +. 80.0);
) else (
    Printf.printf "R$ %.2f\n" (((salario -. 4500.0) *. 0.28) +. 350.0);
)