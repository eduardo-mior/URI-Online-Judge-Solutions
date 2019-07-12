main :: IO ()
main = do
    a' <- getLine
    b' <- getLine
    c' <- getLine
    d' <- getLine
    let a = read a' :: Int
    let b = read b' :: Int
    let c = read c' :: Int
    let d = read d' :: Int
    let diferenca = a * b - c * d
    putStrLn $ "DIFERENCA = " ++ show diferenca