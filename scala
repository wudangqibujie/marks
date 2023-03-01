——————————————————————————————————————————————————————— 数组 —————————————————————————————————————————————————————————————
数组
val z: Array[String] = new Array[String](3)
val z = new Array[String](3)
索引取值
z(0) = "BMW"
val z0 = z(0)

var z = Array("Runoob", "Baidu", "Google")

遍历
var myarray = Array(1, 2, 3, 4, 5)
for (x <- myarray) println(x)
for (x <- myarray){
	println(x)
}

index遍历
for ( i <- 0 to (myarray.length - 1)) println(myarray(i))

多维数组
var mymatrix = Array.ofDim[Int](3, 3)

合并数组
var myList1 = Array(1.9, 2.9, 3.4, 3.5)
var myList2 = Array(8.9, 7.9, 0.4, 1.5)

import Array._
var myList3 = concat( myList1, myList2 )

区间数组
var mylist1 = range(10, 20, 2)
for ( x <- myList1) println(x)



——————————————————————————————————————————————————————— Map —————————————————————————————————————————————————————————————
var A: Map[Char, Int] = Map()
var colors = Map( "red" -> "bmw", "blue" -> "AMG" )

添加
colors += ("black" -> "AUDI")

返回所有keys和values
colors.keys
colors.values

是否为空
colors.isEmpty


val colors1 = Map("red" -> "#FF0000",
                        "azure" -> "#F0FFFF",
                        "peru" -> "#CD853F")
val colors2 = Map("blue" -> "#0033FF",
                "yellow" -> "#FFFF00",
                "red" -> "#FF0000")


合并 
val colors = colors1 ++ colors2
val colors = colors1. ++ (colors2)


遍历
colors.keys.foreach{ i => println(colors(i))}


判断是否存在
colors.contains("runoob")


——————————————————————————————————————————————————————— 列表 —————————————————————————————————————————————————————————————
列表----不可变，链表结构，元素同构
val list = List("AAA", "BBB", "CCC")
val list = List(
	List(1),
	List(2),
	List(3)
)

val list: List[String] = List("AAA", "BBB", "CCC")
val list: List[Nothing] = List()
val list = Nil
val list = "AAA" :: ("BBB" :: ("CCC" :: Nil))

返回第一个元素
val s = list.head
val s: String = list.head

返回一个列表，包含除了第一元素之外的其他元素
val s = list.tail

list.isEmpty 

拼接列表
val site1 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
val site2 = "Facebook" :: ("Taobao" :: Nil)

val fruit = site1 ::: site2
val fruit = site1.::: (site2)
val fruit = List.concat(site1, site2)

重复元素
val site = List.fill(3)("BMW")

通过函数创建列表
val squ = List.tabulate(6)(n => n * n)
val mul = List.tabulate(4, 5)(_ * _)

翻转列表
val fruit_reverse = fruit.reverse