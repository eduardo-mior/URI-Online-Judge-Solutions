<?php
    $a = trim(fgets(STDIN));
    $b = trim(fgets(STDIN));
    $media = ((3.5 * $a) + (7.5 * $b)) / 11;
    $media = number_format($media, 5, ".", "");
    echo "MEDIA = $media\n";
?>