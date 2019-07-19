main = do
    line <- getLine
    let (a:b:c:d:_) = map (read :: String -> Int) $ words line
    if b > c && d > a && c > 0 && d > 0 && (c + d) > (a + b) && a `mod` 2 == 0
        then putStrLn $ "Valores aceitos"
    else
        putStrLn $ "Valores nao aceitos"