package models;

import com.example.dell.prm391x_tourguide_trungnqfx0077.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlaceDataFactory {

    private EPlace mEPlace;

    public PlaceDataFactory(EPlace EPlace) {
        mEPlace = EPlace;
    }

    public PlaceDto makePlace() {
        switch (mEPlace) {
            case HA_NOI:
                return new PlaceDto("Hà Nội", "Thành phố Thủ Đô", R.drawable.ha_noi_bg, makeListServices());
            case HO_CHI_MINH:
                return new PlaceDto("TP.Hồ Chí Minh", "Thành phố mang tên Bác", R.drawable.ho_chi_minh_bg, makeListServices());
        }
        return new PlaceDto();
    }

    public List<ServiceDto> makeListServices() {
        return Arrays.asList(makeATMService(), makeHotelService(), makeHospitalService(), makeBusService());
    }

    public ServiceDto makeATMService() {
        return new ServiceDto("ATM", R.drawable.ic_atm, "#4682B4", makeATMItem(), ServiceDto.EService.ATM);
    }

    public ServiceDto makeHotelService() {
        return new ServiceDto("Khách Sạn", R.drawable.ic_hotel, "#00FFFF", makeHotelItem(), ServiceDto.EService.HOTEL);
    }

    public ServiceDto makeHospitalService() {
        return new ServiceDto("Bệnh Viện", R.drawable.ic_hospital, "#8FBC8F", makeHospitalItem(), ServiceDto.EService.HOSPITAL);
    }

    public ServiceDto makeBusService() {
        return new ServiceDto("Xe Bus", R.drawable.ic_bus, "#A0522D", makeBusItem(), ServiceDto.EService.BUS);
    }

    public List<ItemDto> makeATMItem() {
        switch (mEPlace) {
            case HO_CHI_MINH:
                ItemDto itemHCM1 = new ItemDto("ATM Hồ Con Rùa", "255 Phạm Ngọc Thạch, Quận 3, Hồ Chí Minh");
                ItemDto itemHCM2 = new ItemDto("ATM Phố Đi Bộ", "173 Nguyễn Huệ, Quận 1, Hồ Chí Minh");
                ItemDto itemHCM3 = new ItemDto("ATM Gò Vấp", "57 Nguyễn Oanh, Quận Gò Vấp, Hồ Chí Minh");
                ItemDto itemHCM4 = new ItemDto("ATM Bến Thành", "365 Lê Lai, Quận 1, Hồ Chí Minh");
                ItemDto itemHCM5 = new ItemDto("ATM Lê Thị Riêng", "212 CMT8, Quận 10, Hồ Chí Minh");
                ItemDto itemHCM6 = new ItemDto("ATM Trường Trinh", "404 Trường Trinh, Quận Tân Bình, Hồ Chí Minh");
                ItemDto itemHCM7 = new ItemDto("ATM Ông Lãnh", "77 Cầu Ông Lãnh, Quận 4, Hồ Chí Minh");
                return Arrays.asList(itemHCM1, itemHCM2, itemHCM3, itemHCM4, itemHCM5, itemHCM6, itemHCM7);
            case HA_NOI:
                ItemDto item1 = new ItemDto("ATM Hoàn Kiếm", "17 phố Lý Thường Kiệt, Phường Phan Chu Trinh, Quận Hoàn Kiếm, Hà Nội");
                ItemDto item2 = new ItemDto("ATM Đinh Tiên Hoàng", "7 Đinh Tiên Hoàng, Quận Hoàn Kiếm, Hà Nội");
                ItemDto item3 = new ItemDto("ATM Hội sở", "57 Lý Thường Kiệt, Quận Hoàn Kiếm, Hà Nội");
                ItemDto item4 = new ItemDto("ATM Nam Hà Nội", "236 Lê Thanh Nghị, Quận Hai Bà Trưng, Hà Nội");
                ItemDto item5 = new ItemDto("ATM Hai Bà Trưng", "300-302 Trần Khát Chân, Quận Hai Bà Trưng, Hà Nội");
                ItemDto item6 = new ItemDto("ATM Lê Ngọc Hân", "44 Lê Ngọc Hân, Quận Hai Bà Trưng, Hà Nội");
                ItemDto item7 = new ItemDto("ATM Thăng Long", "129-131 Hoàng Quốc Việt, Quận Cầu Giấy, Hà Nội");
                ItemDto item8 = new ItemDto("ATM Phạm Hùng", "Tòa nhà FPT Phạm Hùng, Quận Cầu Giấy, Hà Nội");
                ItemDto item9 = new ItemDto("ATM Khâm Thiên", "158 Khâm Thiên, Quận Đống Đa, Hà Nội");
                return Arrays.asList(item1, item2, item3, item4, item5, item6, item7, item8, item9);
            case DA_NANG:
            case DEFAULT:
            default:
                return new ArrayList<>();
        }

    }

    public List<ItemDto> makeHospitalItem() {
        switch (mEPlace) {
            case HO_CHI_MINH:
                ItemDto itemHCM1 = new ItemDto("Bệnh Viện Ung Bứu", "255 Phạm Ngọc Thạch, Quận 3, Hồ Chí Minh");
                ItemDto itemHCM2 = new ItemDto("Bệnh Viện Đại Học Y Dược", "173 Nguyễn Huệ, Quận 1, Hồ Chí Minh");
                ItemDto itemHCM3 = new ItemDto("Bệnh Viện Hùng Vương", "57 Nguyễn Oanh, Quận Gò Vấp, Hồ Chí Minh");
                ItemDto itemHCM4 = new ItemDto("Bệnh Viện 115", "365 Lê Lai, Quận 1, Hồ Chí Minh");
                ItemDto itemHCM5 = new ItemDto("Bệnh Viện Gia Định", "212 CMT8, Quận 10, Hồ Chí Minh");
                ItemDto itemHCM6 = new ItemDto("Bệnh Viện Chợ Rẫy", "404 Trường Trinh, Quận Tân Bình, Hồ Chí Minh");
                ItemDto itemHCM7 = new ItemDto("Bệnh Viện 175", "77 Cầu Ông Lãnh, Quận 4, Hồ Chí Minh");
                return Arrays.asList(itemHCM1, itemHCM2, itemHCM3, itemHCM4, itemHCM5, itemHCM6, itemHCM7);
            case HA_NOI:
                ItemDto item1 = new ItemDto("Bệnh viện Bạch Mai", "78 – Đường Giải Phóng – Phương Mai – Đống Đa – Hà Nội");
                ItemDto item2 = new ItemDto("Bệnh Viện Hữu Nghị", "Số 1 – Trần Khánh Dư – Quận Hai Bà Trưng – Hà Nội");
                ItemDto item3 = new ItemDto("Bệnh Viện E, Hà Nội", "89 – Trần Cung – Nghĩa Tân – Cầu Giấy – Hà Nội");
                ItemDto item4 = new ItemDto("Viện Răng Hàm Mặt", "40B – Tràng Thi – Hoàn Kiếm – Hà Nội");
                ItemDto item5 = new ItemDto("Bệnh Viện Tai Mũi Họng Trung Ương", "78 – Đường Giải Phóng – Quận Đống Đa – Hà Nội");
                ItemDto item6 = new ItemDto("Bệnh Viện Mắt Trung Ương", "85 – Phố Bà Triệu – Quận Hai Bà Trưng – Hà Nội");
                ItemDto item7 = new ItemDto("Viện Y Học Cổ Truyền Trung Ương", "29 – Phố Nguyễn Bỉnh Khiêm – Quận Hai Bà Trưng – Hà Nội");
                ItemDto item8 = new ItemDto("Bệnh Viện Nội Tiết", "80 – Thái Thịnh II – Thịnh Quang – Đống Đa – Hà Nội");
                ItemDto item9 = new ItemDto("Bệnh Viện Việt Đức", "8 – Phố Phủ Doãn – Quận Hoàn Kiếm – Hà Nội");
                ItemDto item10 = new ItemDto("Bệnh Viện Nhi Trung Ương", "18/879 – Đường La Thành – Quận Đống Đa – Hà Nội");
                return Arrays.asList(item1, item2, item3, item4, item5, item6, item7, item8, item9, item10);
            case DA_NANG:
            case DEFAULT:
            default:
                return new ArrayList<>();
        }
    }

    public List<ItemDto> makeHotelItem() {
        switch (mEPlace) {
            case HO_CHI_MINH:
                ItemDto itemHCM1 = new ItemDto("Alexander Hung Hotel & Spa", "255 Phạm Ngọc Thạch, Quận 3, Hồ Chí Minh");
                ItemDto itemHCM2 = new ItemDto("Lavender L'm Hotel", "173 Nguyễn Huệ, Quận 1, Hồ Chí Minh");
                ItemDto itemHCM3 = new ItemDto("Go Go Hotel", "57 Nguyễn Oanh, Quận Gò Vấp, Hồ Chí Minh");
                ItemDto itemHCM4 = new ItemDto("Sao Việt Hotel", "365 Lê Lai, Quận 1, Hồ Chí Minh");
                ItemDto itemHCM5 = new ItemDto("Bốn Mùa Hotel", "212 CMT8, Quận 10, Hồ Chí Minh");
                ItemDto itemHCM6 = new ItemDto("Hotel De La France", "404 Trường Trinh, Quận Tân Bình, Hồ Chí Minh");
                ItemDto itemHCM7 = new ItemDto("Bampbooo Shampooo Hotel", "77 Cầu Ông Lãnh, Quận 4, Hồ Chí Minh");
                return Arrays.asList(itemHCM1, itemHCM2, itemHCM3, itemHCM4, itemHCM5, itemHCM6, itemHCM7);
            case HA_NOI:
                ItemDto item1 = new ItemDto("The Queen Hotel & Spa", "67 Thuốc Bắc, Hàng Bồ, Hàng Bồ, Quận Hoàn Kiếm, Hà Nội, Việt Nam");
                ItemDto item2 = new ItemDto("Hanoi Nostalgia Hotel & Spa", "13-15 Luong Ngoc Quyen, Hang Buom, Hoan Kiem, Hàng Buồm, Quận Hoàn Kiếm, Hà Nội, Việt Nam");
                ItemDto item3 = new ItemDto("Church Legend Hotel Hanoi", "46 Ấu Triệu, Phường Hàng Trống, Quận Hoàn Kiếm, Hà Nội, Việt Nam");
                ItemDto item4 = new ItemDto("Little Hanoi Diamond Hotel", "11 Bát Đàn, Quận Hoàn Kiếm, Hàng Bồ, Quận Hoàn Kiếm, Hà Nội, Việt Nam");
                ItemDto item5 = new ItemDto("Flamingo Dai Lai Resort", "Thôn Ngọc Quang, Xã Ngọc Thanh, Vĩnh Phúc, Phúc Yên, Hà Nội, Việt Nam");
                ItemDto item6 = new ItemDto("Annam Legend Hotel", "27 Hàng Bè, Hàng Bạc, Quận Hoàn Kiếm, Hà Nội, Việt Nam");
                ItemDto item7 = new ItemDto("Bluebell Hotel", "41 Ngõ Huyện, Phường Hàng Trống, Quận Hoàn Kiếm, Hà Nội, Việt Nam");
                return Arrays.asList(item1, item2, item3, item4, item5, item6, item7);
            case DA_NANG:
            case DEFAULT:
            default:
                return new ArrayList<>();
        }
    }

    public List<ItemDto> makeBusItem() {
        switch (mEPlace) {
            case HO_CHI_MINH:
                ItemDto itemHCM1 = new ItemDto("Tuyến 01", "255 Phạm Ngọc Thạch, Quận 3, Hồ Chí Minh");
                ItemDto itemHCM2 = new ItemDto("Tuyến 02", "173 Nguyễn Huệ, Quận 1, Hồ Chí Minh");
                ItemDto itemHCM3 = new ItemDto("Tuyến 03", "57 Nguyễn Oanh, Quận Gò Vấp, Hồ Chí Minh");
                ItemDto itemHCM4 = new ItemDto("Tuyến 04", "365 Lê Lai, Quận 1, Hồ Chí Minh");
                ItemDto itemHCM5 = new ItemDto("Tuyến 05", "212 CMT8, Quận 10, Hồ Chí Minh");
                ItemDto itemHCM6 = new ItemDto("Tuyến 06", "404 Trường Trinh, Quận Tân Bình, Hồ Chí Minh");
                ItemDto itemHCM7 = new ItemDto("Tuyến 07", "77 Cầu Ông Lãnh, Quận 4, Hồ Chí Minh");
                return Arrays.asList(itemHCM1, itemHCM2, itemHCM3, itemHCM4, itemHCM5, itemHCM6, itemHCM7);
            case HA_NOI:
                ItemDto item1 = new ItemDto("Tuyến 01", "BX Gia Lâm - BX Yên Nghĩa");
                ItemDto item2 = new ItemDto("Tuyến 02", "Bác cổ - BX Yên Nghĩa");
                ItemDto item3 = new ItemDto("Tuyến 03A", "BX Giáp Bát - BX Gia Lâm");
                ItemDto item4 = new ItemDto("Tuyến 03B", "Bx Giáp Bát - Vincom - Phúc Lợi");
                ItemDto item5 = new ItemDto("Tuyến 04", "Long Biên - BX Nước Ngầm");
                ItemDto item6 = new ItemDto("Tuyến 05", "Linh Đàm - Phú Diễn");
                ItemDto item7 = new ItemDto("Tuyến 06", "BX. Giáp Bát - Phú Minh (Phú Xuyên)");
                ItemDto item8 = new ItemDto("Tuyến 07", "Cầu Giấy - Nội Bài");
                ItemDto item9 = new ItemDto("Tuyến 08", "Long Biên - Đông Mỹ");
                return Arrays.asList(item1, item2, item3, item4, item5, item6, item7, item8, item9);
            case DA_NANG:
            case DEFAULT:
            default:
                return new ArrayList<>();
        }
    }

    public enum EPlace {
        DEFAULT(""),
        HO_CHI_MINH("HCM"),
        HA_NOI("HN"),
        DA_NANG("DN");

        String type;

        EPlace(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
