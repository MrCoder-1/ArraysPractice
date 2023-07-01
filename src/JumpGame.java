public class JumpGame {

    public  int NoOfJumps(int [] array){
        int a = array[0];
        int b = array[0];
        int jumps = 1;

        for(int i = 0; i < array.length;i++){
            if(i == array.length-1){
                return jumps;
            }

            if(array[i] > b){
                b = array[i];
            }

            if(a == 0){
                jumps++;
                a = b;
            }
        }
        return jumps;
    }

    public static void main(String[] args){
        System.out.println("Hello World");
        int nums[] = new int[]{1,3,5,8,9,2,6,7,6,8,9};
    }
}
