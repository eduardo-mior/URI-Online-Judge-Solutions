<?php
    $N = trim(fgets(STDIN));
    $resposta = ($N * ($N - 3)) / 2;
    $resposta = number_format($resposta, 0, "", "");
    echo "$resposta\n";
?>