namespace FirstConsoleApp
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //Console.WriteLine("Welcome To Infoway Pvt. Ltd.");
            //Console.WriteLine("Welcome To India!");
            //Console.WriteLine("Welcome To Maharashtra!");
            
            try
            {
                Console.WriteLine("Please enter your age!");
                int age = int.Parse(Console.ReadLine());

                if (age >= 80)
                {
                    Console.WriteLine("You can not travel by airways!");
                }
                else
                {
                    Console.WriteLine("You can travel by airways!");
                }
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
    }
}
