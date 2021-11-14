public class Operation {
    public int oper(int[] q, String w) {
        int result = 0;
        switch (w){
            case "+":
                result = q[0]+q[1];
                break;
            case "-":
                result = q[0]-q[1];
                break;
            case "*":
                result = q[0]*q[1];
                break;
            case "/":
                result = q[0]/q[1];
                break;

        }
        return result;
    }
}
