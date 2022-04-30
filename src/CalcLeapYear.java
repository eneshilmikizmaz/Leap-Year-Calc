public class CalcLeapYear {
    public String leapYear(int year){
        String success = year + " Artık Yıldır !";
        String fail = year + " Artık Yıl Değildir !";
        if(year%4==0){
            return success;
        }else if(year%100==0&&year%400==0){
            return success;
        }else{
            return fail;
        }
    }
}
