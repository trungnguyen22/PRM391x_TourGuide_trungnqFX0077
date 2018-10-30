package models;

import java.util.List;

public class PlaceDto {
    private String mPlaceName;
    private String mTitle;
    private int mResIcon;
    private List<ServiceDto> mItems;

    public PlaceDto() {

    }

    public PlaceDto(String placeName, String title, int resIcon, List<ServiceDto> items) {
        mPlaceName = placeName;
        mTitle = title;
        mResIcon = resIcon;
        mItems = items;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public void setPlaceName(String placeName) {
        mPlaceName = placeName;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public int getResIcon() {
        return mResIcon;
    }

    public void setResIcon(int resIcon) {
        mResIcon = resIcon;
    }

    public List<ServiceDto> getItems() {
        return mItems;
    }

    public void setItems(List<ServiceDto> items) {
        mItems = items;
    }
}
