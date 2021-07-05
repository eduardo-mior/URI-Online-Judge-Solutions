<?php
    $line = explode(" ", trim(fgets(STDIN)));
    $H = floatval($line[0]);
    $P = floatval($line[1]);
    $media = $H / $P;
    $media = number_format($media, 2, ".", "");
    echo "$media\n";
?>