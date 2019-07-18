import Text.Printf

main = do
    line <- getLine

    let (n:l:_) = map (read :: String -> Double) $ words line
    let p = n * l :: Double

    putStrLn $ printf "%.0f" p