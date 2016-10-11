package edu.orangecoastcollege.cs273.fjuarez6.todo2day;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // FOR NOW (TEMPORARY), delete the old database, then create a new one
        this.deleteDatabase(DBHelper.DATABASE_TABLE);
        // Let's make a DBHelper reference:
        DBHelper db = new DBHelper(this);

        // Let's make a new task and add to database:
        db.addTask(new Task(1, "Study for CS273 Midterm", 0));
        db.addTask(new Task(2, "Study for Cs200", 0));
        db.addTask(new Task(3, "Study for French Class", 0));
        db.addTask(new Task(4, "Watch tv", 0));
        db.addTask(new Task(5, "read Game of Thrones", 0));

        // Let's get all the tasks from the database and print them with log.i()
        ArrayList<Task> allTask = db.getAllTasks();
        //Loop through each task, print to log.i
        for (Task singleTask : allTask)
        {
            Log.i("DATABASE TASK", singleTask.toString());
        }
    }
}
