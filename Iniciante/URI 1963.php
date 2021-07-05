<?php
    $line = explode(" ", trim(fgets(STDIN)));
    $A = floatval($line[0]);
    $B = floatval($line[1]);
    $aumento = ($B * 100.0 / $A) - 100.0;
    $aumento = number_format($aumento, 2, ".", "");
    echo "$aumento%\n";
?>