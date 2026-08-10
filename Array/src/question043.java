public class question043 {

    // Backspace string comparee
    static boolean backspace(String s , String t){
        int rightS = s.length()-1;
        int rightT = t.length()-1;

        int skipS = 0;
        int skipT = 0;

        while (rightS >= 0 || rightT >=0){

            //for string s
            while (rightS >= 0 ){
                if(s.charAt(rightS) == '#'){
                    skipS++;
                    rightS--;
                } else if (skipS >0){
                    skipS--;
                    rightS--;
                } else {
                    break;
                }
            }

            //for string t
            while (rightT >=0){
                if(t.charAt(rightT) == '#'){
                    skipT++;
                    rightT--;
                } else if(skipT>0){
                    skipT--;
                    rightT--;
                } else {
                    break;
                }
            }

            //compare
            if (rightS >=0 && rightT >=0){
                if(s.charAt(rightS) != t.charAt(rightT)){
                    return false;
                }
                rightT--;
                rightS--;
            } else if(rightS >= 0 || rightT>=0){
                return false;
            }


        }
        return true;
    }
    public static void main(String[] args) {
String s = "ab#c";
String t = "ad#c";

        System.out.println(backspace(s,t));
    }
}
