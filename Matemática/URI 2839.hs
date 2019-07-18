main :: IO ()
main = do
    meias' <- getLine
    let meias = read meias' :: Int
    putStrLn $ show (meias + 1)