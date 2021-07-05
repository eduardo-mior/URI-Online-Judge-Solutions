<?php
    $line = explode(" ", trim(fgets(STDIN)));
    $a = floatval($line[0]);
    $b = floatval($line[1]);

    if ($b % $a != 0 && $a % $b != 0) {
        echo "Nao sao Multiplos\n";
    } else {
        echo "Sao Multiplos\n";
    }
?>