package ru.synergy.asyncexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;

public class AsyncTaskExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task_example);

        MyAsyncTask asynctask = new MyAsyncTask();
        asynctask.execute("Hello World!");
    }

    public void onClick(View view){
        //ToDo
    }

}

class MyAsyncTask extends AsyncTask<String, Integer, Integer> {


    @Override
    protected Integer doInBackground(String... strings) {
        int myProgress = 0;
        publishProgress(myProgress);
        int result = myProgress++;
        return result;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onCancelled() {
        super.onCancelled();
    }

    @Override
    protected void onPostExecute(Integer integer) {
        super.onPostExecute(integer);
    }

}