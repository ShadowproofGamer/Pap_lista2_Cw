import scala.annotation.tailrec

@tailrec
def initSegment[A](xs: List[A], ys: List[A]):Boolean ={
  (xs,ys) match{
    case (h1::t1, h2::t2) if h1==h2 => initSegment(xs.tail, ys.tail)
    case (Nil, _) => true
    case _ => false
  }

}

initSegment(List(1, 3, 5), List(1, 3, 5, 7))
initSegment(List(1, 3, 5), List(1, 2, 5, 7))
initSegment(List(1, 3, 5, 7), List(1, 3, 5, 7))
initSegment(List(), List(1, 3, 5, 7))

