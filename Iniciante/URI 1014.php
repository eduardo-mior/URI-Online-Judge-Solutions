<?php
    $x = trim(fgets(STDIN));
    $y = trim(fgets(STDIN));
    $media = $x / $y;
    $media = number_format($media, 3, ".", "");
    echo "$media km/l\n";
?>