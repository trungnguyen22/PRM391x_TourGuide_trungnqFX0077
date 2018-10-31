package models;

import java.io.Serializable;
import java.util.List;

public class ServiceDto implements Serializable {
    private String mServiceName;
    private int mResIcon;
    private String mCodeColor;
    private List<ItemDto> mItemDtoList;
    private EService mEService;

    public ServiceDto(String serviceName, int resIcon, String codeColor, List<ItemDto> itemDtoList, EService eService) {
        this.mServiceName = serviceName;
        this.mResIcon = resIcon;
        this.mCodeColor = codeColor;
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

    public String getCodeColor() {
        return mCodeColor;
    }

    public void setCodeColor(String codeColor) {
        mCodeColor = codeColor;
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
