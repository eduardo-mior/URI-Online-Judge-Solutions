main :: IO ()
main = do
    line <- getLine
    let (inicio:final:_) = map (read :: String -> Int) $ words line

    if inicio >= 0 && final <= 2
        then putStrLn $ "nova"
    else if final > inicio && final <= 96
        then putStrLn $ "crescente"
    else if inicio >= final && final <= 96
        then putStrLn $ "minguante"
    else
        putStrLn $ "cheia"