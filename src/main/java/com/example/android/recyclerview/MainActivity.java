/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    private static final int NUM_LIST_ITEMS = 100;

    GreenAdapter mAdapter;

    RecyclerView mNumberList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //We are use findViewById o create an instance of the recyclerView, naming it mNumberlist
        mNumberList = (RecyclerView) findViewById(R.id.rv_numbers);

        //Creating a new Linear layoutManager
        LinearLayoutManager layoutManager  = new LinearLayoutManager(this);

        //Setting the RecyclerView to the linear layoutManger
        mNumberList.setLayoutManager(layoutManager);


        mNumberList.setHasFixedSize(true);


        //Creating a new GreenAPadapter with the size of  NUM_LIST_ITEMS
        mAdapter = new GreenAdapter(NUM_LIST_ITEMS);

        //Setting the recyclerView to the Adapter
        mNumberList.setAdapter(mAdapter);
    }
}
