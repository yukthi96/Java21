public class StackQueue {
    // Stack (array-based)
    static class Stack { private int[] data; private int top=-1; Stack(int cap){data=new int[cap];} void push(int x){ if(top+1==data.length) throw new RuntimeException("overflow"); data[++top]=x; } int pop(){ if(isEmpty()) throw new RuntimeException("underflow"); return data[top--]; } boolean isEmpty(){ return top==-1; } int peek(){ if(isEmpty()) throw new RuntimeException("empty"); return data[top]; } }
    // Queue (linked-list)
    static class Queue { static class Node{ int v; Node n; Node(int v){this.v=v;} } private Node h,t; void offer(int v){ Node x=new Node(v); if(t==null){h=t=x;} else {t.n=x; t=x;} } int poll(){ if(h==null) throw new RuntimeException("empty"); int v=h.v; h=h.n; if(h==null) t=null; return v; } boolean isEmpty(){ return h==null; } }
    public static void main(String[] args){ Stack s=new Stack(3); s.push(1); s.push(2); System.out.println(s.peek()); System.out.println(s.pop()); Queue q=new Queue(); q.offer(10); q.offer(20); System.out.println(q.poll()); }
}
