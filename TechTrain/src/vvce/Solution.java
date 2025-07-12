package vvce;

/*biker is going on a drive, array represent how must he travels, sea level = 0 
sample array = 3,-2,5,7 pos = up, neg = down start 0 Find the highest altitude he meets in his travels
-1, -2,-3*/

public class Solution{
    public static void main(String[] args){

        Question q1=new Question();
        int[] arr = q1.getDays();
        System.out.println(solution(arr));
    }
    public static int solution(int[] arr){
        int cur = 0, max = 0;
        for (int i=0; i< arr.length; i++){
                cur = cur + arr[i];
                max = cur>max?cur:max;
        }
        return max;
    }
}

class Question{

    public Question(){}
    private static int[] days={6,3,-4,2,-7};
    public static int[] getDays(){
        return days;
    }
}
