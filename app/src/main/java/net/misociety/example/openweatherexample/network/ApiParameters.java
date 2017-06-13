package net.misociety.example.openweatherexample.network;

/**
 * Created by jaesunlee on 2017. 6. 9..
 * ApiParameters
 */

public class ApiParameters
{
    public static final String API_WEATHER = "weather";
    public static final String API_BOX_CITY = "box/city";
    public static final String API_FIND = "find";
    public static final String API_GROUP = "group";

    public static final String Q = "q"; // City Name
    public static final String ID = "id"; // City Id
    public static final String LAT = "lat"; // Geographic Coordinates (Latitude)
    public static final String LON = "lon"; // Geographic Coordinates (Longitude)
    public static final String ZIP = "zip"; // Zip Code
    public static final String CNT = "cnt"; // Number of Cities (less than 50)
    public static final String LANG = "lang"; // Language
    public static final String BBOX = "bbox"; // Bounding Box (lon-left, lat-bottom, lon-right, lat-top, zoom)
    public static final String MODE = "mode"; // Format (Json is used by Default)
    public static final String TYPE = "type"; // Search Accuracy
    public static final String UNITS = "units"; // Units For Temperature (Kelvin is used by Default)

    public static final String MODE_XML = "xml"; // XML
    public static final String MODE_HTML = "html"; // HTML

    public static final String TYPE_LIKE = "like"; // Close Result
    public static final String TYPE_ACCURATE = "accurate"; // Accurate Result

    public static final String UNITS_METRIC = "metric"; // Celsius
    public static final String UNITS_IMPERIAL = "imperial"; // Fahrenheit

    public static final String LANG_EN = "en"; // English
    public static final String LANG_KR = "kr"; // Korean
    public static final String LANG_JA = "ja"; // Japanese
    public static final String LANG_VI = "vi"; // Vietnamese
    public static final String LANG_ZH_CN = "zh_cn"; // Chinese
    public static final String LANG_ZH_TW = "zh_tw"; // Taiwanese
}
