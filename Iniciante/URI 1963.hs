import Text.Printf

main = do
    line <- getLine

    let (a:b:_) = map (read :: String -> Double) $ words line
    let aumento = (b * 100.0 / a) - 100.0

    putStrLn $ printf "%.2f%%" aumento