package daily_coding_challenges;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prob169_Sort_Linked_List_In_PlaceTest {

    @Test
    void getSortedArrayInPlace() {
        Prob169_Sort_Linked_List_In_Place.Node head = new Prob169_Sort_Linked_List_In_Place.Node(15);
        head.next=new Prob169_Sort_Linked_List_In_Place.Node(10);
        head.next.next=new Prob169_Sort_Linked_List_In_Place.Node(5);
        int expectedResult = 5;
        Prob169_Sort_Linked_List_In_Place testObj = new Prob169_Sort_Linked_List_In_Place();
        Assert.assertEquals(expectedResult,testObj.getSortedArrayInPlace(head).val);
    }
}