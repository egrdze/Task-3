package cs.vsu.ru.lyashenko_e_v;

    public class test {

        public static boolean testProgram(){
            if (Picture.getColor(4, 2) != SimpleColor.WHITE) {
                System.out.println("Test 1 is not completed");
                return false;
            }
            if (Picture.getColor(4, -1) != SimpleColor.WHITE){
                System.out.println("Test 2 is not completed");
                return false;
            }
            if (Picture.getColor(5, 1) != SimpleColor.BLUE){
                System.out.println("Test 3 is not completed");
                return false;
            }
            if (Picture.getColor(-4, 1) != SimpleColor.BLUE){
                System.out.println("Test 4 is not completed");
                return false;
            }
            if (Picture.getColor(-2, -4) != SimpleColor.GRAY){
                System.out.println("Test 5 is not completed");
                return false;
            }
            if (Picture.getColor(-2, -6) != SimpleColor.GRAY){
                System.out.println("Test 6 is not completed");
                return false;

            }
            return true;
        }
    }

