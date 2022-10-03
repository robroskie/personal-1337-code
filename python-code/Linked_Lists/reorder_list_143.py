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

def reorderList(head):
    listAsArr = []

    returnlist = []

    temp = head

    while temp != None:
        listAsArr.append(temp.val)
        temp = temp.next

    left = 0
    right = len(listAsArr) - 1

    while left < right:
        returnlist.append(listAsArr[left])
        returnlist.append(listAsArr[right])
        left += 1
        right -= 1

    if (len(listAsArr) % 2) != 0:
        returnlist.append(listAsArr[left])

    head.val = returnlist[0]
    temp = head
    returnlist.pop(0)

    print(temp.next)

    for i in returnlist:
        # print('adding {}'.format(i))
        temp.next.val = i
        temp = temp.next


    # return head
    head.print_list()

def main():
    list1 = ListNode(1)
    head = list1
    for i in range(2,6):
        head.next = ListNode(i)
        head = head.next

    list2 = ListNode(1)
    head = list2
    for i in range(2,7):
        head.next = ListNode(i)
        head = head.next


    t1 = reorderList(list1)


main()