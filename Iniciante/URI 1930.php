<?php
    $line = explode(" ", trim(fgets(STDIN)));
    $T1 = intval($line[0]);
    $T2 = intval($line[1]);
    $T3 = intval($line[2]);
    $T4 = intval($line[3]);
    $totalTomadas = ($T1 + $T2 + $T3 + $T4) - 3;
    echo "$totalTomadas\n";
?>