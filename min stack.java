class MinStack {

    /** initialize your data structure here. */
    ArrayList<Integer> no=new ArrayList<>();
    public MinStack() {
        
    }
    
    public void push(int x) {
        no.add(x);
    }
    
    public void pop() {
        no.remove(no.size()-1);
    }
    
    public int top() {
        return no.get(no.size()-1);
    }
    
    public int getMin() {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<no.size()-1;i++){
            if(no.get(i)<=min){
                min=no.get(i);
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
