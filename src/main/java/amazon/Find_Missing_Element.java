package amazon;


/**
 * There is a shuffled array consisting of N elements with values (1 to N inclusive).
 * After removing one single element, the array is given back to you. Find the missing element.
 */
public class Find_Missing_Element {

    int getMissingElement(int[] srcArr, int[] destArr) {
        int missinElement = srcArr[0];
        for (int i = 1; i < srcArr.length; i++) {
            missinElement ^= srcArr[i];
        }
        for (int i = 0; i < destArr.length; i++) {
            missinElement ^= destArr[i];
        }
        return missinElement;
    }
}
