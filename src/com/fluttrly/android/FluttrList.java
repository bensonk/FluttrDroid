package com.fluttrly.android;

import java.util.LinkedList;
import java.util.List;

public class FluttrList {
	private List<FluttrTask> tasks;
	private String name;
	
	public FluttrList(String name) {
		tasks = new LinkedList<FluttrTask>();
	}
	
	public List<FluttrTask> getTasks() {
		return tasks;
	}

	public void addTask(FluttrTask t) {
		tasks.add(t);
	}
	public boolean removeTask(FluttrTask t) {
		int i = tasks.indexOf(t);
		if(i > 0) {
			tasks.remove(i);
			t.destroy();
			return true;
		}
		else {
			return false;
		}
	}

	public String getName() {
		return name;
	}
}
