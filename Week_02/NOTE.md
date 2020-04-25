学习笔记

HashMap java8
- Java8 HashMap采用Node<K,V>数组+链表/红黑树的形式存储
- 当链表中的结构数量大于等于8-1=7个则将链表转为红黑树，当结构数量小于6个的时候将红黑树转为链表
- HashMap采用懒加载，就是只要你不去put值拿Node<K,V> []table = null,当第一次put值的时候初始化大小为16

