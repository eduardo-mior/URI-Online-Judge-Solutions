main :: IO ()
main = do
    a' <- getLine
    b' <- getLine

    let a = read a' :: Int
    let b = read b' :: Int
    let prod = a * b

    putStrLn $ "PROD = " ++ show prod