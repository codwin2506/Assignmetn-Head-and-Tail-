package edu.knoldus.com
import scala.annotation.tailrec

class Sorting {
  @tailrec
  final def insert( element: Int,UnsortedList: List[Int], accumulator: List[Int] = Nil): List[Int] =
    if (UnsortedList.nonEmpty) {
      val y::remList = UnsortedList
      if (element <= y) accumulator.reverse ::: element :: y :: remList
      else insert(element,remList,  y :: accumulator)
    }
    else (element :: accumulator).reverse

  def isort(list: List[Int]): List[Int] =
    if (list.isEmpty) Nil
    else insert(list.head, isort(list.tail))
}
object main extends App{
  val list1: List[Int] = List(3, 4, 5, 3, 2, 1)
  val list2: List[Int] = List(10, 40, 12, 2, 22, 9)
  val unsortList=new Sorting
  println(unsortList.isort(list1))
  println(unsortList.isort(list2))
}
