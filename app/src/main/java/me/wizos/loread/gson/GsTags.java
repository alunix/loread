package me.wizos.loread.gson;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

import java.util.ArrayList;

import me.wizos.loread.bean.Tag;

@Parcel
public class GsTags {
	@SerializedName("tags")
	ArrayList<Tag> tags;

	public ArrayList<Tag> getTags() {
		return tags;
	}

	public void setTags(ArrayList<Tag> tags) {
		this.tags = tags;
	}
}
