//LeetCode 算法507

public class SolutionSelf {
    public boolean checkPerfectNumber(int num){
        int sum = 1;
        if(num == 1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num % i == 0){
                sum += i;
                if(num/i != i){
                    sum += num/i;
                }
            }
        }
        return sum == num;
    }
}
