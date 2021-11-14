public class Main {
    public static void main(String[] args) {


        InputOperation input = new InputOperation();
        String qwe = input.in();


        Controller con = new Controller();
        String[] r;

        Parse parse = new Parse();

        Operation op = new Operation();


        try {
            r = con.controller(qwe);
            int [] p = parse.toInt(r);
            int l= op.oper(p,r[2]);
            System.out.println(parse.toString(l));

        } catch (ScannerException1 e) {
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }







    }
}
