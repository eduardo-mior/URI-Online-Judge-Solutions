main :: IO ()
main = do
    n' <- getLine
    let n = read n' :: Int
    putStrLn $ "1 x " ++ show n ++ " = " ++ show (n * 1)
    putStrLn $ "2 x " ++ show n ++ " = " ++ show (n * 2)
    putStrLn $ "3 x " ++ show n ++ " = " ++ show (n * 3)
    putStrLn $ "4 x " ++ show n ++ " = " ++ show (n * 4)
    putStrLn $ "5 x " ++ show n ++ " = " ++ show (n * 5)
    putStrLn $ "6 x " ++ show n ++ " = " ++ show (n * 6)
    putStrLn $ "7 x " ++ show n ++ " = " ++ show (n * 7)
    putStrLn $ "8 x " ++ show n ++ " = " ++ show (n * 8)
    putStrLn $ "9 x " ++ show n ++ " = " ++ show (n * 9)
    putStrLn $ "10 x " ++ show n ++ " = " ++ show (n * 10)
