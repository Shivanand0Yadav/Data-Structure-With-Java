// find the max in the array
class ArraysExample{
    
    void maxofArray(){
    int []arr={1,5,8,7,9,5};
    int ans=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>ans){
            ans=arr[i];
        }
    }
    System.out.println(ans);
}
}
public class FindTheMaxInArray{
    public static void main(String[] args){
        ArraysExample obj=new ArraysExample();
        obj.maxofArray();
    }
}