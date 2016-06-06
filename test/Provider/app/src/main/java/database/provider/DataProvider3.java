package database.provider;

import java.util.ArrayList;
import java.util.List;

import model.Country;

/**
 * Created by Latitude on 6/6/2016.
 */
public class DataProvider3 implements IDataProvider {
    @Override
    public List<Country> getCountries() {
        // TODO: Viết phương thức xử lý lấy dữ liệu từ file db trong thư mục asset
        return new ArrayList<>();
    }

    @Override
    public long insertCountry(Country country) {
        return 0;
    }
}
