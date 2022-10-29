def match0A[A](list:List[A]):A = {
  val List(_,_,x,_,_) = list
  x
}

def match0B[A](list:List[(A,A)]):A = {
  val List(_, (x, _)) = list
  x
}


match0A(List(-2, -1, 0, 1, 2))
match0B(List((1, 2), (0, 1)))
