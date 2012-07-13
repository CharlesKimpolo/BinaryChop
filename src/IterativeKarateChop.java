public class IterativeKarateChop implements KarateChop {

    public int chop(int target, Integer[] array) {
        if (array.length == 0){
            return -1;
        }
        else {
            int initialIndex = 0;
            int finalIndex = array.length;
            int pointer = (initialIndex + finalIndex) / 2;
            while ( array[pointer] != target &&  finalIndex - initialIndex > 1) {
                if (array[pointer] > target) {
                    finalIndex = pointer;
                }
                else {
                    initialIndex = pointer;
                }
                pointer = (initialIndex + finalIndex) / 2;
            }
            if (array[pointer] == target) {
                return pointer;
            }
            else {
                return -1;
            }
        }
    }

}
