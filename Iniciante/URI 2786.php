<?php
    $L = trim(fgets(STDIN));
    $C = trim(fgets(STDIN));
    $lajes1 = ($L * $C) + (($L - 1) * ($C - 1));
    $lajes2 = (($L - 1) * 2) + (($C - 1) * 2);
    echo "$lajes1\n";
    echo "$lajes2\n";
?>