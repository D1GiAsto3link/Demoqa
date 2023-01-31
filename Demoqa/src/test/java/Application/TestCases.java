/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;



public class TestCases {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //set up chrome driver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @DataProvider(name = "testData")
    public Object[][] getData() throws IOException {
        //Open the excel file
        File file = new File("path/to/excel.xlsx");
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);

        //get the number of rows and columns
        int rowCount = sheet.getLastRowNum();
        int colCount = sheet.getRow(0).getLastCellNum();

        //create a 2D array to store the test data
        Object[][] data = new Object[rowCount][colCount];

        //loop through the rows and columns to get the data
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
            }
        }
        return data;
    }

    @Test(dataProvider = "testData")
    public void testCase(String username, String password) {
        driver.get("https://www.example.com");
        //use the data from the Excel sheet to perform actions on the website
        //e.g. login with the given username and password
    }
}*/
