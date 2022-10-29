import scala.annotation.tailrec

def fib(n:Int):BigInt = {
  n match {
    case 0 => 0
    case 1 => 1
    case n if n>1 => fib(n-1)+fib(n-2)
    case _ => throw Error(s"Illegal argument (n<0)")
  }
}



def fibTail(n:Int):BigInt = {
  @tailrec
  def fibTail_rec(i:BigInt, j:BigInt, x:Int):BigInt = {
    if x==0 then j+i;
    else fibTail_rec(j, i+j, x-1)
  }
  fibTail_rec(0,1,n-2)
}
fib(46);
fibTail(46)
