public class FunctionalKarateChop implements KarateChop {

    public int chop(int target, Integer[] array) {
        if (array.length == 0 || (array.length == 1 && array[0] != target) )   {
            return -1;
        }
        else {
            int pointer = (array.length - 1 ) / 2;
            if (array[pointer] == target) {
                return pointer;
            }
            else {
                int cutOfPointer;
                int newPointer;
                if (array[pointer] > target) {
                    cutOfPointer = 0;
                    array = cloneLeft(array);
                }
                else {
                    cutOfPointer = pointer + 1;
                    array = cloneRight(array);

                }
                newPointer = chop(target, array);
                if (newPointer == -1) {
                    return -1;
                }
                else {
                    return cutOfPointer + newPointer;
                }

            }

        }

    }

    private Integer[] cloneRight(Integer[] givenArray) {
        Integer[] cloneArray = new Integer[givenArray.length/2];
        for (int i = 1 + (givenArray.length - 1 ) / 2, p=0; i < givenArray.length; i++, p++) {
            cloneArray[p] = givenArray[i];
        }
        return  cloneArray;
    }

    private Integer[] cloneLeft(Integer[] givenArray) {
        Integer[] cloneArray = new Integer[(givenArray.length)/2];
        for (int i = 0; i < (givenArray.length)/2; i++) {
            cloneArray[i] = givenArray[i];
        }
        return cloneArray;

    }
}
