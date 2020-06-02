import java.util.ArrayList;

public class OddSum {

    public static void main(String[] args) {
        run(args, false);
    }

    public static int run(String[] args, boolean test) {

        ArrayList<Integer> listInt = new ArrayList<>();
        int res;
        if (!test) {
            System.out.println("Elements' list :");
            for (String v : args)
                System.out.print(" " + v);
            System.out.println();
        }


        try {
        
            for (int i = 0; i < args.length; i++) {

                listInt.add(Integer.parseInt(args[i]));
            }
        
            res = sum(listInt);
            
        } catch (Exception e) {
            //Problème pour calculer la somme : on a envoyé un truc pas correct
            res = -1;;
        }
        if (test) {
            return res;
        }

        System.out.println("Sum of odd elements : " + res);
        System.out.println("END!");

        return 0;
    }

    public static int sum(ArrayList<Integer> listInt) {

        int result = 0;

        try {
            for (int value : listInt) {
                if (value % 2 != 0) {
                    result += value;
                }
            }
        } catch (Exception e) {
            //Y'a quelquechose qui s'est mal passé ?! On renvoie -1 dans le doute
            result = -1;
        }
        return result;
    }
}
