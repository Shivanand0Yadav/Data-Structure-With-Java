// calculate the sum of all the elements in the given array
class ArraysExample{
    
    void sumofArray(){
    int []arr={1,5,8,7,9,5};
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
    }
    System.out.println(sum);
}
}
public class SumOfAllElementinGivenArray{
    public static void main(String[] args){
        ArraysExample obj=new ArraysExample();
        obj.sumofArray();
    }
}