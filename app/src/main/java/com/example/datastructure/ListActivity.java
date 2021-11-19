package com.example.datastructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        displayList();
    }

    private void displayList() {
        mListView = findViewById(R.id.list_view);

        ArrayList<String> mArrayList = new ArrayList<>();
        mArrayList.add("Arrays - DS");
        mArrayList.add("2D Array - DS");
        mArrayList.add("Dynamic Array");
        mArrayList.add("Left Rotation");
        mArrayList.add("Big Sorting");
        mArrayList.add("Sparse Arrays");
        mArrayList.add("Array Manipulation");
        mArrayList.add("Maximum Element");
        mArrayList.add("Balanced Brackets");
        mArrayList.add("Equal Stacks");
        mArrayList.add("Largest Rectangle");
        mArrayList.add("Simple Text Editor");
        mArrayList.add("Preorder Traversal");
        mArrayList.add("Inorder Traversal");
        mArrayList.add("Postorder Traversal");
        mArrayList.add("Height of a Binary Tree");
        mArrayList.add("Level Order Traversal");
        mArrayList.add("Huffman Decoding");
        mArrayList.add("Top View");
        mArrayList.add("Print the Elements of a Linked List");
        mArrayList.add("Insert a node at the head of a linked list");
        mArrayList.add("Insert a Node at the Tail of a Linked List");
        mArrayList.add("Delete a Node");
        mArrayList.add("Print in Reverse");
        mArrayList.add("Reverse a linked list");
        mArrayList.add("Compare two linked lists");
        mArrayList.add("Merge two sorted linked lists");
        mArrayList.add("Get Node Value");
        mArrayList.add("Delete duplicate-value nodes from a sorted linked list");
        mArrayList.add("Cycle Detection");
        mArrayList.add("Find Merge Point of Two Lists");
        mArrayList.add("Inserting a Node Into a Sorted Doubly Linked List");
        mArrayList.add("Reverse a doubly linked list");
        mArrayList.add("Contacts");
        mArrayList.add("No Prefix Set");
        mArrayList.add("Queue using Two Stacks");
        mArrayList.add("QHEAP1");
        mArrayList.add("Jesse and Cookies");
        mArrayList.add("Find the Running Median");
        mArrayList.add("Merging Communities");
        mArrayList.add("Components in a graph");



        ArrayAdapter<String> mArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mArrayList);
        mListView.setAdapter(mArrayAdapter);


        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                mListView.getItemAtPosition(position);
                startActivity(new Intent(ListActivity.this, TbbedActivity.class));
            }
        });
    }
}
