main :: IO ()
main = do
    line <- getLine
    let (x:y:_) = map (read :: String -> Double) $ words line
    if x == 0 && y == 0 
        then putStrLn $ "Origem"
    else if x == 0 
        then putStrLn $ "Eixo Y"
    else if y == 0 
        then putStrLn $ "Eixo X"
    else if y > 0 && x > 0 
        then putStrLn $ "Q1"
    else if y > 0 && x < 0 
        then putStrLn $ "Q2"
    else if y < 0 && x < 0 
        then putStrLn $ "Q3"
    else if y < 0 && x > 0 
        then putStrLn $ "Q4"
    else
        return ()