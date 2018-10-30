package models;

import java.io.Serializable;

public class ItemDto implements Serializable {
    private String mItemName;
    private String mItemAddress;

    public ItemDto(String itemName, String itemAddress) {
        mItemName = itemName;
        mItemAddress = itemAddress;
    }

    public String getItemName() {
        return mItemName;
    }

    public void setItemName(String itemName) {
        mItemName = itemName;
    }

    public String getItemAddress() {
        return mItemAddress;
    }

    public void setItemAddress(String itemAddress) {
        mItemAddress = itemAddress;
    }
}
