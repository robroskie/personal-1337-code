
class ListNode:
    def __init__(self, val = 0, next=None):
        self.val = val
        self.next = next

    def print_list(self):
        temp = self
        while temp is not None:
            print(temp.val, end=" ")
            temp = temp.next
        print()



def mergeTwoLists(list1, list2):
    mergedList = ListNode()
    head = mergedList

    contL1 = True if list1 != None else False
    contL2 = True if list2 != None else False

    if not contL1 and not contL2:
        return None

    while contL1 and contL2:

        if contL1 and contL2 and list1.val <= list2.val:
            head.next = ListNode(list1.val)
            head = head.next

            list1 = list1.next
            if list1 == None:
                contL1 = False

        elif contL2:
            head.next = ListNode(list2.val)
            head = head.next

            list2 = list2.next
            if list2 == None:
                contL2 = False

    print('here')
    if contL1 or contL2:
        if contL1:
            head.next = list1
        else:
            head.next = list2

    mergedList = mergedList.next
    return mergedList


def main():
    # list1 = ListNode(1)
    # list1.next = ListNode(2)
    # list1.next.next = ListNode(4)
    #
    # list2 = ListNode(1)
    # list2.next = ListNode(3)
    # list2.next.next = ListNode(4)

    list1 = None
    list2 = ListNode(0)

    # list1.print_list()
    list2.print_list()

    result = mergeTwoLists(list1, list2)
    result.print_list()

main()