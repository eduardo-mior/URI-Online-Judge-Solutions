<?php
    $line = explode(" ", trim(fgets(STDIN)));
    $x = floatval($line[0]);
    $y = floatval($line[1]);

    if ($x == 0 && $y == 0) {
        echo "Origem\n";
    } else if ($x == 0) {
        echo "Eixo Y\n";
    } else if ($y == 0) {
        echo "Eixo X\n";
    } else if ($y > 0 && $x > 0) {
        echo "Q1\n";
    } else if ($y > 0 && $x < 0) {
        echo "Q2\n";
    } else if ($y < 0 && $x < 0) {
        echo "Q3\n";
    } else if ($y < 0 && $x > 0) {
        echo "Q4\n";
    }
?>