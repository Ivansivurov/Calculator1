public class Controller {
    public String [] controller(String oper) throws ScannerException1 {

        int count = 0;
        String x = "";
        int[] z = new int[oper.length()];
        for (int i = 0; i < oper.length(); i++) {
            if (oper.charAt(i) != ' ') {
                if (oper.charAt(i) == '+' || oper.charAt(i) == '-' || oper.charAt(i) == '*' || oper.charAt(i) == '/') {
                    z[i] = 10;
                    x = String.valueOf(oper.charAt(i));
                } else {
                    z[i] = 1;
                }

            } else {
                z[i] = 0;
            }

        }
        for (int i = 0; i < oper.length() - 1; i++) {
            if (z[i] == 1 && z[i + 1] == 1) {
                z[i] = 0;
            }
        }
        for (int i = 0; i < oper.length(); i++) {
            count = count + z[i];
        }
        if (count == 12) {
            int p = 0;
            for (int i = 0; i < z.length; i++) {

                if (z[i] != 0) {
                    if (p != z[i]) {
                        p = z[i];
                    } else {
                        throw new ScannerException1("Неверный ввод");
                    }
                }
            }
            oper = oper.replaceAll("\\s+", "");
            String[] c = {};
            switch (x){
                case "+":
                     c = oper.split("\\+");
                     break;
                case "-":
                    c = oper.split("-");
                    break;
                case "*":
                    c = oper.split("\\*");
                    break;
                case "/":
                    c = oper.split("/");
                    break;
            }

            String[] result = {c[0], c[1], x};
            return result;

        } else {
            throw new ScannerException1("Неправильный ввод");
        }
    }
}
