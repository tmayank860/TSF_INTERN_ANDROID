package com.example.tmaya.tsf_spark_foundation;

public class UserEducationData {

    private String mUniversityName;
    private String mStreamName;
    private String mCityName;
    private String mStartYear;
    private String mEndYear;

    public UserEducationData(String mUniversityName, String mStreamName, String mCityName, String mStartYear, String mEndYear) {
        this.mUniversityName = mUniversityName;
        this.mStreamName = mStreamName;
        this.mCityName = mCityName;
        this.mStartYear = mStartYear;
        this.mEndYear = mEndYear;
    }

    public String getUniversityName() {
        return mUniversityName;
    }

    public String getStreamName() {
        return mStreamName;
    }

    public String getCityName() {
        return mCityName;
    }

    public String getStartYear() {
        return mStartYear;
    }

    public String getEndYear() {
        return mEndYear;
    }
}
