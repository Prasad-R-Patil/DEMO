namespace StudentInterviewApp;

internal class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Welcome To Interview Application!");
		try
		{
			Student student = new Student();
            student.OnSelection += new InterviewBasket(OracleDb);
            student.OnRejection += SqlServerDb;
            student.Id = 2389;
			student.ContactName = "Alisha C.";
			student.City = "Mumbai";
			student.TotalMarks = 98;
            if (student.TotalMarks>95)
            {
                student.OnSelection += ExcelDb;
            }
            else
            {
                student.OnSelection -= ExcelDb;
            }
                string companyName = "Infoway";
            Console.WriteLine(student.CalculateResult(student.TotalMarks,ref companyName));
            Console.WriteLine(companyName);
			student.CompaniesList("Maharashtra", "Infosys", "IBM");
            student.CompaniesList("Karnataka", "Bajaj", "Synechron","Infosys","TCS");
        }
		catch (Exception ex)
		{
            Console.WriteLine(ex.Message);
		}
    }
    private static void OracleDb(string value)
    {
        Console.WriteLine($"Selected {value} has been stored in Oracle Database!");
    }
    private static void ExcelDb(string value)
    {
        Console.WriteLine($"Selected {value} has been stored in Excel Database!");
    }
    private static void SqlServerDb(string value)
    {
        Console.WriteLine($"Rejected {value} has been stored in Microsoft SQL Server Database!");
    }
}