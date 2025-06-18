namespace AtmTransction;
public delegate void MessageBash(int value);
internal class Transition
{
    public readonly int Fd=500000;

    public event MessageBash oncontact;

    public event MessageBash onSlip;

    public int CardNo { get; set; }

    public int CardPIN { get; set; }

    public int WithdrawAmt { get; set; }

    public long MobileNo { get; set; }

    public Boolean Slip { get; set; }


    public void Withdrow()
    {
        if (WithdrawAmt > Fd)
        {
            Console.WriteLine("Exception");
        }
        else
        {
            if (oncontact != null) {
                if (MobileNo != 0)
                {
                    oncontact(WithdrawAmt);

                }

            }

            if (onSlip != null) {
                if (Slip == true)
                {
                    onSlip(WithdrawAmt);
                }

            }

            
        }

        
    }

}
