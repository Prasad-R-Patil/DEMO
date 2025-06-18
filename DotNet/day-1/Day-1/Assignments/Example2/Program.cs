namespace Example2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Please enter 5 numbers!");
            int no1 = int.Parse(Console.ReadLine());
            int no2 = int.Parse(Console.ReadLine());
            int no3 = int.Parse(Console.ReadLine());
            int no4 = int.Parse(Console.ReadLine());
            int no5 = int.Parse(Console.ReadLine());
            int avg = (no1 + no2 + no3 + no4 + no5) / 5;
            //Console.WriteLine("Averge of 5 nos is " + avg);
            Console.WriteLine($"Averge of 5 nos is " +
                $"{avg}!");
        }
    }
}
