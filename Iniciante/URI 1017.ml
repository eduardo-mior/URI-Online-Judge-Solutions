let tempo = read_float();;
let velocidade = read_float();;
let kilometros = tempo *. velocidade;;
let media = kilometros /. 12.0;;
Printf.printf "%.3f\n" (media);