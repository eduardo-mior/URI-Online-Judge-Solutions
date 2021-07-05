<?php
    $km = trim(fgets(STDIN));
    $minutos = (60 * $km) / 30;
    $minutos = number_format($minutos, 0, ".", "");
    echo "$minutos minutos\n";
?>