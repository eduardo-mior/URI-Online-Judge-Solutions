<?php
    $N = trim(fgets(STDIN));
    $resposta = (pow($N, 4.0) - (6.0 * pow($N, 3.0)) + (23.0 * pow($N, 2.0)) - (18.0 * $N) + 24.0 ) / 24.0;
    $resposta = number_format($resposta, 0, "", "");
    echo "$resposta\n";
?>