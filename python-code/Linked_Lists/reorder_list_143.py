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
    temp = head

    arr = []



    while temp != None:
        arr.append(temp.val)
        temp = temp.next

    left = 0
    right = len(arr) - 1

    newHead = ListNode(arr[left])
    tempnewHead = newHead
    tempnewHead.next = ListNode(arr[right])
    tempnewHead = tempnewHead.next

    left += 1
    right -= 1

    print(arr)

    while left < right:
        print('newhead: ')

        print()

        tempnewHead.next = ListNode(arr[left])
        tempnewHead = tempnewHead.next
        tempnewHead.next = ListNode(arr[right])
        tempnewHead = tempnewHead.next

        left += 1
        right -= 1

    if len(arr) % 2 != 0:
        tempnewHead.next = ListNode(arr[math.floor(len(arr) / 2)])
        tempnewHead = tempnewHead.next
    print_list((newHead))

    temp3 = head
    tempnewHead = newHead

    while tempnewHead != None:
        temp3.val = tempnewHead.val
        tempnewHead = tempnewHead.next
        temp3 = temp3.next

    print_list(head)

list1 = ListNode(1)
head = list1
for i in range(2,11):
    head.next = ListNode(i)
    head = head.next

list2 = ListNode(1)
head = list2
for i in range(2,8):
    head.next = ListNode(i)
    head = head.next

list3 = ListNode(1)
head = list3

for i in range(2,5):
    head.next = ListNode(i)
    head = head.next
    print('element')
    print(i)

# print_list(list1)
# t1 = reorderList(list1)
#
# print_list(list2)
# t2 = reorderList(list2)

# reorderList(list3)

reorderList(ListNode(1))