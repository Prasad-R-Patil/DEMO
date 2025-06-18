namespace StudentInterviewApp;
public delegate void InterviewBasket(string name);
internal class Student
{
    public event InterviewBasket OnSelection;
    public event InterviewBasket OnRejection;
    public int Id { get; set; }
    public string ContactName { get; set; } = string.Empty;
    public string City { get; set; } = string.Empty;
    public int TotalMarks { get; set; }

    //public string CalculateResult(int totalMarks,out string companyName)
    public string CalculateResult(int totalMarks, ref string companyName)
    {
        if (totalMarks > 80)
        {
            companyName = "Synechron";
            if (OnSelection!=null)
            {
                OnSelection($"ContactName - {ContactName} - Company {companyName}");
            }
            
            return $"{ContactName} has been selected for Hr Round!";
        }
        else
        {
            if (OnRejection != null)
            {
                OnRejection($"ContactName - {ContactName} - Company {companyName}");
            }
            //companyName = "No Company Name";
            return $"{ContactName} has been Rejected for Hr Round!";
        }
    }
    public void CompaniesList(string state, params string[] companyNames)
    {
        Console.WriteLine($"From State - {state} - There is/are companies - ");
        for (int i = 0; i < companyNames.Length; i++)
        {
            Console.Write($"{companyNames[i]} , ");
        }
        Console.WriteLine("");
    }

}
