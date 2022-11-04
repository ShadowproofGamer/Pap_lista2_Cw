def replaceNth[A](xs: List[A], n: Int, x: A): List[A] = {
  if n>=xs.length then throw Error(s"wrong index")
  def replaceNth_rec(list: List[A], pos: Int, change: A, index: Int, remaining:List[A]): List[A]= {
    index match {
      case index if index==pos => remaining.reverse:::(change::list.tail)
      case _ => replaceNth_rec(list.tail, pos, change, index+1, list.head::remaining)
    }
  }
  replaceNth_rec(xs, n, x, 0, List())
}

replaceNth(List('o','l','a', 'm', 'a', 'k', 'o', 't', 'a'), 1, 's')

//complexity: O(2n)

//TODO złożoność obliczeniowa i reprezentacja list