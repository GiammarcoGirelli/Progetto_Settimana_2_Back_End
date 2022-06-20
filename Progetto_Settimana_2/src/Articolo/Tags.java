package Articolo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tags {

    private String[] tags;

    public Tags(String[] tags) {
        this.tags = tags;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return Arrays.toString(tags);
    }
}

