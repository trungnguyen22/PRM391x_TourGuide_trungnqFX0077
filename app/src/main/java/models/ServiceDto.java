package models;

import java.io.Serializable;
import java.util.List;

public class ServiceDto implements Serializable {
    private String mServiceName;
    private int mResIcon;
    private int mResColor;
    private List<ItemDto> mItemDtoList;
    private EService mEService;

    public ServiceDto(String serviceName, int resIcon, int resColor, List<ItemDto> itemDtoList, EService eService) {
        this.mServiceName = serviceName;
        this.mResIcon = resIcon;
        this.mResColor = resColor;
        this.mItemDtoList = itemDtoList;
        this.mEService = eService;
    }

    public String getServiceName() {
        return mServiceName;
    }

    public void setServiceName(String serviceName) {
        mServiceName = serviceName;
    }

    public List<ItemDto> getItemDtoList() {
        return mItemDtoList;
    }

    public void setItemDtoList(List<ItemDto> itemDtoList) {
        mItemDtoList = itemDtoList;
    }

    public int getResIcon() {
        return mResIcon;
    }

    public void setResIcon(int resIcon) {
        mResIcon = resIcon;
    }

    public EService getEService() {
        return mEService;
    }

    public void setEService(EService EService) {
        mEService = EService;
    }

    public int getResColor() {
        return mResColor;
    }

    public void setResColor(int resColor) {
        mResColor = resColor;
    }

    public enum EService {
        DEFAULT(""),
        ATM("ATM"),
        HOTEL("HOTEL"),
        HOSPITAL("HOSPITAL"),
        BUS("BUS");

        String type;

        EService(String type) {
            this.type = type;
        }
    }
}
