package kr.co.jin0yoon.mvvm_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BaseObservable;

import android.os.Bundle;

import kr.co.jin0yoon.mvvm_test.data.Task;
import kr.co.jin0yoon.mvvm_test.data.source.TasksDataSource;

/**
 * Abstract class for View Models that expose a single {@link Task}.
 */
public class TaskViewModel extends BaseObservable implements TasksDataSource.GetTaskCallback {

    @Override
    public void onTaskLoaded(Task task) {

    }

    @Override
    public void onDataNotAvailable() {

    }
}
