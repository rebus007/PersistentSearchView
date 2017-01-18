package org.cryse.widget.persistentsearch;

import android.graphics.drawable.Drawable;
import android.net.Uri;

public class SearchItem {
    private String mTitle;
    private String mValue;
    private Drawable mIcon;
    private Uri mUri;
    private int mType;
    public static final int TYPE_SEARCH_ITEM_HISTORY = 0;
    public static final int TYPE_SEARCH_ITEM_SUGGESTION = 1;
    public static final int TYPE_SEARCH_ITEM_OPTION = 2;
    public static final int TYPE_SEARCH_ITEM_CUSTOM = 3;
    public static final int TYPE_SEARCH_ITEM_DEFAULT = TYPE_SEARCH_ITEM_HISTORY;


    public SearchItem(String title, String value) {
        this(title, value, TYPE_SEARCH_ITEM_DEFAULT, Uri.EMPTY);
    }
    /**
     * Create a search result with text and an icon
     * @param title display value
     * @param value inner value for search
     * @param type item type
     */
    public SearchItem(String title, String value, int type) {
        this(title, value, type, Uri.EMPTY);
    }

    public SearchItem(String title, String value, int type, Drawable icon) {
        this.mTitle = title;
        this.mValue = value;
        this.mType = type;
        this.mIcon = icon;
    }

    public SearchItem(String title, String value, int type, Uri uri) {
        this.mTitle = title;
        this.mValue = value;
        this.mType = type;
        this.mUri = uri;
    }
    
    /**
     * Return the title of the result
     */
    @Override
    public String toString() {
        return mTitle;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public String getValue() {
        return mValue;
    }

    public void setValue(String value) {
        this.mValue = value;
    }

    public Drawable getIcon() {
        return mIcon;
    }

    public void setIcon(Drawable icon) {
        this.mIcon = icon;
    }

    public int getType() {
        return mType;
    }

    public Uri getUri() {
        return mUri;
    }

    public void setUri(Uri uri) {
        this.mUri = uri;
    }

    public void setType(int type) {
        this.mType = type;
    }
}