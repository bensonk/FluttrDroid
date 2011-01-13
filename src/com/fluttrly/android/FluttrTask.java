package com.fluttrly.android;

import org.json.JSONException;
import org.json.JSONObject;

public class FluttrTask {
	private String body;
	private String listName;
	private int id;
	private boolean completed;

	public FluttrTask(String listName, String body, boolean completed) {
		this.id = -1;
		this.setBody(body);
		this.setListName(listName);
		this.setCompleted(completed);
	}
	
	public FluttrTask(JSONObject o) {
		try {
			this.id = o.getInt("id");
			this.setBody(o.getString("body"));
			this.setCompleted(o.getBoolean("completed"));
			this.setListName(o.getString("name"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void destroy() {
		this.completed = true;
		// TODO: Remove from server
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getBody() {
		return body;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public String getList_name() {
		return listName;
	}

	public int getId() {
		return id;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public boolean isCompleted() {
		return completed;
	}
}
