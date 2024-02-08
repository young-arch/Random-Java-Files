public class ProMonth {
    private int monthNumber;

    public ProMonth() {
        monthNumber = 1;
    }

    public ProMonth(int monNum) {
        monthNumber = monNum;
        if (monthNumber < 1 || monthNumber > 12) {
            monthNumber = 1;
        }
    }

    public ProMonth(String monName) {
        if (monName == "January") {
            monthNumber = 1;
        } else if (monName == "February") {
            monthNumber = 2;
        } else if (monName == "March") {
            monthNumber = 3;
        } else if (monName == "April") {
            monthNumber = 4;
        } else if (monName == "May") {
            monthNumber = 5;
        } else if (monName == "June") {
            monthNumber = 6;
        } else if (monName == "July") {
            monthNumber = 7;
        } else if (monName == "August") {
            monthNumber = 8;
        } else if (monName == "September") {
            monthNumber = 9;
        } else if (monName == "October") {
            monthNumber = 10;
        } else if (monName == "November") {
            monthNumber = 11;
        } else if (monName == "December") {
            monthNumber = 12;
        }
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        String monName;
        if (monthNumber == 1) {
            monName = "January";
        } else if (monthNumber == 2) {
            monName = "February";
        } else if (monthNumber == 3) {
            monName = "March";
        } else if (monthNumber == 4) {
            monName = "April";
        } else if (monthNumber == 5) {
            monName = "May";
        } else if (monthNumber == 6) {
            monName = "June";
        } else if (monthNumber == 7) {
            monName = "July";
        } else if (monthNumber == 8) {
            monName = "August";
        } else if (monthNumber == 9) {
            monName = "September";
        } else if (monthNumber == 10) {
            monName = "October";
        } else if (monthNumber == 11) {
            monName = "November";
        } else if (monthNumber == 12) {
            monName = "December";
        }
        return monName;
    }

}
