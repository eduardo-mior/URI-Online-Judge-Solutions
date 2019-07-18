main :: IO ()
main = do
    line <- getLine
    let (a:b:_) = map (read :: String -> Int) $ words line

    if a `mod` b == 0 || b `mod` a == 0
        then putStrLn $ "Sao Multiplos"
    else
        putStrLn $ "Nao sao Multiplos"