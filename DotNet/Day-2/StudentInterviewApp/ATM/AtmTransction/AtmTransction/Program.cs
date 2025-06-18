namespace AtmTransction;

internal class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Welcome Prasads ATM");

        try
        {
            Transition transition = new Transition();

            Console.WriteLine("Enter Your Card Number 5 Digit only");
            int cadrNo= int.Parse(Console.ReadLine());
            transition.CardNo = cadrNo;

            Console.WriteLine("Enter Your 4 Digit Pin");
            int pin= int.Parse(Console.ReadLine());
            transition.CardPIN = pin;


            Console.WriteLine("Enter Withrow Amount");
            int withdrow = int.Parse(Console.ReadLine());
            transition.WithdrawAmt = withdrow;

            Console.WriteLine("Can you Register Your Mobile Number (Y/N)");
            String ch = Console.ReadLine();

            //ch.ToLower();

            if (ch == "Y")
            {
                Console.WriteLine("Enter Your Mobile No");
                long mobileNo = long.Parse(Console.ReadLine());
                transition.MobileNo = mobileNo;

                transition.oncontact += new MessageBash(Momsg);
            }
            else
            {
                transition.MobileNo = 0;
                Console.WriteLine("Ok");
            }

            Console.WriteLine("Do you Want Trasition Slip (Y/N)");
            String ch1 = Console.ReadLine();

            //ch1.ToLower();

            if (ch1 == "Y")
            {
                transition.Slip = true;
                transition.onSlip += new MessageBash(Slip);
            }
            else
            {
                transition.Slip = false;
                Console.WriteLine("Ok");
            }

            transition.Withdrow();


        }
        catch (Exception ex)
        {
            Console.WriteLine(ex.Message);
        }
    }

    public static void Slip(int value) {

        Console.WriteLine($"Withdrow Successful {value}");
    }

    public static void Momsg(int value) {
        Console.WriteLine($"Your Transition is Complete Take Your Money {value}");
    }
}
