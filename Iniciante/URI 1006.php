<?php
    $a = trim(fgets(STDIN));
    $b = trim(fgets(STDIN));
    $c = trim(fgets(STDIN));
    $media = (($a * 2) + ($b * 3) + ($c * 5)) / 10;
    $media = number_format($media, 1, ".", "");
    echo "MEDIA = $media\n";
?>