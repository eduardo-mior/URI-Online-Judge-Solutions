main :: IO ()
main = do
    a' <- getLine
    b' <- getLine
    let a = read a' :: Int
    let b = read b' :: Int
    let x = a + b :: Int
    putStrLn $ "X = " ++ show x