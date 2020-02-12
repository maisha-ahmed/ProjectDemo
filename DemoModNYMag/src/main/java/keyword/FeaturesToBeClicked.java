package keyword;

import common.CommonAPI;
import utility.DataReader;

import java.io.IOException;

public class FeaturesToBeClicked extends CommonAPI
{
    DataReader dr = new DataReader();
    public String[] getDataFromExcelFile() throws IOException
    {
        String path = System.getProperty("user.dir")+"/data/nymagfile6.xls";
        String [] data = dr.fileReader2(path,0);
        return data;
    }
    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException
    {
        String path = System.getProperty("user.dir")+"/data/nymagfile3.xls";
        String [] data = dr.fileReader2(path,0);
        return data;
    }
}
