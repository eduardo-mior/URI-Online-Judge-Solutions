<?php
    $line = explode(" ", trim(fgets(STDIN)));
    $N = floatval($line[0]);
    $L = floatval($line[1]);
    $P = $N * $L;
    echo "$P\n";
?>