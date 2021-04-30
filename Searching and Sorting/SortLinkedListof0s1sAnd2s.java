package com.company;
import java.util.Scanner;


public class SortLinkedListof0s1sAnd2s {
    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        LinkedList li = new LinkedList();

        for(int i = 0; i < n; i++)
        {
            int a;
            a = s.nextInt();
            li.push(a);
        }

        li.sortList(n);
        li.printList();
    }
}

class LinkedList
{
    Node head;

    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    void sortList(int n)
    {
        //Write code here
        int[] count=new int[n];


        Node node=head;
        while(node !=null)
        {
            count[node.data]++;

            node=node.next;
        }

        node=head;
        int i=0;

        while(node !=null){
            if(count[i]==0)
                i++;
            else {
                node.data=i;
                count[i]--;
                node=node.next;
            }

        }

    }

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}