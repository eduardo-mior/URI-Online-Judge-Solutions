main = do
    line <- getLine

    let (t1:t2:t3:t4:_) = map (read :: String -> Int) $ words line
    let totalTomadas = (t1 + t2 + t3 + t4) - 3 :: Int

    putStrLn $ show totalTomadas