package newutility;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* This data reader has been updated by Maisha Ahmed to allow users to use .xlsx files in their hybrid frameworks.
    1. Add a new maven dependency specifically for xlsx files to the root pom and Generic pom:
    https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml/3.17
    2. Check that the poms can compile
    3. If you cloned or downloaded my project, then you can copy my "newutility" package and paste it into your Generic
    module. Else, make a new package and copy and paste the NewDataReader class from github into your own project.
    4. Open a new excel workbook, add the keywords, and save it as a .xlsx file
    5. Copy and paste the .xlsx file into the "data" directory in your module
    6. In your "FeaturesToBe[insert verb here]" class, you need to make a new object of the NewDataReader class and
    write a new method for IntelliJ to read data from your new excel file. Or you can copy and paste mine. Either way is fine.
    Make sure that the path for your excel file is correct.
    ***My Features and FeaturesToBeClicked classes are inside the"keyword" package, which is inside the DemoModNYMag module.
    Here's the path: DemoModNYMag/src/main/java/keyword.***
    7. In your Features class, scroll down to the selectFeatures() method, and change the method inside the loop from
    "getDataFromExcelFile()"/"getDataFromExcelFileForFeaturesChoice()" to the new method "getDataFromXLSXFile()"
    8. Run your keyword-driven tests from the test runner. Do let me know if it actually works.
 */

public class NewDataReader
{
    XSSFWorkbook wb = null;
    XSSFSheet sheet = null;
    Cell cell = null;
    FileOutputStream fio = null;
    int numberOfRows, numOfColumns, rowNum;

    public String[][] fileReader1(String path, int sheetIndex) throws IOException
    {
        String[][] data = {};
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        wb = new XSSFWorkbook(fis);
        sheet = wb.getSheetAt(sheetIndex);
        numberOfRows = sheet.getLastRowNum();
        numOfColumns = sheet.getRow(0).getLastCellNum();
        data = new String[numberOfRows + 1][numOfColumns + 1];

        for (int i = 1; i < data.length; i++)
        {
            XSSFRow rows = sheet.getRow(i);
            for (int j = 0; j < numOfColumns; j++)
            {
                XSSFCell cell = rows.getCell(j);
                String cellData = getCellValue(cell);
                data[i][j] = cellData;
            }
        }
        return data;
    }
    public String[] fileReader2(String path, int sheetIndex) throws IOException
    {
        String[] data = {};
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        wb = new XSSFWorkbook(fis);
        sheet = wb.getSheetAt(sheetIndex);
        numberOfRows = sheet.getLastRowNum();
        numOfColumns = sheet.getRow(0).getLastCellNum();
        data = new String[numberOfRows + 1];

        for (int i = 1; i < data.length; i++) {
            XSSFRow rows = sheet.getRow(i);
            for (int j = 0; j < numOfColumns; j++) {
                XSSFCell cell = rows.getCell(j);
                String cellData = getCellValue(cell);
                data[i] = cellData;
            }
        }
        return data;
    }
    public String getCellValue(XSSFCell cell)
    {
        Object value = null;

        int dataType = cell.getCellType();
        switch (dataType) {
            case XSSFCell.CELL_TYPE_NUMERIC:
                value = cell.getNumericCellValue();
                break;
            case XSSFCell.CELL_TYPE_STRING:
                value = cell.getStringCellValue();
                break;
            case XSSFCell.CELL_TYPE_BOOLEAN:
                value = cell.getBooleanCellValue();
                break;
        }
        return value.toString();
    }
    public void writeBack(String value) throws IOException
    {
        wb = new XSSFWorkbook();
        sheet = wb.createSheet();
        Row row = sheet.createRow(rowNum);
        row.setHeightInPoints(10);

        fio = new FileOutputStream(new File("ExcelFile.xls"));
        wb.write(fio);
        for (int i = 0; i < row.getLastCellNum(); i++) {
            row.createCell(i);
            cell.setCellValue(value);
        }
        fio.close();
        wb.close();
    }
}
