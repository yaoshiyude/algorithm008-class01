学习笔记
刷题体会：联表和数组的题，感觉大部分都是相同的，而且解决方法大多数都是双指针
addFirst/addLast练习
public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("a");
        deque.addFirst("b");
        deque.addFirst("c");
        System.out.println(deque);
        String str = deque.peek();
        System.out.println(str);
        System.out.println(deque);

        while (!deque.isEmpty()){
            System.out.println(deque.pop());
        }
        System.out.println(deque);


        deque.addLast("a");
        deque.addLast("b");
        deque.addLast("c");
        System.out.println(deque);
        String str1 = deque.peek();
        System.out.println(str1);
        System.out.println(deque);

        while (!deque.isEmpty()){
            System.out.println(deque.pop());
        }
        System.out.println(deque);
        
    }
    
完全可以用deque来作为栈来使用，添加用addFirst,取数据从队列头取，就可以实现先进后出栈的特性

Java PriorityQueue 源码分析总结：
数据是用 Object数组存储的
添加操作的时间复杂度是O(logn)
peek操作的时间复杂度是O(1)
poll操作的时间复杂度是O(logn)