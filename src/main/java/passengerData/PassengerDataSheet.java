package passengerData;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PassengerDataSheet {

    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    static String cellData2;

    static long cellData3;

    static String cellData6;



    public PassengerDataSheet(String excelPath2, String excelSheet2) {

        try {
            workbook = new XSSFWorkbook(excelPath2);
            sheet = workbook.getSheet(excelSheet2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static String getCellData2(int rowNum2, int colNum2 ) {

        try {
            cellData2 = sheet.getRow(rowNum2).getCell(colNum2).getStringCellValue();
        }catch (Exception exp){
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }

        return cellData2;
    }



    public static String getCellData3(int rowNum3, int colNum3 ) {

        try {
            cellData3 = (long) sheet.getRow(rowNum3).getCell(colNum3).getNumericCellValue();
            cellData6 = Long.toString(cellData3);
        }catch (Exception exp){
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }

        return cellData6;
    }

}
