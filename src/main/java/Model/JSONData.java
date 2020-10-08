package Model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "stationId",
        "engStnName",
        "province",
        "tcId",
        "wmoId",
        "climateId",
        "latitude",
        "longitude",
        "elevation",
        "localYear",
        "localMonth",
        "localDay",
        "localHour",
        "localMinute",
        "localDateValue",
        "ceilingVal",
        "ceilingFlg",
        "ceilingSts",
        "visibilityVal",
        "visibilityFlg",
        "visibilitySts",
        "seaLevelPressureVal",
        "seaLevelPressureFlg",
        "seaLevelPressureSts",
        "dewPointTempFlg",
        "dewPointTempSts",
        "windDirectn16Val",
        "windDirectn16Flg",
        "windDirectn16Sts",
        "windSpeedVal",
        "windSpeedFlg",
        "windSpeedSts",
        "stationPressureVal",
        "stationPressureFlg",
        "stationPressureSts",
        "dryBulbTempVal",
        "dryBulbTempFlg",
        "dryBulbTempSts",
        "wetBulbTempVal",
        "wetBulbTempFlg",
        "wetBulbTempSts",
        "relativeHumidityVal",
        "relativeHumidityFlg",
        "relativeHumiditySts",
        "totalCloudOpacityVal",
        "totalCloudAmountVal",
        "totalCloudAmountFlg",
        "totalCloudAmountSts",
        "weatherOccuringVal",
        "weatherOccuringFlg",
        "weatherOccuringSts",
        "tornadoWaterspoutFunnelVal",
        "tornadoWaterspoutFunnelFlg",
        "tornadoWaterspoutFunnelSts",
        "thunderVal",
        "thunderFlg",
        "thunderSts",
        "rainVal",
        "rainFlg",
        "rainSts",
        "rainShowersVal",
        "rainShowersFlg",
        "rainShowersSts",
        "drizzleVal",
        "drizzleFlg",
        "drizzleSts",
        "freezingRainVal",
        "freezingRainFlg",
        "freezingRainSts",
        "freezingDrizzleVal",
        "freezingDrizzleFlg",
        "freezingDrizzleSts",
        "snowVal",
        "snowFlg",
        "snowSts",
        "snowGrainsVal",
        "snowGrainsFlg",
        "snowGrainsSts",
        "iceCrystalsVal",
        "iceCrystalsFlg",
        "iceCrystalsSts",
        "icePelletsVal",
        "icePelletsFlg",
        "icePelletsSts",
        "icePelletShowersVal",
        "icePelletShowersFlg",
        "icePelletShowersSts",
        "snowShowersVal",
        "snowShowersFlg",
        "snowShowersSts",
        "snowPelletsVal",
        "snowPelletsFlg",
        "snowPelletsSts",
        "hailVal",
        "hailFlg",
        "hailSts",
        "fogVal",
        "fogFlg",
        "fogSts",
        "iceFogVal",
        "iceFogFlg",
        "iceFogSts",
        "smokeVal",
        "smokeFlg",
        "smokeSts",
        "hazeVal",
        "hazeFlg",
        "hazeSts",
        "blowingSnowVal",
        "blowingSnowFlg",
        "blowingSnowSts",
        "blowingSandVal",
        "blowingSandFlg",
        "blowingSandSts",
        "blowingDustVal",
        "blowingDustFlg",
        "blowingDustSts",
        "dustVal",
        "dustFlg",
        "dustSts",
        "lowestCloudLayerOpacityVal",
        "lowestCloudLayerOpacityFlg",
        "lowestCloudLayerOpacitySts",
        "lowestCloudLayerAmountVal",
        "lowestCloudLayerAmountFlg",
        "lowestCloudLayerAmountSts",
        "lowestCloudLayerTypeVal",
        "lowestCloudLayerTypeFlg",
        "lowestCloudLayerTypeSts",
        "lowestCloudLayerHeightVal",
        "lowestCloudLayerHeightFlg",
        "lowestCloudLayerHeightSts",
        "secondCloudLayerOpacityVal",
        "secondCloudLayerOpacityFlg",
        "secondCloudLayerOpacitySts",
        "secondCloudLayerAmountVal",
        "secondCloudLayerAmountFlg",
        "secondCloudLayerAmountSts",
        "secondCloudLayerTypeVal",
        "secondCloudLayerTypeFlg",
        "secondCloudLayerTypeSts",
        "secondCloudLayerHeightVal",
        "secondCloudLayerHeightFlg",
        "secondCloudLayerHeightSts",
        "thirdCloudLayerOpacityVal",
        "thirdCloudLayerOpacityFlg",
        "thirdCloudLayerOpacitySts",
        "thirdCloudLayerAmountVal",
        "thirdCloudLayerAmountFlg",
        "thirdCloudLayerAmountSts",
        "thirdCloudLayerTypeVal",
        "thirdCloudLayerTypeFlg",
        "thirdCloudLayerTypeSts",
        "thirdCloudLayerHeightVal",
        "thirdCloudLayerHeightFlg",
        "thirdCloudLayerHeightSts",
        "fourthCloudLayerOpacityVal",
        "fourthCloudLayerOpacityFlg",
        "fourthCloudLayerOpacitySts",
        "fourthCloudLayerAmountVal",
        "fourthCloudLayerAmountFlg",
        "fourthCloudLayerAmountSts",
        "fourthCloudLayerTypeVal",
        "fourthCloudLayerTypeFlg",
        "fourthCloudLayerTypeSts",
        "fourthCloudLayerHeightVal",
        "fourthCloudLayerHeightFlg",
        "fourthCloudLayerHeightSts",
        "windDirectn36Val",
        "windDirectn36Flg",
        "windDirectn36Sts",
        "totalPrecipVal",
        "totalPrecipFlg",
        "totalPrecipSts",
        "freezingFogVal",
        "freezingFogFlg",
        "freezingFogSts",
        "precipAmountMins0160Val",
        "precipAmountMins0160Flg",
        "precipAmountMins0160Sts",
        "precipAmountMins0115Val",
        "precipAmountMins0115Flg",
        "precipAmountMins0115Sts",
        "precipAmountMins1630Val",
        "precipAmountMins1630Flg",
        "precipAmountMins1630Sts",
        "precipAmountMins3145Val",
        "precipAmountMins3145Flg",
        "precipAmountMins3145Sts",
        "precipAmountMins4660Val",
        "precipAmountMins4660Flg",
        "precipAmountMins4660Sts",
        "precipGuageWeightAt15Val",
        "precipGuageWeightAt15Flg",
        "precipGuageWeightAt15Sts",
        "precipGuageWeightAt30Val",
        "precipGuageWeightAt30Flg",
        "precipGuageWeightAt30Sts",
        "precipGuageWeightAt45Val",
        "precipGuageWeightAt45Flg",
        "precipGuageWeightAt45Sts",
        "precipGuageWeightAt60Val",
        "precipGuageWeightAt60Flg",
        "precipGuageWeightAt60Sts",
        "windSpeed2mMins0115Val",
        "windSpeed2mMins0115Flg",
        "windSpeed2mMins0115Sts",
        "windSpeed2mMins1630Val",
        "windSpeed2mMins1630Flg",
        "windSpeed2mMins1630Sts",
        "windSpeed2mMins3145Val",
        "windSpeed2mMins3145Flg",
        "windSpeed2mMins3145Sts",
        "windSpeed2mMins4660Val",
        "windSpeed2mMins4660Flg",
        "windSpeed2mMins4660Sts",
        "snowDepthAt60Val",
        "snowDepthAt60Flg",
        "snowDepthAt60Sts",
        "snowDepthAt15Val",
        "snowDepthAt15Flg",
        "snowDepthAt15Sts",
        "snowDepthAt30Val",
        "snowDepthAt30Flg",
        "snowDepthAt30Sts",
        "snowDepthAt45Val",
        "snowDepthAt45Flg",
        "snowDepthAt45Sts",
        "windDir2mMins5960Val",
        "windDir2mMins5960Flg",
        "windDir2mMins5960Sts",
        "windSpeed2mMins5960Val",
        "windSpeed2mMins5960Flg",
        "windSpeed2mMins5960Sts",
        "altimeterVal",
        "altimeterFlg",
        "altimeterSts",
        "frthCloudLayerOpacityVal",
        "frthCloudLayerOpacityFlg",
        "frthCloudLayerOpacitySts",
        "frthCloudLayerAmountVal",
        "frthCloudLayerAmountFlg",
        "frthCloudLayerAmountSts",
        "frthCloudLayerTypeVal",
        "frthCloudLayerTypeFlg",
        "frthCloudLayerTypeSts",
        "frthCloudLayerHeightVal",
        "frthCloudLayerHeightFlg",
        "frthCloudLayerHeightSts",
        "fifthCloudLayerOpacityVal",
        "fifthCloudLayerOpacityFlg",
        "fifthCloudLayerOpacitySts",
        "fifthCloudLayerAmountVal",
        "fifthCloudLayerAmountFlg",
        "fifthCloudLayerAmountSts",
        "fifthCloudLayerTypeVal",
        "fifthCloudLayerTypeFlg",
        "fifthCloudLayerTypeSts",
        "fifthCloudLayerHeightVal",
        "fifthCloudLayerHeightFlg",
        "fifthCloudLayerHeightSts",
        "sixthCloudLayerOpacityVal",
        "sixthCloudLayerOpacityFlg",
        "sixthCloudLayerOpacitySts",
        "sixthCloudLayerAmountVal",
        "sixthCloudLayerAmountFlg",
        "sixthCloudLayerAmountSts",
        "sixthCloudLayerTypeVal",
        "sixthCloudLayerTypeFlg",
        "sixthCloudLayerTypeSts",
        "sixthCloudLayerHeightVal",
        "sixthCloudLayerHeightFlg",
        "sixthCloudLayerHeightSts",
        "windCharacterVal",
        "windCharacterFlg",
        "windCharacterSts",
        "windGustSpeedVal",
        "windGustSpeedFlg",
        "windGustSpeedSts",
        "precipitationUnclassifiedVal",
        "precipitationUnclassifiedFlg",
        "precipitationUnclassifiedSts"
})

public class JSONData {
    private String stationId;
    private String engStnName;
    private String province;
    private String tcId;
    private String wmoId;
    private String climateId;
    private String latitude;
    private String longitude;
    private String elevation;
    private String localYear;
    private String localMonth;
    private String localDay;
    private String localHour;
    private String localMinute;
    private String localDateValue;
    private String ceilingVal;
    private String ceilingFlg;
    private String ceilingSts;
    private String visibilityVal;
    private String visibilityFlg;
    private String visibilitySts;
    private String seaLevelPressureVal;
    private String seaLevelPressureFlg;
    private String seaLevelPressureSts;
    private String dewPointTempVal;
    private String dewPointTempFlg;
    private String dewPointTempSts;
    private String windDirectn16Val;
    private String windDirectn16Flg;
    private String windDirectn16Sts;
    private String windSpeedVal;
    private String windSpeedFlg;
    private String windSpeedSts;
    private String stationPressureVal;
    private String stationPressureFlg;
    private String stationPressureSts;
    private String dryBulbTempVal;
    private String dryBulbTempFlg;
    private String dryBulbTempSts;
    private String wetBulbTempVal;
    private String wetBulbTempFlg;
    private String wetBulbTempSts;
    private String relativeHumidityVal;
    private String relativeHumidityFlg;
    private String relativeHumiditySts;
    private String totalCloudOpacityVal;
    private String totalCloudOpacityFlg;
    private String totalCloudOpacitySts;
    private String totalCloudAmountVal;
    private String totalCloudAmountFlg;
    private String totalCloudAmountSts;
    private String weatherOccuringVal;
    private String weatherOccuringFlg;
    private String weatherOccuringSts;
    private String tornadoWaterspoutFunnelVal;
    private String tornadoWaterspoutFunnelFlg;
    private String tornadoWaterspoutFunnelSts;
    private String thunderVal;
    private String thunderFlg;
    private String thunderSts;
    private String rainVal;
    private String rainFlg;
    private String rainSt;
    private String rainShowersVal;
    private String rainShowersFlg;
    private String rainShowersSts;
    private String drizzleVal;
    private String drizzleFlg;
    private String drizzleSts;
    private String freezingRainVal;
    private String freezingRainFlg;
    private String freezingRainSts;
    private String freezingDrizzleVal;
    private String freezingDrizzleFlg;
    private String freezingDrizzleSts;
    private String snowVal;
    private String snowFlg;
    private String snowSts;
    private String snowGrainsVal;
    private String snowGrainsFlg;
    private String snowGrainsSts;
    private String iceCrystalsVal;
    private String iceCrystalsFlg;
    private String iceCrystalsSts;
    private String icePelletsVal;
    private String icePelletsFlg;
    private String icePelletsSts;
    private String icePelletShowersVal;
    private String icePelletShowersFlg;
    private String icePelletShowersSts;
    private String snowShowersVal;
    private String snowShowersFlg;
    private String snowShowersSts;
    private String snowPelletsVal;
    private String snowPelletsFlg;
    private String snowPelletsSts;
    private String hailVal;
    private String hailFlg;
    private String hailSts;
    private String fogVal;
    private String fogFlg;
    private String fogSts;
    private String iceFogVal;
    private String iceFogFlg;
    private String iceFogSts;
    private String smokeVal;
    private String smokeFlg;
    private String smokeSts;
    private String hazeVal;
    private String hazeFlg;
    private String hazeSts;
    private String blowingSnowVal;
    private String blowingSnowFlg;
    private String blowingSnowSts;
    private String blowingSandVal;
    private String blowingSandFlg;
    private String blowingSandSts;
    private String blowingDustVal;
    private String blowingDustFlg;
    private String blowingDustSts;
    private String dustVal;
    private String dustFlg;
    private String dustSts;
    private String lowestCloudLayerOpacityVal;
    private String lowestCloudLayerOpacityFlg;
    private String lowestCloudLayerOpacitySts;
    private String lowestCloudLayerAmountVal;
    private String lowestCloudLayerAmountFlg;
    private String lowestCloudLayerAmountSts;
    private String lowestCloudLayerTypeVal;
    private String lowestCloudLayerTypeFlg;
    private String lowestCloudLayerTypeSts;
    private String lowestCloudLayerHeightVal;
    private String lowestCloudLayerHeightFlg;
    private String lowestCloudLayerHeightSts;
    private String secondCloudLayerOpacityVal;
    private String secondCloudLayerOpacityFlg;
    private String secondCloudLayerOpacitySts;
    private String secondCloudLayerAmountVal;
    private String secondCloudLayerAmountFlg;
    private String secondCloudLayerAmountSts;
    private String secondCloudLayerTypeVal;
    private String secondCloudLayerTypeFlg;
    private String secondCloudLayerTypeSts;
    private String secondCloudLayerHeightVal;
    private String secondCloudLayerHeightFlg;
    private String secondCloudLayerHeightSts;
    private String thirdCloudLayerOpacityVal;
    private String thirdCloudLayerOpacityFlg;
    private String thirdCloudLayerOpacitySts;
    private String thirdCloudLayerAmountVal;
    private String thirdCloudLayerAmountFlg;
    private String thirdCloudLayerAmountSts;
    private String thirdCloudLayerTypeVal;
    private String thirdCloudLayerTypeFlg;
    private String thirdCloudLayerTypeSts;
    private String thirdCloudLayerHeightVal;
    private String thirdCloudLayerHeightFlg;
    private String thirdCloudLayerHeightSts;
    private String fourthCloudLayerOpacityVal;
    private String fourthCloudLayerOpacityFlg;
    private String fourthCloudLayerOpacitySts;
    private String fourthCloudLayerAmountVal;
    private String fourthCloudLayerAmountFlg;
    private String fourthCloudLayerAmountSts;
    private String fourthCloudLayerTypeVal;
    private String fourthCloudLayerTypeFlg;
    private String fourthCloudLayerTypeSts;
    private String fourthCloudLayerHeightVal;
    private String fourthCloudLayerHeightFlg;
    private String fourthCloudLayerHeightSts;
    private String windDirectn36Val;
    private String windDirectn36Flg;
    private String windDirectn36Sts;
    private String totalPrecipVal;
    private String totalPrecipFlg;
    private String totalPrecipSts;
    private String freezingFogVal;
    private String freezingFogFlg;
    private String freezingFogSts;
    private String precipAmountMins0160Val;
    private String precipAmountMins0160Flg;
    private String precipAmountMins0160Sts;
    private String precipAmountMins0115Val;
    private String precipAmountMins0115Flg;
    private String precipAmountMins0115Sts;
    private String precipAmountMins1630Val;
    private String precipAmountMins1630Flg;
    private String precipAmountMins1630Sts;
    private String precipAmountMins3145Val;
    private String precipAmountMins3145Flg;
    private String precipAmountMins3145Sts;
    private String precipAmountMins4660Val;
    private String precipAmountMins4660Flg;
    private String precipAmountMins4660Sts;
    private String precipGuageWeightAt15Val;
    private String precipGuageWeightAt15Flg;
    private String precipGuageWeightAt15Sts;
    private String precipGuageWeightAt30Val;
    private String precipGuageWeightAt30Flg;
    private String precipGuageWeightAt30Sts;
    private String precipGuageWeightAt45Val;
    private String precipGuageWeightAt45Flg;
    private String precipGuageWeightAt45Sts;
    private String precipGuageWeightAt60Val;
    private String precipGuageWeightAt60Flg;
    private String precipGuageWeightAt60Sts;
    private String windSpeed2mMins0115Val;
    private String windSpeed2mMins0115Flg;
    private String windSpeed2mMins0115Sts;
    private String windSpeed2mMins1630Val;
    private String windSpeed2mMins1630Flg;
    private String windSpeed2mMins1630Sts;
    private String windSpeed2mMins3145Val;
    private String windSpeed2mMins3145Flg;
    private String windSpeed2mMins3145Sts;
    private String windSpeed2mMins4660Val;
    private String windSpeed2mMins4660Flg;
    private String windSpeed2mMins4660Sts;
    private String snowDepthAt60Val;
    private String snowDepthAt60Flg;
    private String snowDepthAt60Sts;
    private String snowDepthAt15Val;
    private String snowDepthAt15Flg;
    private String snowDepthAt15Sts;
    private String snowDepthAt30Val;
    private String snowDepthAt30Flg;
    private String snowDepthAt30Sts;
    private String snowDepthAt45Val;
    private String snowDepthAt45Flg;
    private String snowDepthAt45Sts;
    private String windDir2mMins5960Val;
    private String windDir2mMins5960Flg;
    private String windDir2mMins5960Sts;
    private String windSpeed2mMins5960Val;
    private String windSpeed2mMins5960Flg;
    private String windSpeed2mMins5960Sts;
    private String altimeterVal;
    private String altimeterFlg;
    private String altimeterSts;
    private String frthCloudLayerOpacityVal;
    private String frthCloudLayerOpacityFlg;
    private String frthCloudLayerOpacitySts;
    private String frthCloudLayerAmountVal;
    private String frthCloudLayerAmountFlg;
    private String frthCloudLayerAmountSts;
    private String frthCloudLayerTypeVal;
    private String frthCloudLayerTypeFlg;
    private String frthCloudLayerTypeSts;
    private String frthCloudLayerHeightVal;
    private String frthCloudLayerHeightFlg;
    private String frthCloudLayerHeightSts;
    private String fifthCloudLayerOpacityVal;
    private String fifthCloudLayerOpacityFlg;
    private String fifthCloudLayerOpacitySts;
    private String fifthCloudLayerAmountVal;
    private String fifthCloudLayerAmountFlg;
    private String fifthCloudLayerAmountSts;
    private String fifthCloudLayerTypeVal;
    private String fifthCloudLayerTypeFlg;
    private String fifthCloudLayerTypeSts;
    private String fifthCloudLayerHeightVal;
    private String fifthCloudLayerHeightFlg;
    private String fifthCloudLayerHeightSts;
    private String sixthCloudLayerOpacityVal;
    private String sixthCloudLayerOpacityFlg;
    private String sixthCloudLayerOpacitySts;
    private String sixthCloudLayerAmountVal;
    private String sixthCloudLayerAmountFlg;
    private String sixthCloudLayerAmountSts;
    private String sixthCloudLayerTypeVal;
    private String sixthCloudLayerTypeFlg;
    private String sixthCloudLayerTypeSts;
    private String sixthCloudLayerHeightVal;
    private String sixthCloudLayerHeightFlg;
    private String sixthCloudLayerHeightSts;
    private String windCharacterVal;
    private String windCharacterFlg;
    private String windCharacterSts;
    private String windGustSpeedVal;
    private String windGustSpeedFlg;
    private String windGustSpeedSts;
    private String precipitationUnclassifiedVal;
    private String precipitationUnclassifiedFlg;
    private String precipitationUnclassifiedSts;

    public JSONData() {

    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getEngStnName() {
        return engStnName;
    }

    public void setEngStnName(String engStnName) {
        this.engStnName = engStnName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getTcId() {
        return tcId;
    }

    public void setTcId(String tcId) {
        this.tcId = tcId;
    }

    public String getWmoId() {
        return wmoId;
    }

    public void setWmoId(String wmoId) {
        this.wmoId = wmoId;
    }

    public String getClimateId() {
        return climateId;
    }

    public void setClimateId(String climateId) {
        this.climateId = climateId;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

    public String getLocalYear() {
        return localYear;
    }

    public void setLocalYear(String localYear) {
        this.localYear = localYear;
    }

    public String getLocalMonth() {
        return localMonth;
    }

    public void setLocalMonth(String localMonth) {
        this.localMonth = localMonth;
    }

    public String getLocalDay() {
        return localDay;
    }

    public void setLocalDay(String localDay) {
        this.localDay = localDay;
    }

    public String getLocalHour() {
        return localHour;
    }

    public void setLocalHour(String localHour) {
        this.localHour = localHour;
    }

    public String getLocalMinute() {
        return localMinute;
    }

    public void setLocalMinute(String localMinute) {
        this.localMinute = localMinute;
    }

    public String getLocalDateValue() {
        return localDateValue;
    }

    public void setLocalDateValue(String localDateValue) {
        this.localDateValue = localDateValue;
    }

    public String getCeilingVal() {
        return ceilingVal;
    }

    public void setCeilingVal(String ceilingVal) {
        this.ceilingVal = ceilingVal;
    }

    public String getCeilingFlg() {
        return ceilingFlg;
    }

    public void setCeilingFlg(String ceilingFlg) {
        this.ceilingFlg = ceilingFlg;
    }

    public String getCeilingSts() {
        return ceilingSts;
    }

    public void setCeilingSts(String ceilingSts) {
        this.ceilingSts = ceilingSts;
    }

    public String getVisibilityVal() {
        return visibilityVal;
    }

    public void setVisibilityVal(String visibilityVal) {
        this.visibilityVal = visibilityVal;
    }

    public String getVisibilityFlg() {
        return visibilityFlg;
    }

    public void setVisibilityFlg(String visibilityFlg) {
        this.visibilityFlg = visibilityFlg;
    }

    public String getVisibilitySts() {
        return visibilitySts;
    }

    public void setVisibilitySts(String visibilitySts) {
        this.visibilitySts = visibilitySts;
    }

    public String getSeaLevelPressureVal() {
        return seaLevelPressureVal;
    }

    public void setSeaLevelPressureVal(String seaLevelPressureVal) {
        this.seaLevelPressureVal = seaLevelPressureVal;
    }

    public String getSeaLevelPressureFlg() {
        return seaLevelPressureFlg;
    }

    public void setSeaLevelPressureFlg(String seaLevelPressureFlg) {
        this.seaLevelPressureFlg = seaLevelPressureFlg;
    }

    public String getSeaLevelPressureSts() {
        return seaLevelPressureSts;
    }

    public void setSeaLevelPressureSts(String seaLevelPressureSts) {
        this.seaLevelPressureSts = seaLevelPressureSts;
    }

    public String getDewPointTempVal() {
        return dewPointTempVal;
    }

    public void setDewPointTempVal(String dewPointTempVal) {
        this.dewPointTempVal = dewPointTempVal;
    }

    public String getDewPointTempFlg() {
        return dewPointTempFlg;
    }

    public void setDewPointTempFlg(String dewPointTempFlg) {
        this.dewPointTempFlg = dewPointTempFlg;
    }

    public String getDewPointTempSts() {
        return dewPointTempSts;
    }

    public void setDewPointTempSts(String dewPointTempSts) {
        this.dewPointTempSts = dewPointTempSts;
    }

    public String getWindDirectn16Val() {
        return windDirectn16Val;
    }

    public void setWindDirectn16Val(String windDirectn16Val) {
        this.windDirectn16Val = windDirectn16Val;
    }

    public String getWindDirectn16Flg() {
        return windDirectn16Flg;
    }

    public void setWindDirectn16Flg(String windDirectn16Flg) {
        this.windDirectn16Flg = windDirectn16Flg;
    }

    public String getWindDirectn16Sts() {
        return windDirectn16Sts;
    }

    public void setWindDirectn16Sts(String windDirectn16Sts) {
        this.windDirectn16Sts = windDirectn16Sts;
    }

    public String getWindSpeedVal() {
        return windSpeedVal;
    }

    public void setWindSpeedVal(String windSpeedVal) {
        this.windSpeedVal = windSpeedVal;
    }

    public String getWindSpeedFlg() {
        return windSpeedFlg;
    }

    public void setWindSpeedFlg(String windSpeedFlg) {
        this.windSpeedFlg = windSpeedFlg;
    }

    public String getWindSpeedSts() {
        return windSpeedSts;
    }

    public void setWindSpeedSts(String windSpeedSts) {
        this.windSpeedSts = windSpeedSts;
    }

    public String getStationPressureVal() {
        return stationPressureVal;
    }

    public void setStationPressureVal(String stationPressureVal) {
        this.stationPressureVal = stationPressureVal;
    }

    public String getStationPressureFlg() {
        return stationPressureFlg;
    }

    public void setStationPressureFlg(String stationPressureFlg) {
        this.stationPressureFlg = stationPressureFlg;
    }

    public String getStationPressureSts() {
        return stationPressureSts;
    }

    public void setStationPressureSts(String stationPressureSts) {
        this.stationPressureSts = stationPressureSts;
    }

    public String getDryBulbTempVal() {
        return dryBulbTempVal;
    }

    public void setDryBulbTempVal(String dryBulbTempVal) {
        this.dryBulbTempVal = dryBulbTempVal;
    }

    public String getDryBulbTempFlg() {
        return dryBulbTempFlg;
    }

    public void setDryBulbTempFlg(String dryBulbTempFlg) {
        this.dryBulbTempFlg = dryBulbTempFlg;
    }

    public String getDryBulbTempSts() {
        return dryBulbTempSts;
    }

    public void setDryBulbTempSts(String dryBulbTempSts) {
        this.dryBulbTempSts = dryBulbTempSts;
    }

    public String getWetBulbTempVal() {
        return wetBulbTempVal;
    }

    public void setWetBulbTempVal(String wetBulbTempVal) {
        this.wetBulbTempVal = wetBulbTempVal;
    }

    public String getWetBulbTempFlg() {
        return wetBulbTempFlg;
    }

    public void setWetBulbTempFlg(String wetBulbTempFlg) {
        this.wetBulbTempFlg = wetBulbTempFlg;
    }

    public String getWetBulbTempSts() {
        return wetBulbTempSts;
    }

    public void setWetBulbTempSts(String wetBulbTempSts) {
        this.wetBulbTempSts = wetBulbTempSts;
    }

    public String getRelativeHumidityVal() {
        return relativeHumidityVal;
    }

    public void setRelativeHumidityVal(String relativeHumidityVal) {
        this.relativeHumidityVal = relativeHumidityVal;
    }

    public String getRelativeHumidityFlg() {
        return relativeHumidityFlg;
    }

    public void setRelativeHumidityFlg(String relativeHumidityFlg) {
        this.relativeHumidityFlg = relativeHumidityFlg;
    }

    public String getRelativeHumiditySts() {
        return relativeHumiditySts;
    }

    public void setRelativeHumiditySts(String relativeHumiditySts) {
        this.relativeHumiditySts = relativeHumiditySts;
    }

    public String getTotalCloudOpacityVal() {
        return totalCloudOpacityVal;
    }

    public void setTotalCloudOpacityVal(String totalCloudOpacityVal) {
        this.totalCloudOpacityVal = totalCloudOpacityVal;
    }

    public String getTotalCloudOpacityFlg() {
        return totalCloudOpacityFlg;
    }

    public void setTotalCloudOpacityFlg(String totalCloudOpacityFlg) {
        this.totalCloudOpacityFlg = totalCloudOpacityFlg;
    }

    public String getTotalCloudOpacitySts() {
        return totalCloudOpacitySts;
    }

    public void setTotalCloudOpacitySts(String totalCloudOpacitySts) {
        this.totalCloudOpacitySts = totalCloudOpacitySts;
    }

    public String getTotalCloudAmountVal() {
        return totalCloudAmountVal;
    }

    public void setTotalCloudAmountVal(String totalCloudAmountVal) {
        this.totalCloudAmountVal = totalCloudAmountVal;
    }

    public String getTotalCloudAmountFlg() {
        return totalCloudAmountFlg;
    }

    public void setTotalCloudAmountFlg(String totalCloudAmountFlg) {
        this.totalCloudAmountFlg = totalCloudAmountFlg;
    }

    public String getTotalCloudAmountSts() {
        return totalCloudAmountSts;
    }

    public void setTotalCloudAmountSts(String totalCloudAmountSts) {
        this.totalCloudAmountSts = totalCloudAmountSts;
    }

    public String getWeatherOccuringVal() {
        return weatherOccuringVal;
    }

    public void setWeatherOccuringVal(String weatherOccuringVal) {
        this.weatherOccuringVal = weatherOccuringVal;
    }

    public String getWeatherOccuringFlg() {
        return weatherOccuringFlg;
    }

    public void setWeatherOccuringFlg(String weatherOccuringFlg) {
        this.weatherOccuringFlg = weatherOccuringFlg;
    }

    public String getWeatherOccuringSts() {
        return weatherOccuringSts;
    }

    public void setWeatherOccuringSts(String weatherOccuringSts) {
        this.weatherOccuringSts = weatherOccuringSts;
    }

    public String getTornadoWaterspoutFunnelVal() {
        return tornadoWaterspoutFunnelVal;
    }

    public void setTornadoWaterspoutFunnelVal(String tornadoWaterspoutFunnelVal) {
        this.tornadoWaterspoutFunnelVal = tornadoWaterspoutFunnelVal;
    }

    public String getTornadoWaterspoutFunnelFlg() {
        return tornadoWaterspoutFunnelFlg;
    }

    public void setTornadoWaterspoutFunnelFlg(String tornadoWaterspoutFunnelFlg) {
        this.tornadoWaterspoutFunnelFlg = tornadoWaterspoutFunnelFlg;
    }

    public String getTornadoWaterspoutFunnelSts() {
        return tornadoWaterspoutFunnelSts;
    }

    public void setTornadoWaterspoutFunnelSts(String tornadoWaterspoutFunnelSts) {
        this.tornadoWaterspoutFunnelSts = tornadoWaterspoutFunnelSts;
    }

    public String getThunderVal() {
        return thunderVal;
    }

    public void setThunderVal(String thunderVal) {
        this.thunderVal = thunderVal;
    }

    public String getThunderFlg() {
        return thunderFlg;
    }

    public void setThunderFlg(String thunderFlg) {
        this.thunderFlg = thunderFlg;
    }

    public String getThunderSts() {
        return thunderSts;
    }

    public void setThunderSts(String thunderSts) {
        this.thunderSts = thunderSts;
    }

    public String getRainVal() {
        return rainVal;
    }

    public void setRainVal(String rainVal) {
        this.rainVal = rainVal;
    }

    public String getRainFlg() {
        return rainFlg;
    }

    public void setRainFlg(String rainFlg) {
        this.rainFlg = rainFlg;
    }

    public String getRainSt() {
        return rainSt;
    }

    public void setRainSt(String rainSt) {
        this.rainSt = rainSt;
    }

    public String getRainShowersVal() {
        return rainShowersVal;
    }

    public void setRainShowersVal(String rainShowersVal) {
        this.rainShowersVal = rainShowersVal;
    }

    public String getRainShowersFlg() {
        return rainShowersFlg;
    }

    public void setRainShowersFlg(String rainShowersFlg) {
        this.rainShowersFlg = rainShowersFlg;
    }

    public String getRainShowersSts() {
        return rainShowersSts;
    }

    public void setRainShowersSts(String rainShowersSts) {
        this.rainShowersSts = rainShowersSts;
    }

    public String getDrizzleVal() {
        return drizzleVal;
    }

    public void setDrizzleVal(String drizzleVal) {
        this.drizzleVal = drizzleVal;
    }

    public String getDrizzleFlg() {
        return drizzleFlg;
    }

    public void setDrizzleFlg(String drizzleFlg) {
        this.drizzleFlg = drizzleFlg;
    }

    public String getDrizzleSts() {
        return drizzleSts;
    }

    public void setDrizzleSts(String drizzleSts) {
        this.drizzleSts = drizzleSts;
    }

    public String getFreezingRainVal() {
        return freezingRainVal;
    }

    public void setFreezingRainVal(String freezingRainVal) {
        this.freezingRainVal = freezingRainVal;
    }

    public String getFreezingRainFlg() {
        return freezingRainFlg;
    }

    public void setFreezingRainFlg(String freezingRainFlg) {
        this.freezingRainFlg = freezingRainFlg;
    }

    public String getFreezingRainSts() {
        return freezingRainSts;
    }

    public void setFreezingRainSts(String freezingRainSts) {
        this.freezingRainSts = freezingRainSts;
    }

    public String getFreezingDrizzleVal() {
        return freezingDrizzleVal;
    }

    public void setFreezingDrizzleVal(String freezingDrizzleVal) {
        this.freezingDrizzleVal = freezingDrizzleVal;
    }

    public String getFreezingDrizzleFlg() {
        return freezingDrizzleFlg;
    }

    public void setFreezingDrizzleFlg(String freezingDrizzleFlg) {
        this.freezingDrizzleFlg = freezingDrizzleFlg;
    }

    public String getFreezingDrizzleSts() {
        return freezingDrizzleSts;
    }

    public void setFreezingDrizzleSts(String freezingDrizzleSts) {
        this.freezingDrizzleSts = freezingDrizzleSts;
    }

    public String getSnowVal() {
        return snowVal;
    }

    public void setSnowVal(String snowVal) {
        this.snowVal = snowVal;
    }

    public String getSnowFlg() {
        return snowFlg;
    }

    public void setSnowFlg(String snowFlg) {
        this.snowFlg = snowFlg;
    }

    public String getSnowSts() {
        return snowSts;
    }

    public void setSnowSts(String snowSts) {
        this.snowSts = snowSts;
    }

    public String getSnowGrainsVal() {
        return snowGrainsVal;
    }

    public void setSnowGrainsVal(String snowGrainsVal) {
        this.snowGrainsVal = snowGrainsVal;
    }

    public String getSnowGrainsFlg() {
        return snowGrainsFlg;
    }

    public void setSnowGrainsFlg(String snowGrainsFlg) {
        this.snowGrainsFlg = snowGrainsFlg;
    }

    public String getSnowGrainsSts() {
        return snowGrainsSts;
    }

    public void setSnowGrainsSts(String snowGrainsSts) {
        this.snowGrainsSts = snowGrainsSts;
    }

    public String getIceCrystalsVal() {
        return iceCrystalsVal;
    }

    public void setIceCrystalsVal(String iceCrystalsVal) {
        this.iceCrystalsVal = iceCrystalsVal;
    }

    public String getIceCrystalsFlg() {
        return iceCrystalsFlg;
    }

    public void setIceCrystalsFlg(String iceCrystalsFlg) {
        this.iceCrystalsFlg = iceCrystalsFlg;
    }

    public String getIceCrystalsSts() {
        return iceCrystalsSts;
    }

    public void setIceCrystalsSts(String iceCrystalsSts) {
        this.iceCrystalsSts = iceCrystalsSts;
    }

    public String getIcePelletsVal() {
        return icePelletsVal;
    }

    public void setIcePelletsVal(String icePelletsVal) {
        this.icePelletsVal = icePelletsVal;
    }

    public String getIcePelletsFlg() {
        return icePelletsFlg;
    }

    public void setIcePelletsFlg(String icePelletsFlg) {
        this.icePelletsFlg = icePelletsFlg;
    }

    public String getIcePelletsSts() {
        return icePelletsSts;
    }

    public void setIcePelletsSts(String icePelletsSts) {
        this.icePelletsSts = icePelletsSts;
    }

    public String getIcePelletShowersVal() {
        return icePelletShowersVal;
    }

    public void setIcePelletShowersVal(String icePelletShowersVal) {
        this.icePelletShowersVal = icePelletShowersVal;
    }

    public String getIcePelletShowersFlg() {
        return icePelletShowersFlg;
    }

    public void setIcePelletShowersFlg(String icePelletShowersFlg) {
        this.icePelletShowersFlg = icePelletShowersFlg;
    }

    public String getIcePelletShowersSts() {
        return icePelletShowersSts;
    }

    public void setIcePelletShowersSts(String icePelletShowersSts) {
        this.icePelletShowersSts = icePelletShowersSts;
    }

    public String getSnowShowersVal() {
        return snowShowersVal;
    }

    public void setSnowShowersVal(String snowShowersVal) {
        this.snowShowersVal = snowShowersVal;
    }

    public String getSnowShowersFlg() {
        return snowShowersFlg;
    }

    public void setSnowShowersFlg(String snowShowersFlg) {
        this.snowShowersFlg = snowShowersFlg;
    }

    public String getSnowShowersSts() {
        return snowShowersSts;
    }

    public void setSnowShowersSts(String snowShowersSts) {
        this.snowShowersSts = snowShowersSts;
    }

    public String getSnowPelletsVal() {
        return snowPelletsVal;
    }

    public void setSnowPelletsVal(String snowPelletsVal) {
        this.snowPelletsVal = snowPelletsVal;
    }

    public String getSnowPelletsFlg() {
        return snowPelletsFlg;
    }

    public void setSnowPelletsFlg(String snowPelletsFlg) {
        this.snowPelletsFlg = snowPelletsFlg;
    }

    public String getSnowPelletsSts() {
        return snowPelletsSts;
    }

    public void setSnowPelletsSts(String snowPelletsSts) {
        this.snowPelletsSts = snowPelletsSts;
    }

    public String getHailVal() {
        return hailVal;
    }

    public void setHailVal(String hailVal) {
        this.hailVal = hailVal;
    }

    public String getHailFlg() {
        return hailFlg;
    }

    public void setHailFlg(String hailFlg) {
        this.hailFlg = hailFlg;
    }

    public String getHailSts() {
        return hailSts;
    }

    public void setHailSts(String hailSts) {
        this.hailSts = hailSts;
    }

    public String getFogVal() {
        return fogVal;
    }

    public void setFogVal(String fogVal) {
        this.fogVal = fogVal;
    }

    public String getFogFlg() {
        return fogFlg;
    }

    public void setFogFlg(String fogFlg) {
        this.fogFlg = fogFlg;
    }

    public String getFogSts() {
        return fogSts;
    }

    public void setFogSts(String fogSts) {
        this.fogSts = fogSts;
    }

    public String getIceFogVal() {
        return iceFogVal;
    }

    public void setIceFogVal(String iceFogVal) {
        this.iceFogVal = iceFogVal;
    }

    public String getIceFogFlg() {
        return iceFogFlg;
    }

    public void setIceFogFlg(String iceFogFlg) {
        this.iceFogFlg = iceFogFlg;
    }

    public String getIceFogSts() {
        return iceFogSts;
    }

    public void setIceFogSts(String iceFogSts) {
        this.iceFogSts = iceFogSts;
    }

    public String getSmokeVal() {
        return smokeVal;
    }

    public void setSmokeVal(String smokeVal) {
        this.smokeVal = smokeVal;
    }

    public String getSmokeFlg() {
        return smokeFlg;
    }

    public void setSmokeFlg(String smokeFlg) {
        this.smokeFlg = smokeFlg;
    }

    public String getSmokeSts() {
        return smokeSts;
    }

    public void setSmokeSts(String smokeSts) {
        this.smokeSts = smokeSts;
    }

    public String getHazeVal() {
        return hazeVal;
    }

    public void setHazeVal(String hazeVal) {
        this.hazeVal = hazeVal;
    }

    public String getHazeFlg() {
        return hazeFlg;
    }

    public void setHazeFlg(String hazeFlg) {
        this.hazeFlg = hazeFlg;
    }

    public String getHazeSts() {
        return hazeSts;
    }

    public void setHazeSts(String hazeSts) {
        this.hazeSts = hazeSts;
    }

    public String getBlowingSnowVal() {
        return blowingSnowVal;
    }

    public void setBlowingSnowVal(String blowingSnowVal) {
        this.blowingSnowVal = blowingSnowVal;
    }

    public String getBlowingSnowFlg() {
        return blowingSnowFlg;
    }

    public void setBlowingSnowFlg(String blowingSnowFlg) {
        this.blowingSnowFlg = blowingSnowFlg;
    }

    public String getBlowingSnowSts() {
        return blowingSnowSts;
    }

    public void setBlowingSnowSts(String blowingSnowSts) {
        this.blowingSnowSts = blowingSnowSts;
    }

    public String getBlowingSandVal() {
        return blowingSandVal;
    }

    public void setBlowingSandVal(String blowingSandVal) {
        this.blowingSandVal = blowingSandVal;
    }

    public String getBlowingSandFlg() {
        return blowingSandFlg;
    }

    public void setBlowingSandFlg(String blowingSandFlg) {
        this.blowingSandFlg = blowingSandFlg;
    }

    public String getBlowingSandSts() {
        return blowingSandSts;
    }

    public void setBlowingSandSts(String blowingSandSts) {
        this.blowingSandSts = blowingSandSts;
    }

    public String getBlowingDustVal() {
        return blowingDustVal;
    }

    public void setBlowingDustVal(String blowingDustVal) {
        this.blowingDustVal = blowingDustVal;
    }

    public String getBlowingDustFlg() {
        return blowingDustFlg;
    }

    public void setBlowingDustFlg(String blowingDustFlg) {
        this.blowingDustFlg = blowingDustFlg;
    }

    public String getBlowingDustSts() {
        return blowingDustSts;
    }

    public void setBlowingDustSts(String blowingDustSts) {
        this.blowingDustSts = blowingDustSts;
    }

    public String getDustVal() {
        return dustVal;
    }

    public void setDustVal(String dustVal) {
        this.dustVal = dustVal;
    }

    public String getDustFlg() {
        return dustFlg;
    }

    public void setDustFlg(String dustFlg) {
        this.dustFlg = dustFlg;
    }

    public String getDustSts() {
        return dustSts;
    }

    public void setDustSts(String dustSts) {
        this.dustSts = dustSts;
    }

    public String getLowestCloudLayerOpacityVal() {
        return lowestCloudLayerOpacityVal;
    }

    public void setLowestCloudLayerOpacityVal(String lowestCloudLayerOpacityVal) {
        this.lowestCloudLayerOpacityVal = lowestCloudLayerOpacityVal;
    }

    public String getLowestCloudLayerOpacityFlg() {
        return lowestCloudLayerOpacityFlg;
    }

    public void setLowestCloudLayerOpacityFlg(String lowestCloudLayerOpacityFlg) {
        this.lowestCloudLayerOpacityFlg = lowestCloudLayerOpacityFlg;
    }

    public String getLowestCloudLayerOpacitySts() {
        return lowestCloudLayerOpacitySts;
    }

    public void setLowestCloudLayerOpacitySts(String lowestCloudLayerOpacitySts) {
        this.lowestCloudLayerOpacitySts = lowestCloudLayerOpacitySts;
    }

    public String getLowestCloudLayerAmountVal() {
        return lowestCloudLayerAmountVal;
    }

    public void setLowestCloudLayerAmountVal(String lowestCloudLayerAmountVal) {
        this.lowestCloudLayerAmountVal = lowestCloudLayerAmountVal;
    }

    public String getLowestCloudLayerAmountFlg() {
        return lowestCloudLayerAmountFlg;
    }

    public void setLowestCloudLayerAmountFlg(String lowestCloudLayerAmountFlg) {
        this.lowestCloudLayerAmountFlg = lowestCloudLayerAmountFlg;
    }

    public String getLowestCloudLayerAmountSts() {
        return lowestCloudLayerAmountSts;
    }

    public void setLowestCloudLayerAmountSts(String lowestCloudLayerAmountSts) {
        this.lowestCloudLayerAmountSts = lowestCloudLayerAmountSts;
    }

    public String getLowestCloudLayerTypeVal() {
        return lowestCloudLayerTypeVal;
    }

    public void setLowestCloudLayerTypeVal(String lowestCloudLayerTypeVal) {
        this.lowestCloudLayerTypeVal = lowestCloudLayerTypeVal;
    }

    public String getLowestCloudLayerTypeFlg() {
        return lowestCloudLayerTypeFlg;
    }

    public void setLowestCloudLayerTypeFlg(String lowestCloudLayerTypeFlg) {
        this.lowestCloudLayerTypeFlg = lowestCloudLayerTypeFlg;
    }

    public String getLowestCloudLayerTypeSts() {
        return lowestCloudLayerTypeSts;
    }

    public void setLowestCloudLayerTypeSts(String lowestCloudLayerTypeSts) {
        this.lowestCloudLayerTypeSts = lowestCloudLayerTypeSts;
    }

    public String getLowestCloudLayerHeightVal() {
        return lowestCloudLayerHeightVal;
    }

    public void setLowestCloudLayerHeightVal(String lowestCloudLayerHeightVal) {
        this.lowestCloudLayerHeightVal = lowestCloudLayerHeightVal;
    }

    public String getLowestCloudLayerHeightFlg() {
        return lowestCloudLayerHeightFlg;
    }

    public void setLowestCloudLayerHeightFlg(String lowestCloudLayerHeightFlg) {
        this.lowestCloudLayerHeightFlg = lowestCloudLayerHeightFlg;
    }

    public String getLowestCloudLayerHeightSts() {
        return lowestCloudLayerHeightSts;
    }

    public void setLowestCloudLayerHeightSts(String lowestCloudLayerHeightSts) {
        this.lowestCloudLayerHeightSts = lowestCloudLayerHeightSts;
    }

    public String getSecondCloudLayerOpacityVal() {
        return secondCloudLayerOpacityVal;
    }

    public void setSecondCloudLayerOpacityVal(String secondCloudLayerOpacityVal) {
        this.secondCloudLayerOpacityVal = secondCloudLayerOpacityVal;
    }

    public String getSecondCloudLayerOpacityFlg() {
        return secondCloudLayerOpacityFlg;
    }

    public void setSecondCloudLayerOpacityFlg(String secondCloudLayerOpacityFlg) {
        this.secondCloudLayerOpacityFlg = secondCloudLayerOpacityFlg;
    }

    public String getSecondCloudLayerOpacitySts() {
        return secondCloudLayerOpacitySts;
    }

    public void setSecondCloudLayerOpacitySts(String secondCloudLayerOpacitySts) {
        this.secondCloudLayerOpacitySts = secondCloudLayerOpacitySts;
    }

    public String getSecondCloudLayerAmountVal() {
        return secondCloudLayerAmountVal;
    }

    public void setSecondCloudLayerAmountVal(String secondCloudLayerAmountVal) {
        this.secondCloudLayerAmountVal = secondCloudLayerAmountVal;
    }

    public String getSecondCloudLayerAmountFlg() {
        return secondCloudLayerAmountFlg;
    }

    public void setSecondCloudLayerAmountFlg(String secondCloudLayerAmountFlg) {
        this.secondCloudLayerAmountFlg = secondCloudLayerAmountFlg;
    }

    public String getSecondCloudLayerAmountSts() {
        return secondCloudLayerAmountSts;
    }

    public void setSecondCloudLayerAmountSts(String secondCloudLayerAmountSts) {
        this.secondCloudLayerAmountSts = secondCloudLayerAmountSts;
    }

    public String getSecondCloudLayerTypeVal() {
        return secondCloudLayerTypeVal;
    }

    public void setSecondCloudLayerTypeVal(String secondCloudLayerTypeVal) {
        this.secondCloudLayerTypeVal = secondCloudLayerTypeVal;
    }

    public String getSecondCloudLayerTypeFlg() {
        return secondCloudLayerTypeFlg;
    }

    public void setSecondCloudLayerTypeFlg(String secondCloudLayerTypeFlg) {
        this.secondCloudLayerTypeFlg = secondCloudLayerTypeFlg;
    }

    public String getSecondCloudLayerTypeSts() {
        return secondCloudLayerTypeSts;
    }

    public void setSecondCloudLayerTypeSts(String secondCloudLayerTypeSts) {
        this.secondCloudLayerTypeSts = secondCloudLayerTypeSts;
    }

    public String getSecondCloudLayerHeightVal() {
        return secondCloudLayerHeightVal;
    }

    public void setSecondCloudLayerHeightVal(String secondCloudLayerHeightVal) {
        this.secondCloudLayerHeightVal = secondCloudLayerHeightVal;
    }

    public String getSecondCloudLayerHeightFlg() {
        return secondCloudLayerHeightFlg;
    }

    public void setSecondCloudLayerHeightFlg(String secondCloudLayerHeightFlg) {
        this.secondCloudLayerHeightFlg = secondCloudLayerHeightFlg;
    }

    public String getSecondCloudLayerHeightSts() {
        return secondCloudLayerHeightSts;
    }

    public void setSecondCloudLayerHeightSts(String secondCloudLayerHeightSts) {
        this.secondCloudLayerHeightSts = secondCloudLayerHeightSts;
    }

    public String getThirdCloudLayerOpacityVal() {
        return thirdCloudLayerOpacityVal;
    }

    public void setThirdCloudLayerOpacityVal(String thirdCloudLayerOpacityVal) {
        this.thirdCloudLayerOpacityVal = thirdCloudLayerOpacityVal;
    }

    public String getThirdCloudLayerOpacityFlg() {
        return thirdCloudLayerOpacityFlg;
    }

    public void setThirdCloudLayerOpacityFlg(String thirdCloudLayerOpacityFlg) {
        this.thirdCloudLayerOpacityFlg = thirdCloudLayerOpacityFlg;
    }

    public String getThirdCloudLayerOpacitySts() {
        return thirdCloudLayerOpacitySts;
    }

    public void setThirdCloudLayerOpacitySts(String thirdCloudLayerOpacitySts) {
        this.thirdCloudLayerOpacitySts = thirdCloudLayerOpacitySts;
    }

    public String getThirdCloudLayerAmountVal() {
        return thirdCloudLayerAmountVal;
    }

    public void setThirdCloudLayerAmountVal(String thirdCloudLayerAmountVal) {
        this.thirdCloudLayerAmountVal = thirdCloudLayerAmountVal;
    }

    public String getThirdCloudLayerAmountFlg() {
        return thirdCloudLayerAmountFlg;
    }

    public void setThirdCloudLayerAmountFlg(String thirdCloudLayerAmountFlg) {
        this.thirdCloudLayerAmountFlg = thirdCloudLayerAmountFlg;
    }

    public String getThirdCloudLayerAmountSts() {
        return thirdCloudLayerAmountSts;
    }

    public void setThirdCloudLayerAmountSts(String thirdCloudLayerAmountSts) {
        this.thirdCloudLayerAmountSts = thirdCloudLayerAmountSts;
    }

    public String getThirdCloudLayerTypeVal() {
        return thirdCloudLayerTypeVal;
    }

    public void setThirdCloudLayerTypeVal(String thirdCloudLayerTypeVal) {
        this.thirdCloudLayerTypeVal = thirdCloudLayerTypeVal;
    }

    public String getThirdCloudLayerTypeFlg() {
        return thirdCloudLayerTypeFlg;
    }

    public void setThirdCloudLayerTypeFlg(String thirdCloudLayerTypeFlg) {
        this.thirdCloudLayerTypeFlg = thirdCloudLayerTypeFlg;
    }

    public String getThirdCloudLayerTypeSts() {
        return thirdCloudLayerTypeSts;
    }

    public void setThirdCloudLayerTypeSts(String thirdCloudLayerTypeSts) {
        this.thirdCloudLayerTypeSts = thirdCloudLayerTypeSts;
    }

    public String getThirdCloudLayerHeightVal() {
        return thirdCloudLayerHeightVal;
    }

    public void setThirdCloudLayerHeightVal(String thirdCloudLayerHeightVal) {
        this.thirdCloudLayerHeightVal = thirdCloudLayerHeightVal;
    }

    public String getThirdCloudLayerHeightFlg() {
        return thirdCloudLayerHeightFlg;
    }

    public void setThirdCloudLayerHeightFlg(String thirdCloudLayerHeightFlg) {
        this.thirdCloudLayerHeightFlg = thirdCloudLayerHeightFlg;
    }

    public String getThirdCloudLayerHeightSts() {
        return thirdCloudLayerHeightSts;
    }

    public void setThirdCloudLayerHeightSts(String thirdCloudLayerHeightSts) {
        this.thirdCloudLayerHeightSts = thirdCloudLayerHeightSts;
    }

    public String getFourthCloudLayerOpacityVal() {
        return fourthCloudLayerOpacityVal;
    }

    public void setFourthCloudLayerOpacityVal(String fourthCloudLayerOpacityVal) {
        this.fourthCloudLayerOpacityVal = fourthCloudLayerOpacityVal;
    }

    public String getFourthCloudLayerOpacityFlg() {
        return fourthCloudLayerOpacityFlg;
    }

    public void setFourthCloudLayerOpacityFlg(String fourthCloudLayerOpacityFlg) {
        this.fourthCloudLayerOpacityFlg = fourthCloudLayerOpacityFlg;
    }

    public String getFourthCloudLayerOpacitySts() {
        return fourthCloudLayerOpacitySts;
    }

    public void setFourthCloudLayerOpacitySts(String fourthCloudLayerOpacitySts) {
        this.fourthCloudLayerOpacitySts = fourthCloudLayerOpacitySts;
    }

    public String getFourthCloudLayerAmountVal() {
        return fourthCloudLayerAmountVal;
    }

    public void setFourthCloudLayerAmountVal(String fourthCloudLayerAmountVal) {
        this.fourthCloudLayerAmountVal = fourthCloudLayerAmountVal;
    }

    public String getFourthCloudLayerAmountFlg() {
        return fourthCloudLayerAmountFlg;
    }

    public void setFourthCloudLayerAmountFlg(String fourthCloudLayerAmountFlg) {
        this.fourthCloudLayerAmountFlg = fourthCloudLayerAmountFlg;
    }

    public String getFourthCloudLayerAmountSts() {
        return fourthCloudLayerAmountSts;
    }

    public void setFourthCloudLayerAmountSts(String fourthCloudLayerAmountSts) {
        this.fourthCloudLayerAmountSts = fourthCloudLayerAmountSts;
    }

    public String getFourthCloudLayerTypeVal() {
        return fourthCloudLayerTypeVal;
    }

    public void setFourthCloudLayerTypeVal(String fourthCloudLayerTypeVal) {
        this.fourthCloudLayerTypeVal = fourthCloudLayerTypeVal;
    }

    public String getFourthCloudLayerTypeFlg() {
        return fourthCloudLayerTypeFlg;
    }

    public void setFourthCloudLayerTypeFlg(String fourthCloudLayerTypeFlg) {
        this.fourthCloudLayerTypeFlg = fourthCloudLayerTypeFlg;
    }

    public String getFourthCloudLayerTypeSts() {
        return fourthCloudLayerTypeSts;
    }

    public void setFourthCloudLayerTypeSts(String fourthCloudLayerTypeSts) {
        this.fourthCloudLayerTypeSts = fourthCloudLayerTypeSts;
    }

    public String getFourthCloudLayerHeightVal() {
        return fourthCloudLayerHeightVal;
    }

    public void setFourthCloudLayerHeightVal(String fourthCloudLayerHeightVal) {
        this.fourthCloudLayerHeightVal = fourthCloudLayerHeightVal;
    }

    public String getFourthCloudLayerHeightFlg() {
        return fourthCloudLayerHeightFlg;
    }

    public void setFourthCloudLayerHeightFlg(String fourthCloudLayerHeightFlg) {
        this.fourthCloudLayerHeightFlg = fourthCloudLayerHeightFlg;
    }

    public String getFourthCloudLayerHeightSts() {
        return fourthCloudLayerHeightSts;
    }

    public void setFourthCloudLayerHeightSts(String fourthCloudLayerHeightSts) {
        this.fourthCloudLayerHeightSts = fourthCloudLayerHeightSts;
    }

    public String getWindDirectn36Val() {
        return windDirectn36Val;
    }

    public void setWindDirectn36Val(String windDirectn36Val) {
        this.windDirectn36Val = windDirectn36Val;
    }

    public String getWindDirectn36Flg() {
        return windDirectn36Flg;
    }

    public void setWindDirectn36Flg(String windDirectn36Flg) {
        this.windDirectn36Flg = windDirectn36Flg;
    }

    public String getWindDirectn36Sts() {
        return windDirectn36Sts;
    }

    public void setWindDirectn36Sts(String windDirectn36Sts) {
        this.windDirectn36Sts = windDirectn36Sts;
    }

    public String getTotalPrecipVal() {
        return totalPrecipVal;
    }

    public void setTotalPrecipVal(String totalPrecipVal) {
        this.totalPrecipVal = totalPrecipVal;
    }

    public String getTotalPrecipFlg() {
        return totalPrecipFlg;
    }

    public void setTotalPrecipFlg(String totalPrecipFlg) {
        this.totalPrecipFlg = totalPrecipFlg;
    }

    public String getTotalPrecipSts() {
        return totalPrecipSts;
    }

    public void setTotalPrecipSts(String totalPrecipSts) {
        this.totalPrecipSts = totalPrecipSts;
    }

    public String getFreezingFogVal() {
        return freezingFogVal;
    }

    public void setFreezingFogVal(String freezingFogVal) {
        this.freezingFogVal = freezingFogVal;
    }

    public String getFreezingFogFlg() {
        return freezingFogFlg;
    }

    public void setFreezingFogFlg(String freezingFogFlg) {
        this.freezingFogFlg = freezingFogFlg;
    }

    public String getFreezingFogSts() {
        return freezingFogSts;
    }

    public void setFreezingFogSts(String freezingFogSts) {
        this.freezingFogSts = freezingFogSts;
    }

    public String getPrecipAmountMins0160Val() {
        return precipAmountMins0160Val;
    }

    public void setPrecipAmountMins0160Val(String precipAmountMins0160Val) {
        this.precipAmountMins0160Val = precipAmountMins0160Val;
    }

    public String getPrecipAmountMins0160Flg() {
        return precipAmountMins0160Flg;
    }

    public void setPrecipAmountMins0160Flg(String precipAmountMins0160Flg) {
        this.precipAmountMins0160Flg = precipAmountMins0160Flg;
    }

    public String getPrecipAmountMins0160Sts() {
        return precipAmountMins0160Sts;
    }

    public void setPrecipAmountMins0160Sts(String precipAmountMins0160Sts) {
        this.precipAmountMins0160Sts = precipAmountMins0160Sts;
    }

    public String getPrecipAmountMins0115Val() {
        return precipAmountMins0115Val;
    }

    public void setPrecipAmountMins0115Val(String precipAmountMins0115Val) {
        this.precipAmountMins0115Val = precipAmountMins0115Val;
    }

    public String getPrecipAmountMins0115Flg() {
        return precipAmountMins0115Flg;
    }

    public void setPrecipAmountMins0115Flg(String precipAmountMins0115Flg) {
        this.precipAmountMins0115Flg = precipAmountMins0115Flg;
    }

    public String getPrecipAmountMins0115Sts() {
        return precipAmountMins0115Sts;
    }

    public void setPrecipAmountMins0115Sts(String precipAmountMins0115Sts) {
        this.precipAmountMins0115Sts = precipAmountMins0115Sts;
    }

    public String getPrecipAmountMins1630Val() {
        return precipAmountMins1630Val;
    }

    public void setPrecipAmountMins1630Val(String precipAmountMins1630Val) {
        this.precipAmountMins1630Val = precipAmountMins1630Val;
    }

    public String getPrecipAmountMins1630Flg() {
        return precipAmountMins1630Flg;
    }

    public void setPrecipAmountMins1630Flg(String precipAmountMins1630Flg) {
        this.precipAmountMins1630Flg = precipAmountMins1630Flg;
    }

    public String getPrecipAmountMins1630Sts() {
        return precipAmountMins1630Sts;
    }

    public void setPrecipAmountMins1630Sts(String precipAmountMins1630Sts) {
        this.precipAmountMins1630Sts = precipAmountMins1630Sts;
    }

    public String getPrecipAmountMins3145Val() {
        return precipAmountMins3145Val;
    }

    public void setPrecipAmountMins3145Val(String precipAmountMins3145Val) {
        this.precipAmountMins3145Val = precipAmountMins3145Val;
    }

    public String getPrecipAmountMins3145Flg() {
        return precipAmountMins3145Flg;
    }

    public void setPrecipAmountMins3145Flg(String precipAmountMins3145Flg) {
        this.precipAmountMins3145Flg = precipAmountMins3145Flg;
    }

    public String getPrecipAmountMins3145Sts() {
        return precipAmountMins3145Sts;
    }

    public void setPrecipAmountMins3145Sts(String precipAmountMins3145Sts) {
        this.precipAmountMins3145Sts = precipAmountMins3145Sts;
    }

    public String getPrecipAmountMins4660Val() {
        return precipAmountMins4660Val;
    }

    public void setPrecipAmountMins4660Val(String precipAmountMins4660Val) {
        this.precipAmountMins4660Val = precipAmountMins4660Val;
    }

    public String getPrecipAmountMins4660Flg() {
        return precipAmountMins4660Flg;
    }

    public void setPrecipAmountMins4660Flg(String precipAmountMins4660Flg) {
        this.precipAmountMins4660Flg = precipAmountMins4660Flg;
    }

    public String getPrecipAmountMins4660Sts() {
        return precipAmountMins4660Sts;
    }

    public void setPrecipAmountMins4660Sts(String precipAmountMins4660Sts) {
        this.precipAmountMins4660Sts = precipAmountMins4660Sts;
    }

    public String getPrecipGuageWeightAt15Val() {
        return precipGuageWeightAt15Val;
    }

    public void setPrecipGuageWeightAt15Val(String precipGuageWeightAt15Val) {
        this.precipGuageWeightAt15Val = precipGuageWeightAt15Val;
    }

    public String getPrecipGuageWeightAt15Flg() {
        return precipGuageWeightAt15Flg;
    }

    public void setPrecipGuageWeightAt15Flg(String precipGuageWeightAt15Flg) {
        this.precipGuageWeightAt15Flg = precipGuageWeightAt15Flg;
    }

    public String getPrecipGuageWeightAt15Sts() {
        return precipGuageWeightAt15Sts;
    }

    public void setPrecipGuageWeightAt15Sts(String precipGuageWeightAt15Sts) {
        this.precipGuageWeightAt15Sts = precipGuageWeightAt15Sts;
    }

    public String getPrecipGuageWeightAt30Val() {
        return precipGuageWeightAt30Val;
    }

    public void setPrecipGuageWeightAt30Val(String precipGuageWeightAt30Val) {
        this.precipGuageWeightAt30Val = precipGuageWeightAt30Val;
    }

    public String getPrecipGuageWeightAt30Flg() {
        return precipGuageWeightAt30Flg;
    }

    public void setPrecipGuageWeightAt30Flg(String precipGuageWeightAt30Flg) {
        this.precipGuageWeightAt30Flg = precipGuageWeightAt30Flg;
    }

    public String getPrecipGuageWeightAt30Sts() {
        return precipGuageWeightAt30Sts;
    }

    public void setPrecipGuageWeightAt30Sts(String precipGuageWeightAt30Sts) {
        this.precipGuageWeightAt30Sts = precipGuageWeightAt30Sts;
    }

    public String getPrecipGuageWeightAt45Val() {
        return precipGuageWeightAt45Val;
    }

    public void setPrecipGuageWeightAt45Val(String precipGuageWeightAt45Val) {
        this.precipGuageWeightAt45Val = precipGuageWeightAt45Val;
    }

    public String getPrecipGuageWeightAt45Flg() {
        return precipGuageWeightAt45Flg;
    }

    public void setPrecipGuageWeightAt45Flg(String precipGuageWeightAt45Flg) {
        this.precipGuageWeightAt45Flg = precipGuageWeightAt45Flg;
    }

    public String getPrecipGuageWeightAt45Sts() {
        return precipGuageWeightAt45Sts;
    }

    public void setPrecipGuageWeightAt45Sts(String precipGuageWeightAt45Sts) {
        this.precipGuageWeightAt45Sts = precipGuageWeightAt45Sts;
    }

    public String getPrecipGuageWeightAt60Val() {
        return precipGuageWeightAt60Val;
    }

    public void setPrecipGuageWeightAt60Val(String precipGuageWeightAt60Val) {
        this.precipGuageWeightAt60Val = precipGuageWeightAt60Val;
    }

    public String getPrecipGuageWeightAt60Flg() {
        return precipGuageWeightAt60Flg;
    }

    public void setPrecipGuageWeightAt60Flg(String precipGuageWeightAt60Flg) {
        this.precipGuageWeightAt60Flg = precipGuageWeightAt60Flg;
    }

    public String getPrecipGuageWeightAt60Sts() {
        return precipGuageWeightAt60Sts;
    }

    public void setPrecipGuageWeightAt60Sts(String precipGuageWeightAt60Sts) {
        this.precipGuageWeightAt60Sts = precipGuageWeightAt60Sts;
    }

    public String getWindSpeed2mMins0115Val() {
        return windSpeed2mMins0115Val;
    }

    public void setWindSpeed2mMins0115Val(String windSpeed2mMins0115Val) {
        this.windSpeed2mMins0115Val = windSpeed2mMins0115Val;
    }

    public String getWindSpeed2mMins0115Flg() {
        return windSpeed2mMins0115Flg;
    }

    public void setWindSpeed2mMins0115Flg(String windSpeed2mMins0115Flg) {
        this.windSpeed2mMins0115Flg = windSpeed2mMins0115Flg;
    }

    public String getWindSpeed2mMins0115Sts() {
        return windSpeed2mMins0115Sts;
    }

    public void setWindSpeed2mMins0115Sts(String windSpeed2mMins0115Sts) {
        this.windSpeed2mMins0115Sts = windSpeed2mMins0115Sts;
    }

    public String getWindSpeed2mMins1630Val() {
        return windSpeed2mMins1630Val;
    }

    public void setWindSpeed2mMins1630Val(String windSpeed2mMins1630Val) {
        this.windSpeed2mMins1630Val = windSpeed2mMins1630Val;
    }

    public String getWindSpeed2mMins1630Flg() {
        return windSpeed2mMins1630Flg;
    }

    public void setWindSpeed2mMins1630Flg(String windSpeed2mMins1630Flg) {
        this.windSpeed2mMins1630Flg = windSpeed2mMins1630Flg;
    }

    public String getWindSpeed2mMins1630Sts() {
        return windSpeed2mMins1630Sts;
    }

    public void setWindSpeed2mMins1630Sts(String windSpeed2mMins1630Sts) {
        this.windSpeed2mMins1630Sts = windSpeed2mMins1630Sts;
    }

    public String getWindSpeed2mMins3145Val() {
        return windSpeed2mMins3145Val;
    }

    public void setWindSpeed2mMins3145Val(String windSpeed2mMins3145Val) {
        this.windSpeed2mMins3145Val = windSpeed2mMins3145Val;
    }

    public String getWindSpeed2mMins3145Flg() {
        return windSpeed2mMins3145Flg;
    }

    public void setWindSpeed2mMins3145Flg(String windSpeed2mMins3145Flg) {
        this.windSpeed2mMins3145Flg = windSpeed2mMins3145Flg;
    }

    public String getWindSpeed2mMins3145Sts() {
        return windSpeed2mMins3145Sts;
    }

    public void setWindSpeed2mMins3145Sts(String windSpeed2mMins3145Sts) {
        this.windSpeed2mMins3145Sts = windSpeed2mMins3145Sts;
    }

    public String getWindSpeed2mMins4660Val() {
        return windSpeed2mMins4660Val;
    }

    public void setWindSpeed2mMins4660Val(String windSpeed2mMins4660Val) {
        this.windSpeed2mMins4660Val = windSpeed2mMins4660Val;
    }

    public String getWindSpeed2mMins4660Flg() {
        return windSpeed2mMins4660Flg;
    }

    public void setWindSpeed2mMins4660Flg(String windSpeed2mMins4660Flg) {
        this.windSpeed2mMins4660Flg = windSpeed2mMins4660Flg;
    }

    public String getWindSpeed2mMins4660Sts() {
        return windSpeed2mMins4660Sts;
    }

    public void setWindSpeed2mMins4660Sts(String windSpeed2mMins4660Sts) {
        this.windSpeed2mMins4660Sts = windSpeed2mMins4660Sts;
    }

    public String getSnowDepthAt60Val() {
        return snowDepthAt60Val;
    }

    public void setSnowDepthAt60Val(String snowDepthAt60Val) {
        this.snowDepthAt60Val = snowDepthAt60Val;
    }

    public String getSnowDepthAt60Flg() {
        return snowDepthAt60Flg;
    }

    public void setSnowDepthAt60Flg(String snowDepthAt60Flg) {
        this.snowDepthAt60Flg = snowDepthAt60Flg;
    }

    public String getSnowDepthAt60Sts() {
        return snowDepthAt60Sts;
    }

    public void setSnowDepthAt60Sts(String snowDepthAt60Sts) {
        this.snowDepthAt60Sts = snowDepthAt60Sts;
    }

    public String getSnowDepthAt15Val() {
        return snowDepthAt15Val;
    }

    public void setSnowDepthAt15Val(String snowDepthAt15Val) {
        this.snowDepthAt15Val = snowDepthAt15Val;
    }

    public String getSnowDepthAt15Flg() {
        return snowDepthAt15Flg;
    }

    public void setSnowDepthAt15Flg(String snowDepthAt15Flg) {
        this.snowDepthAt15Flg = snowDepthAt15Flg;
    }

    public String getSnowDepthAt15Sts() {
        return snowDepthAt15Sts;
    }

    public void setSnowDepthAt15Sts(String snowDepthAt15Sts) {
        this.snowDepthAt15Sts = snowDepthAt15Sts;
    }

    public String getSnowDepthAt30Val() {
        return snowDepthAt30Val;
    }

    public void setSnowDepthAt30Val(String snowDepthAt30Val) {
        this.snowDepthAt30Val = snowDepthAt30Val;
    }

    public String getSnowDepthAt30Flg() {
        return snowDepthAt30Flg;
    }

    public void setSnowDepthAt30Flg(String snowDepthAt30Flg) {
        this.snowDepthAt30Flg = snowDepthAt30Flg;
    }

    public String getSnowDepthAt30Sts() {
        return snowDepthAt30Sts;
    }

    public void setSnowDepthAt30Sts(String snowDepthAt30Sts) {
        this.snowDepthAt30Sts = snowDepthAt30Sts;
    }

    public String getSnowDepthAt45Val() {
        return snowDepthAt45Val;
    }

    public void setSnowDepthAt45Val(String snowDepthAt45Val) {
        this.snowDepthAt45Val = snowDepthAt45Val;
    }

    public String getSnowDepthAt45Flg() {
        return snowDepthAt45Flg;
    }

    public void setSnowDepthAt45Flg(String snowDepthAt45Flg) {
        this.snowDepthAt45Flg = snowDepthAt45Flg;
    }

    public String getSnowDepthAt45Sts() {
        return snowDepthAt45Sts;
    }

    public void setSnowDepthAt45Sts(String snowDepthAt45Sts) {
        this.snowDepthAt45Sts = snowDepthAt45Sts;
    }

    public String getWindDir2mMins5960Val() {
        return windDir2mMins5960Val;
    }

    public void setWindDir2mMins5960Val(String windDir2mMins5960Val) {
        this.windDir2mMins5960Val = windDir2mMins5960Val;
    }

    public String getWindDir2mMins5960Flg() {
        return windDir2mMins5960Flg;
    }

    public void setWindDir2mMins5960Flg(String windDir2mMins5960Flg) {
        this.windDir2mMins5960Flg = windDir2mMins5960Flg;
    }

    public String getWindDir2mMins5960Sts() {
        return windDir2mMins5960Sts;
    }

    public void setWindDir2mMins5960Sts(String windDir2mMins5960Sts) {
        this.windDir2mMins5960Sts = windDir2mMins5960Sts;
    }

    public String getWindSpeed2mMins5960Val() {
        return windSpeed2mMins5960Val;
    }

    public void setWindSpeed2mMins5960Val(String windSpeed2mMins5960Val) {
        this.windSpeed2mMins5960Val = windSpeed2mMins5960Val;
    }

    public String getWindSpeed2mMins5960Flg() {
        return windSpeed2mMins5960Flg;
    }

    public void setWindSpeed2mMins5960Flg(String windSpeed2mMins5960Flg) {
        this.windSpeed2mMins5960Flg = windSpeed2mMins5960Flg;
    }

    public String getWindSpeed2mMins5960Sts() {
        return windSpeed2mMins5960Sts;
    }

    public void setWindSpeed2mMins5960Sts(String windSpeed2mMins5960Sts) {
        this.windSpeed2mMins5960Sts = windSpeed2mMins5960Sts;
    }

    public String getAltimeterVal() {
        return altimeterVal;
    }

    public void setAltimeterVal(String altimeterVal) {
        this.altimeterVal = altimeterVal;
    }

    public String getAltimeterFlg() {
        return altimeterFlg;
    }

    public void setAltimeterFlg(String altimeterFlg) {
        this.altimeterFlg = altimeterFlg;
    }

    public String getAltimeterSts() {
        return altimeterSts;
    }

    public void setAltimeterSts(String altimeterSts) {
        this.altimeterSts = altimeterSts;
    }

    public String getFrthCloudLayerOpacityVal() {
        return frthCloudLayerOpacityVal;
    }

    public void setFrthCloudLayerOpacityVal(String frthCloudLayerOpacityVal) {
        this.frthCloudLayerOpacityVal = frthCloudLayerOpacityVal;
    }

    public String getFrthCloudLayerOpacityFlg() {
        return frthCloudLayerOpacityFlg;
    }

    public void setFrthCloudLayerOpacityFlg(String frthCloudLayerOpacityFlg) {
        this.frthCloudLayerOpacityFlg = frthCloudLayerOpacityFlg;
    }

    public String getFrthCloudLayerOpacitySts() {
        return frthCloudLayerOpacitySts;
    }

    public void setFrthCloudLayerOpacitySts(String frthCloudLayerOpacitySts) {
        this.frthCloudLayerOpacitySts = frthCloudLayerOpacitySts;
    }

    public String getFrthCloudLayerAmountVal() {
        return frthCloudLayerAmountVal;
    }

    public void setFrthCloudLayerAmountVal(String frthCloudLayerAmountVal) {
        this.frthCloudLayerAmountVal = frthCloudLayerAmountVal;
    }

    public String getFrthCloudLayerAmountFlg() {
        return frthCloudLayerAmountFlg;
    }

    public void setFrthCloudLayerAmountFlg(String frthCloudLayerAmountFlg) {
        this.frthCloudLayerAmountFlg = frthCloudLayerAmountFlg;
    }

    public String getFrthCloudLayerAmountSts() {
        return frthCloudLayerAmountSts;
    }

    public void setFrthCloudLayerAmountSts(String frthCloudLayerAmountSts) {
        this.frthCloudLayerAmountSts = frthCloudLayerAmountSts;
    }

    public String getFrthCloudLayerTypeVal() {
        return frthCloudLayerTypeVal;
    }

    public void setFrthCloudLayerTypeVal(String frthCloudLayerTypeVal) {
        this.frthCloudLayerTypeVal = frthCloudLayerTypeVal;
    }

    public String getFrthCloudLayerTypeFlg() {
        return frthCloudLayerTypeFlg;
    }

    public void setFrthCloudLayerTypeFlg(String frthCloudLayerTypeFlg) {
        this.frthCloudLayerTypeFlg = frthCloudLayerTypeFlg;
    }

    public String getFrthCloudLayerTypeSts() {
        return frthCloudLayerTypeSts;
    }

    public void setFrthCloudLayerTypeSts(String frthCloudLayerTypeSts) {
        this.frthCloudLayerTypeSts = frthCloudLayerTypeSts;
    }

    public String getFrthCloudLayerHeightVal() {
        return frthCloudLayerHeightVal;
    }

    public void setFrthCloudLayerHeightVal(String frthCloudLayerHeightVal) {
        this.frthCloudLayerHeightVal = frthCloudLayerHeightVal;
    }

    public String getFrthCloudLayerHeightFlg() {
        return frthCloudLayerHeightFlg;
    }

    public void setFrthCloudLayerHeightFlg(String frthCloudLayerHeightFlg) {
        this.frthCloudLayerHeightFlg = frthCloudLayerHeightFlg;
    }

    public String getFrthCloudLayerHeightSts() {
        return frthCloudLayerHeightSts;
    }

    public void setFrthCloudLayerHeightSts(String frthCloudLayerHeightSts) {
        this.frthCloudLayerHeightSts = frthCloudLayerHeightSts;
    }

    public String getFifthCloudLayerOpacityVal() {
        return fifthCloudLayerOpacityVal;
    }

    public void setFifthCloudLayerOpacityVal(String fifthCloudLayerOpacityVal) {
        this.fifthCloudLayerOpacityVal = fifthCloudLayerOpacityVal;
    }

    public String getFifthCloudLayerOpacityFlg() {
        return fifthCloudLayerOpacityFlg;
    }

    public void setFifthCloudLayerOpacityFlg(String fifthCloudLayerOpacityFlg) {
        this.fifthCloudLayerOpacityFlg = fifthCloudLayerOpacityFlg;
    }

    public String getFifthCloudLayerOpacitySts() {
        return fifthCloudLayerOpacitySts;
    }

    public void setFifthCloudLayerOpacitySts(String fifthCloudLayerOpacitySts) {
        this.fifthCloudLayerOpacitySts = fifthCloudLayerOpacitySts;
    }

    public String getFifthCloudLayerAmountVal() {
        return fifthCloudLayerAmountVal;
    }

    public void setFifthCloudLayerAmountVal(String fifthCloudLayerAmountVal) {
        this.fifthCloudLayerAmountVal = fifthCloudLayerAmountVal;
    }

    public String getFifthCloudLayerAmountFlg() {
        return fifthCloudLayerAmountFlg;
    }

    public void setFifthCloudLayerAmountFlg(String fifthCloudLayerAmountFlg) {
        this.fifthCloudLayerAmountFlg = fifthCloudLayerAmountFlg;
    }

    public String getFifthCloudLayerAmountSts() {
        return fifthCloudLayerAmountSts;
    }

    public void setFifthCloudLayerAmountSts(String fifthCloudLayerAmountSts) {
        this.fifthCloudLayerAmountSts = fifthCloudLayerAmountSts;
    }

    public String getFifthCloudLayerTypeVal() {
        return fifthCloudLayerTypeVal;
    }

    public void setFifthCloudLayerTypeVal(String fifthCloudLayerTypeVal) {
        this.fifthCloudLayerTypeVal = fifthCloudLayerTypeVal;
    }

    public String getFifthCloudLayerTypeFlg() {
        return fifthCloudLayerTypeFlg;
    }

    public void setFifthCloudLayerTypeFlg(String fifthCloudLayerTypeFlg) {
        this.fifthCloudLayerTypeFlg = fifthCloudLayerTypeFlg;
    }

    public String getFifthCloudLayerTypeSts() {
        return fifthCloudLayerTypeSts;
    }

    public void setFifthCloudLayerTypeSts(String fifthCloudLayerTypeSts) {
        this.fifthCloudLayerTypeSts = fifthCloudLayerTypeSts;
    }

    public String getFifthCloudLayerHeightVal() {
        return fifthCloudLayerHeightVal;
    }

    public void setFifthCloudLayerHeightVal(String fifthCloudLayerHeightVal) {
        this.fifthCloudLayerHeightVal = fifthCloudLayerHeightVal;
    }

    public String getFifthCloudLayerHeightFlg() {
        return fifthCloudLayerHeightFlg;
    }

    public void setFifthCloudLayerHeightFlg(String fifthCloudLayerHeightFlg) {
        this.fifthCloudLayerHeightFlg = fifthCloudLayerHeightFlg;
    }

    public String getFifthCloudLayerHeightSts() {
        return fifthCloudLayerHeightSts;
    }

    public void setFifthCloudLayerHeightSts(String fifthCloudLayerHeightSts) {
        this.fifthCloudLayerHeightSts = fifthCloudLayerHeightSts;
    }

    public String getSixthCloudLayerOpacityVal() {
        return sixthCloudLayerOpacityVal;
    }

    public void setSixthCloudLayerOpacityVal(String sixthCloudLayerOpacityVal) {
        this.sixthCloudLayerOpacityVal = sixthCloudLayerOpacityVal;
    }

    public String getSixthCloudLayerOpacityFlg() {
        return sixthCloudLayerOpacityFlg;
    }

    public void setSixthCloudLayerOpacityFlg(String sixthCloudLayerOpacityFlg) {
        this.sixthCloudLayerOpacityFlg = sixthCloudLayerOpacityFlg;
    }

    public String getSixthCloudLayerOpacitySts() {
        return sixthCloudLayerOpacitySts;
    }

    public void setSixthCloudLayerOpacitySts(String sixthCloudLayerOpacitySts) {
        this.sixthCloudLayerOpacitySts = sixthCloudLayerOpacitySts;
    }

    public String getSixthCloudLayerAmountVal() {
        return sixthCloudLayerAmountVal;
    }

    public void setSixthCloudLayerAmountVal(String sixthCloudLayerAmountVal) {
        this.sixthCloudLayerAmountVal = sixthCloudLayerAmountVal;
    }

    public String getSixthCloudLayerAmountFlg() {
        return sixthCloudLayerAmountFlg;
    }

    public void setSixthCloudLayerAmountFlg(String sixthCloudLayerAmountFlg) {
        this.sixthCloudLayerAmountFlg = sixthCloudLayerAmountFlg;
    }

    public String getSixthCloudLayerAmountSts() {
        return sixthCloudLayerAmountSts;
    }

    public void setSixthCloudLayerAmountSts(String sixthCloudLayerAmountSts) {
        this.sixthCloudLayerAmountSts = sixthCloudLayerAmountSts;
    }

    public String getSixthCloudLayerTypeVal() {
        return sixthCloudLayerTypeVal;
    }

    public void setSixthCloudLayerTypeVal(String sixthCloudLayerTypeVal) {
        this.sixthCloudLayerTypeVal = sixthCloudLayerTypeVal;
    }

    public String getSixthCloudLayerTypeFlg() {
        return sixthCloudLayerTypeFlg;
    }

    public void setSixthCloudLayerTypeFlg(String sixthCloudLayerTypeFlg) {
        this.sixthCloudLayerTypeFlg = sixthCloudLayerTypeFlg;
    }

    public String getSixthCloudLayerTypeSts() {
        return sixthCloudLayerTypeSts;
    }

    public void setSixthCloudLayerTypeSts(String sixthCloudLayerTypeSts) {
        this.sixthCloudLayerTypeSts = sixthCloudLayerTypeSts;
    }

    public String getSixthCloudLayerHeightVal() {
        return sixthCloudLayerHeightVal;
    }

    public void setSixthCloudLayerHeightVal(String sixthCloudLayerHeightVal) {
        this.sixthCloudLayerHeightVal = sixthCloudLayerHeightVal;
    }

    public String getSixthCloudLayerHeightFlg() {
        return sixthCloudLayerHeightFlg;
    }

    public void setSixthCloudLayerHeightFlg(String sixthCloudLayerHeightFlg) {
        this.sixthCloudLayerHeightFlg = sixthCloudLayerHeightFlg;
    }

    public String getSixthCloudLayerHeightSts() {
        return sixthCloudLayerHeightSts;
    }

    public void setSixthCloudLayerHeightSts(String sixthCloudLayerHeightSts) {
        this.sixthCloudLayerHeightSts = sixthCloudLayerHeightSts;
    }

    public String getWindCharacterVal() {
        return windCharacterVal;
    }

    public void setWindCharacterVal(String windCharacterVal) {
        this.windCharacterVal = windCharacterVal;
    }

    public String getWindCharacterFlg() {
        return windCharacterFlg;
    }

    public void setWindCharacterFlg(String windCharacterFlg) {
        this.windCharacterFlg = windCharacterFlg;
    }

    public String getWindCharacterSts() {
        return windCharacterSts;
    }

    public void setWindCharacterSts(String windCharacterSts) {
        this.windCharacterSts = windCharacterSts;
    }

    public String getWindGustSpeedVal() {
        return windGustSpeedVal;
    }

    public void setWindGustSpeedVal(String windGustSpeedVal) {
        this.windGustSpeedVal = windGustSpeedVal;
    }

    public String getWindGustSpeedFlg() {
        return windGustSpeedFlg;
    }

    public void setWindGustSpeedFlg(String windGustSpeedFlg) {
        this.windGustSpeedFlg = windGustSpeedFlg;
    }

    public String getWindGustSpeedSts() {
        return windGustSpeedSts;
    }

    public void setWindGustSpeedSts(String windGustSpeedSts) {
        this.windGustSpeedSts = windGustSpeedSts;
    }

    public String getPrecipitationUnclassifiedVal() {
        return precipitationUnclassifiedVal;
    }

    public void setPrecipitationUnclassifiedVal(String precipitationUnclassifiedVal) {
        this.precipitationUnclassifiedVal = precipitationUnclassifiedVal;
    }

    public String getPrecipitationUnclassifiedFlg() {
        return precipitationUnclassifiedFlg;
    }

    public void setPrecipitationUnclassifiedFlg(String precipitationUnclassifiedFlg) {
        this.precipitationUnclassifiedFlg = precipitationUnclassifiedFlg;
    }

    public String getPrecipitationUnclassifiedSts() {
        return precipitationUnclassifiedSts;
    }

    public void setPrecipitationUnclassifiedSts(String precipitationUnclassifiedSts) {
        this.precipitationUnclassifiedSts = precipitationUnclassifiedSts;
    }
}
