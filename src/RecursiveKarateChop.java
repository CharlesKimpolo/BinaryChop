public class RecursiveKarateChop implements KarateChop {

    private int target;
    private Integer[] array;

    public int chop(int target, Integer[] array){
        this.target = target;
        this.array = array;
        return recursiveBinarySearch(0, array.length - 1);
    }


    public int recursiveBinarySearch(int initialIndex, int finalIndex) {

        if (array.length == 0 || (finalIndex - initialIndex < 1 && array[initialIndex] != target)) {
            return -1;
        }
        else if (finalIndex - initialIndex < 1 && array[initialIndex] == target ) {
            return initialIndex;
        }

        else {
            int pointer = (initialIndex + finalIndex) / 2;
            if (array[pointer] == target) {
                return pointer;
            }
            else {
                if (array[pointer] > target) {
                    finalIndex = pointer - 1;
                }
                else {
                    initialIndex = pointer + 1;
                }
                return recursiveBinarySearch(initialIndex, finalIndex);

            }
        }
    }
}
