import Text.Printf

main = do
    line <- getLine

    let (h:p:_) = map (read :: String -> Double) $ words line
    let media = h / p

    putStrLn $ printf "%.2f" media