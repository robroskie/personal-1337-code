import math

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


    # Find list size
    i = 0
    temp = head
    while(temp != None):
        i += 1
        temp = temp.next

    # Find index of middle element rounded down
    mid_element = math.floor(i / 2)
    print(mid_element)

    # Build reverse of second half
    k = 0
    temp = head
    while(k < mid_element):
        temp = temp.next
        k += 1
    print('mid element is {}'.format(temp.val))



    temp2 = temp.next
    temp3 = temp2.next
    temp.next = None



    print('{},  {},  {}'.format(temp.val,temp2.val,temp3.val))

    while(temp3.next != None):
        print('loop')
        temp2.next = temp

        temp = temp2
        temp2 = temp3
        temp3 = temp3.next

    temp3.next = temp2



    #
    # while(temp3 != None):
    #
    #     print(temp3.val)
    #     temp3 = temp3.next






list1 = ListNode(1)
head = list1
for i in range(2,11):
    head.next = ListNode(i)
    head = head.next

list2 = ListNode(1)
head = list2
for i in range(2,7):
    head.next = ListNode(i)
    head = head.next


t1 = reorderList(list1)
