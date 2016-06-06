package database.provider;

import java.util.List;

import model.Country;

/**
 * Created by Latitude on 6/6/2016.
 */
public interface IDataProvider {
    //interface này được dùng để khai báo các phương thức sử dụng để truy xuất DB
    //hoặc dump data


    List<Country> getCountries();
    long insertCountry(Country country);

    // TODO: khai báo thêm các phương thức cần thiết khác
}
