<?php
    $nome = trim(fgets(STDIN));
    $salarioFixo = trim(fgets(STDIN));
    $vendas = trim(fgets(STDIN));
    $total = (($vendas * 15) / 100) + $salarioFixo;
    $total = number_format($total, 2, ".", "");
    echo "TOTAL = R$ $total\n";
?>