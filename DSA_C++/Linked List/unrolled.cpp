#include <iostream>
using namespace std;

const int MAX_ELEMENTS = 4; // elements per node

struct Node {
    int numElements;
    int elements[MAX_ELEMENTS];
    Node *next;
    Node() : numElements(0), next(nullptr) {}
};

// Insert at end (illustrative, not optimal for all cases)
void insert(Node* &head, int value) {
    Node *curr = head;
    if (head == nullptr) {
        head = new Node();
        curr = head;
    }
    else {
        while (curr->next != nullptr)
            curr = curr->next;
        if (curr->numElements == MAX_ELEMENTS) {
            curr->next = new Node();
            curr = curr->next;
        }
    }
    curr->elements[curr->numElements++] = value;
}

// Traverse list and print all elements
void traverse(Node* head) {
    while (head != nullptr) {
        for (int i = 0; i < head->numElements; ++i)
            cout << head->elements[i] << " ";
        head = head->next;
    }
    cout << endl;
}

int main() {
    Node* head = nullptr;
    // Insert 9 elements (to create 3 nodes)
    int vals[] = {1,2,3,4,5,6,7,8,9};
    for (int v : vals)
        insert(head, v);
    traverse(head);
    return 0;
}
