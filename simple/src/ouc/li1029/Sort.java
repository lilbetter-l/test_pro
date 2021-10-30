package ouc.li1029;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {24,69,80,57,13};
        System.out.println("排序前:"+arrayToString(arr));
        for (int x = 0;x<arr.length-1;x++){
            for (int i = 0;i<arr.length-1-x;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]= temp;
                }
            }

        }
        System.out.println("排序后："+arrayToString(arr));

    }
    public static String arrayToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0;i<arr.length;i++){
            if (i==arr.length -1 ){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(",");

            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}
