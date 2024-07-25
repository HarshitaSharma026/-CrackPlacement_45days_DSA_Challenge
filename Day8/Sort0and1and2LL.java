// Easy: https://www.geeksforgeeks.org/sort-a-linked-list-of-0s-1s-or-2s/

// USING BUBBLE SORT TO SORT A LIST CONTAINING 0, 1, 2 - not optimized - O(n^2)
    public void sort(int pass, int ind) {
        if (pass == 0) {
            return;
        }
        if (ind < pass) {
            Node first = get(ind);
            Node second = get(ind + 1);
            if (first.value > second.value) {
                // 3 cases
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }
                else if (second == tail) {
                    Node prev = get(ind - 1);
                    prev.next = second;
                    tail = first;
                    second.next = tail;
                    first.next = null;

                }
                else {
                    Node prev = get(ind - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
                sort(pass, ind + 1);
            }
            else {
                sort(pass, ind + 1);
            }
        }
        else {
            sort(pass - 1, 0);
        }
    }

    // USING DUTCH NATIONAL FLAG ALGO - O(n)
    // count number of 0s, 1s and 2s in one pass, and recreate the list according to these numbers
    public void sortDutch() {
        Node temp = head;
        int count0 = 0, count1= 1, count2 = 2;
        while (temp != null) {
            if (temp.value == 0) {
                count0++;
            }
            else if (temp.value == 1) {
                count1++;
            }
            else {
                count2++;
            }
            temp = temp.next;
        }
        // creating list
        LinkedListDummy listDummy = new LinkedListDummy();

        int i = 1;
        while (i <= count0) {
            listDummy.insertLast(0);
            i++;
        }
        i = 1;
        while (i <= count1) {
            listDummy.insertLast(1);
            i++;
        }
        i = 1;
        while (i <= count2) {
            listDummy.insertLast(2);
            i++;
        }
    }