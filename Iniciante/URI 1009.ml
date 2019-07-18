let nome = read_line();;
let salarioFixo = read_float();;
let vendas = read_float();;
let total = ((vendas *. 15.0) /. 100.0) +. salarioFixo;;
Printf.printf "TOTAL = R$ %.2f\n" (total);