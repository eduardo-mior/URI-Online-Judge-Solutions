<?php

    $line1 = explode(" ", trim(fgets(STDIN)));
    $cod1 = intval($line1[0]);
    $n1 = intval($line1[1]);
    $valor1 = floatval($line1[2]);

    $line2 = explode(" ", trim(fgets(STDIN)));
    $cod2 = intval($line2[0]);
    $n2 = intval($line2[1]);
    $valor2 = floatval($line2[2]);

    $total = ($n1 * $valor1) + ($n2 * $valor2);
    $total = number_format($total, 2, ".", "");
    echo "VALOR A PAGAR: R$ $total\n";
?>