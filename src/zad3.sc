import scala.annotation.tailrec

def root3(a:Double):Double = {
  @tailrec
  def root3_rec(n:Double, x:Double):Double = {
    if Math.abs(Math.pow(x, 3) - n) <= (10e-15*Math.abs(n)) then x
    else root3_rec(n, x+(a/Math.pow(x, 2)-x)/3)
  }
  if a>1 then root3_rec(a, a/3)
  else root3_rec(a, a)
}

root3(217)