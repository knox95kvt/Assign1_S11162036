package methods;

public class Rate {
    public static float computeInterestRate(int iNumberOfYears, int iNumberOfMonths){
        float rate;
        if (iNumberOfYears == 0){
            if(1 <= iNumberOfMonths && iNumberOfMonths < 3){
                rate = 1.0f;
            }
            else if (3 <= iNumberOfMonths && iNumberOfMonths <= 5){
                rate = 3.5f;
            }
            else if (6 <= iNumberOfMonths && iNumberOfMonths <= 11){
                rate = 4.5f;
            }
            else {
                rate = -1.0f;
            }
        }
        else{
            if (iNumberOfYears == 1){
                rate = 5.0f;
            }
            else if(iNumberOfYears >= 2){
                rate = 5.5f;
            }
            else{
                rate = -1.0f;
            }
        }

        return rate;

    }
}
