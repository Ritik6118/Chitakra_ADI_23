package PriorityQueue;

public class Find_Median_From_Stream_Of_Data {

}
class MedianFinder {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;
    public MedianFinder() {
        this.left=new PriorityQueue<>(Collections.reverseOrder());
        this.right=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(left.size()==0||left.peek()>=num){
            left.add(num);
        }
        else{
            right.add(num);
        }

        if(left.size()>right.size()+1){
            right.add(left.poll());
        }
        else if(left.size()<right.size()){
            left.add(right.poll());
        }
    }
    
    public double findMedian() {
        if(left.size()==right.size()){
            double d = (left.peek()+right.peek())*1.0/2;
            return d;
        }
        return left.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
