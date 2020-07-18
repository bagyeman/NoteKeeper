package com.belinda.notekeeper

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_note_list.*
import kotlinx.android.synthetic.main.content_note_list.*
import java.io.LineNumberReader

class NoteListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            val activityIntent = Intent(this, MainActivity::class.java)
            startActivity(activityIntent)
        }

        //Associating layout manager to our recyclerview

        listItems.layoutManager = LinearLayoutManager(this)
        listItems.adapter = NoteRecyclerAdapter(this, DataManager.notes)



        //This block of code was used in relation to the list view

       /** listNotes.adapter = ArrayAdapter(this,
            android.R.layout.simple_spinner_item,
            DataManager.notes)

        listNotes.setOnItemClickListener{parent, view, position, id ->
            val activityIntent = Intent(this, MainActivity::class.java)
            activityIntent.putExtra(NOTE_POSITION, position)
            startActivity(activityIntent)
        }**/




    }

    override fun onResume() {
        super.onResume()
        //Notify activity of changes to data
        //(listNotes.adapter as ArrayAdapter<NoteInfo>).notifyDataSetChanged()
        listItems.adapter?.notifyDataSetChanged()
    }

}
