
def exam4_3(index:Int):Int  = 
{
  val temp
  for(i <- 1 to index )
    for(j <-1 to i)
      temp += j
}     

println (exam4_3(4))
