package com.company;

public class Worker {
    private final OnTaskDoneListener callback;
    private final OnTaskErrorListener errorCallBack;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallBack) {
        this.callback = callback;
        this.errorCallBack = errorCallBack;
    }

    public void start() {
        for (int i = 0; i < 100; i++)
            if (i != 33) {
                callback.onDone("Task " + i + " is done");
            } else {
                errorCallBack.onError("Task " + i + " has failed");
            }
    }
}

