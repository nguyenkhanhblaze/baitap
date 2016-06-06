package database.provider;

import android.content.Context;

import java.util.List;

import database.dao.CountryDAO;
import model.Country;

/**
 * Created by Latitude on 6/6/2016.
 */
public class DataProvider1 implements IDataProvider{

    Context mContext;
    CountryDAO mCountryDAO;
    public DataProvider1(Context mContext) {
        this.mContext = mContext;
        mCountryDAO = new CountryDAO(mContext);
    }
    @Override
    public List<Country> getCountries() {
        return mCountryDAO.get();
    }

    @Override
    public long insertCountry(Country country) {
        return mCountryDAO.insert(country);
    }
}
