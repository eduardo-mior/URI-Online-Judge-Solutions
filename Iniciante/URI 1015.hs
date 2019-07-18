import Text.Printf

main = do
    line1 <- getLine
    line2 <- getLine

    let (x1:y1:_) = map (read :: String -> Double) $ words line1
    let (x2:y2:_) = map (read :: String -> Double) $ words line2
    let distancia = sqrt(((x2 - x1) ** 2.0) + ((y2 - y1) ** 2.0))

    putStrLn $ printf "%.4f" distancia